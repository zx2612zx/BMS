package xyz.zhangxing.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/business/homePage")
public class HomePageController {

    @RequestMapping("/main.htm")
    public String homePageUI(){
        return "/business/main.html";
    }
}
