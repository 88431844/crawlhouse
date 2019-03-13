package pipeline;

import com.alibaba.fastjson.JSON;
import dao.houseInfoDao;
import entity.houseInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import javax.annotation.Resource;

@Service
public class _58pipline implements PageModelPipeline<houseInfo> {
    @Resource
    private houseInfoDao houseInfoDao;

    @Override
    public void process(houseInfo houseInfo, Task task) {
        System.out.println("------ : " + JSON.toJSONString(houseInfo));
        houseInfoDao.add(houseInfo);
    }
}
