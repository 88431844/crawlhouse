package controller.back;

import crawl.crawl;
import entity.AnjukeInfo;
import entity.FangInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crawl")
public class CrawlController {

    @Autowired
    private crawl crawl;

    @RequestMapping("/anjuke")
    public void anjuke(){
        System.out.println("anjuke crawl start ....");
        crawl.crawlRun("https://sy.zu.anjuke.com/fangyuan", AnjukeInfo.class,1);
        System.out.println("anjuke crawl stop ....");
    }

    @RequestMapping("/fang")
    public void fang(){
        System.out.println("fang crawl start ....");
        crawl.crawlRun("https://sy.zu.fang.com/chuzu", FangInfo.class,1);
        System.out.println("fang crawl stop ....");
    }
}
