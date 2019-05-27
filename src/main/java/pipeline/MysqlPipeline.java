package pipeline;

import com.alibaba.fastjson.JSON;
import dao.HouseInfoMapper;
import dto.HouseInfoDto;
import entity.HouseInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;

@Component
public class MysqlPipeline implements PageModelPipeline<HouseInfoDto> {
    @Resource
    private HouseInfoMapper houseInfoMapper;

    @Override
    public void process(HouseInfoDto houseInfoDto, Task task) {
        if (!StringUtils.isEmpty(houseInfoDto.getFristImg())){
            if (!houseInfoDto.getFristImg().contains("http")){
                String newFiristImg = "http:"+houseInfoDto.getFristImg();
                houseInfoDto.setFristImg(newFiristImg);
            }
        }
        if (!StringUtils.isEmpty(houseInfoDto.getPayType())){
            String newPayType = houseInfoDto.getPayType()
                    .replace("元/月（","")
                    .replace("元/月 (","")
                    .replace(")","")
                    .replace("元/月 ","月付")
                    .replace("）","");
            houseInfoDto.setPayType(newPayType);
        }
        if (!StringUtils.isEmpty(houseInfoDto.getAreaStr())){
            String newArea = houseInfoDto.getAreaStr()
                .replace("平米","")
                .replace("㎡","")
                .replace("平方米","");
            houseInfoDto.setArea(Integer.parseInt(newArea));
        }
        if (!StringUtils.isEmpty(houseInfoDto.getReleaseDate())){
            String newReleaseDate = houseInfoDto.getReleaseDate()
                    .replace("更新时间 ","")
                .replace("发布时间：","")
                .replace("年","-")
                .replace("月","-")
                .replace(" 房源上架时间 ","")
                .replace("日","");
            houseInfoDto.setReleaseDate(newReleaseDate);
        }
        if (!StringUtils.isEmpty(houseInfoDto.getFloor())){
            String newFloor = houseInfoDto.getFloor()
                .replace("楼层：高楼层/","")
                .replace("楼层：中楼层/","")
                .replace("楼层：低楼层/","")
                .replace("层","")
                .replace("楼：","")
                .replace("楼层：高楼层/","");
            houseInfoDto.setFloor(newFloor);
        }
        if (StringUtils.isEmpty(houseInfoDto.getDecoration())){
            houseInfoDto.setDecoration("未知");
        }
        if ("租赁方式未知".equals(houseInfoDto.getRentType())){
            houseInfoDto.setRentType("未知");
        }
        if (StringUtils.isEmpty(houseInfoDto.getAddr())){
            String newAddr;
            String houseTitle = houseInfoDto.getTitle();
            if (houseTitle.contains("·")){
                newAddr = houseTitle.split("·")[1].split(" ")[0];
            }else {
                newAddr = houseTitle.split(" ")[0];
            }
            houseInfoDto.setAddr(newAddr);
        }
        System.out.println("------ MysqlPipeline process : " + JSON.toJSONString(houseInfoDto));

        if (!StringUtils.isEmpty(houseInfoDto.getTitle())){
            HouseInfo houseInfo = new HouseInfo();
            BeanUtils.copyProperties(houseInfoDto,houseInfo);
            houseInfo.setMonthlyRent(Integer.parseInt(houseInfoDto.getMonthlyRentStr()));
            if (0 == houseInfoMapper.haveHouseInfo(houseInfo)){
                houseInfoMapper.insertSelective(houseInfo);
            }
        }
    }
}
