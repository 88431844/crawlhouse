package controller.front;

import dto.HouseInfoDto;
import entity.HouseInfo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.HouseService;

@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("/index")
    public ModelAndView wall(){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("----- house list loading .....");
        return listHouseInfo(modelAndView);
    }

    @RequestMapping("/seach")
    public ModelAndView seach(HouseInfoDto houseInfoDto){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("----- house list loading .....");
        modelAndView.setViewName("front/houseList");
        List<HouseInfo> houseInfoList = houseService.seach(houseInfoDto);
        return modelAndView.addObject("houseInfoList",houseInfoList);
    }

    public ModelAndView listHouseInfo(ModelAndView modelAndView){
        modelAndView.setViewName("front/houseList");
        List<HouseInfo> houseInfoList = houseService.list();
        return modelAndView.addObject("houseInfoList",houseInfoList);
    }
}
