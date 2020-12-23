package cn.targetpath.springboot_demo.demo.controller;

import cn.targetpath.springboot_demo.demo.entity.PropertiesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/24 0:14
 */
@RestController
public class PropertiesController {

    @Autowired
    private PropertiesEntity propertiesEntity;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(){
        return propertiesEntity.toString();
    }
}
