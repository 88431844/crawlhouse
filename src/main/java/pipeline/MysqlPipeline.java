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
        if (!StringUtils.isEmpty(houseInfoDto.getPayType())){
            String newPayType = houseInfoDto.getPayType()
                    .replace("元/月（","")
                    .replace("）","");
            houseInfoDto.setPayType(newPayType);
        }
        if (!StringUtils.isEmpty(houseInfoDto.getAreaStr())){
            String newArea = houseInfoDto.getAreaStr().replace("平米","")
                     .replace("平方米","");
            houseInfoDto.setArea(Integer.parseInt(newArea));
        }
        if (!StringUtils.isEmpty(houseInfoDto.getReleaseDate())){
            String newReleaseDate = houseInfoDto.getReleaseDate()
                    .replace("更新时间 ","")
                .replace("发布时间：","")
                .replace("年","-")
                .replace("月","-")
                .replace("日","");
            houseInfoDto.setReleaseDate(newReleaseDate);
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
