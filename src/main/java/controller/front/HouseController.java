package controller.front;

import crawl._58Crawl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private _58Crawl crawl58;

    @RequestMapping("/index")
    public ModelAndView wall(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("----- house list loading .....");
        modelAndView.setViewName("front/houseList");

        return modelAndView;
    }

    @RequestMapping("/crawl")
    public ModelAndView crawl(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("----- house crawling .....");
        crawl58._58CrawlRun();


        modelAndView.setViewName("front/houseList");

        return modelAndView;
    }
}
