package xyz.zhangxing.system.regist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/system/regist")
public class RegistController {
    @RequestMapping("/registUI.htm")
    public String registUI(){
        return "/system/regist/regist.html";
    }
}
