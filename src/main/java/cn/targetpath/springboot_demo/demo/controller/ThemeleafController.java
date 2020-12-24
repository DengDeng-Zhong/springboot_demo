package cn.targetpath.springboot_demo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 测试3
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/24 12:32
 */
@Controller
public class ThemeleafController {

    @RequestMapping(value = "thepage",method = RequestMethod.GET)
    public String thePage(){
        return "index";
    }
}
