package cn.targetpath.springboot_demo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试1
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/23 23:47
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "Hello World!";
    }
}
