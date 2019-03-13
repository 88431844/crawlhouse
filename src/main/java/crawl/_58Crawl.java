package crawl;
import entity.houseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import pipeline._58pipline;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.model.OOSpider;

@Service
public class _58Crawl {

    @Autowired
    private _58pipline pipline;

    public void _58CrawlRun() {
        System.out.println("--------- _58CrawlRun");
        OOSpider.create(Site.me()
                .setSleepTime(500)
                .setRetryTimes(3)
                .setUserAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_8_5) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/31.0.1650.57 Safari/537.36"),
                pipline, houseInfo.class)
                .addUrl("https://sy.58.com/zufang/?isreal=true&PGTID=0d300008-000b-cd32-2693-c2f311ddd578&ClickID=2")
                .thread(1)
                .run();
    }


}