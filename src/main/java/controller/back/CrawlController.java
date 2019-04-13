package controller.back;

import controller.front.HouseController;
import crawl.crawl;
import entity.AnjukeInfo;
import entity.FangInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/crawl")
public class CrawlController {

    @Autowired
    private crawl crawl;
    @Autowired
    private HouseController houseController;
    private static final String GB2312 = "gb2312";
    private static final String UTF8 = "utf-8";

    @RequestMapping("/anjuke")
    public ModelAndView anjuke(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("anjuke crawl start ....");
        crawl.crawlRun("https://sy.zu.anjuke.com/fangyuan", AnjukeInfo.class,5,UTF8);
        System.out.println("anjuke crawl stop ....");
        modelAndView = houseController.listHouseInfo(modelAndView);
        modelAndView.setViewName("redirect:/house/index");
        return modelAndView;
    }

    @RequestMapping("/fang")
    public ModelAndView fang(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("fang crawl start ....");
        crawl.crawlRun("https://sy.zu.fang.com", FangInfo.class,5,GB2312);
        System.out.println("fang crawl stop ....");
        modelAndView = houseController.listHouseInfo(modelAndView);
        modelAndView.setViewName("redirect:/house/index");
        return modelAndView;
    }
}
