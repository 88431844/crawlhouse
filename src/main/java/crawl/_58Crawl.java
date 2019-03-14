package crawl;
import entity.HouseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import pipeline._58pipline;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.OOSpider;

@Component
public class _58Crawl {

    @Autowired
    private _58pipline pipline;

    public void _58CrawlRun() {
        System.out.println("--------- _58CrawlRun");
        OOSpider.create(Site.me()
                .setSleepTime(500)
                .setRetryTimes(3)
                .setCharset("utf-8")
                .addHeader("Accept","application/json;charset=utf-8")
                .addHeader("Content-Type","application/json;charset=utf-8")
                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/31.0.1650.57 Safari/537.36"),
                pipline, HouseInfo.class)
                .addUrl("https://sy.58.com/zufang/")
                .thread(1)
                .run();
    }

    public static void main(String[] args) {
        _58Crawl crawl = new _58Crawl();
        crawl._58CrawlRun();
    }


}