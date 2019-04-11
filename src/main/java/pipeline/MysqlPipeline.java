package pipeline;

import com.alibaba.fastjson.JSON;
import dao.HouseInfoMapper;
import entity.HouseInfo;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;

@Component
public class MysqlPipeline implements PageModelPipeline<HouseInfo> {
    @Resource
    private HouseInfoMapper houseInfoMapper;

    @Override
    public void process(HouseInfo houseInfo, Task task) {
        System.out.println("------ MysqlPipeline process : " + JSON.toJSONString(houseInfo));
        if (!StringUtils.isEmpty(houseInfo.getTitle())){
            if (0 == houseInfoMapper.haveHouseInfo(houseInfo)){
                houseInfoMapper.insertSelective(houseInfo);
            }
        }
    }
}
