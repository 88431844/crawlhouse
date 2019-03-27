package pipeline;

import com.alibaba.fastjson.JSON;
import dao.houseInfoDao;
import entity.HouseInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;

@Component
public class MysqlPipline implements PageModelPipeline<HouseInfo> {
    @Resource
    private houseInfoDao houseInfoDao;

    @Override
    public void process(HouseInfo houseInfo, Task task) {
        System.out.println("------ : " + JSON.toJSONString(houseInfo));
//        houseInfoDao.add(HouseInfo);
    }
}
