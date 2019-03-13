package spider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

public class LagouJsonFilePipeline implements Pipeline{

	@Override
	public void process(ResultItems arg0, Task arg1) {
		// TODO Auto-generated method stub
		System.out.println("开始写入数据！");
		String result =  (String) arg0.getAll().get("result");
		System.out.println(result);
		JSONObject resultJson = JSONObject.parseObject(result);
		String content = resultJson.getString("content");
		JSONObject contentJson = JSONObject.parseObject(content);
		String positionResult = contentJson.getString("positionResult");
		JSONObject positionResultJson = JSONObject.parseObject(positionResult);
		String companyPositionResult = positionResultJson.getString("result");

		
		System.out.println("数据写入完成！"+companyPositionResult);
	}

}
