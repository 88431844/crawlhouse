package controller.front;

import entity.HouseInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/house")
public class HouseController {

    @RequestMapping("/index")
    public ModelAndView wall(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("----- house list loading .....");
        modelAndView.setViewName("front/houseList");
        return modelAndView;
    }

    @RequestMapping("/seach")
    public ModelAndView seach(HouseInfo houseInfo){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("----- house list loading .....");
        modelAndView.setViewName("front/houseList");



        return modelAndView;
    }
}
