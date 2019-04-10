package controller.front;

import crawl.crawl;
import entity.AnjukeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private crawl crawl;

    @RequestMapping("/index")
    public ModelAndView wall(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("----- house list loading .....");
        modelAndView.setViewName("front/houseList");

        return modelAndView;
    }

    @RequestMapping("/crawl")
    @ResponseBody
    public String crawl(){
        crawl.crawlRun("https://sy.zu.anjuke.com/fangyuan", AnjukeInfo.class,1);
        return "----- house crawling ....";
    }
}
