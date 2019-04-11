package crawl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pipeline.MysqlPipeline;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;

@Component
public class crawl {

    @Autowired
    private MysqlPipeline pipline;

    public void crawlRun(String addUrl,Class t,int thread ) {
        System.out.println("--------- crawlRun");
        OOSpider.create(Site.me()
                .setSleepTime(500)
                .setRetryTimes(3)
                .setCharset("utf-8")
                .addHeader("Accept","application/json;charset=utf-8")
                .addHeader("Content-Type","application/json;charset=utf-8")
                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/31.0.1650.57 Safari/537.36"),
                pipline, t)
                .addUrl(addUrl)
                .thread(thread)
                .run();
    }
}