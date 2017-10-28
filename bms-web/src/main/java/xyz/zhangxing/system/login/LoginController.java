package xyz.zhangxing.system.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/system/login")
public class LoginController {

    @RequestMapping("/loginUI.htm")
    public String loginUI(){
        return "/system/login/login.html";
    }
}
