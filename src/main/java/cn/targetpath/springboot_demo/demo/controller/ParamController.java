package cn.targetpath.springboot_demo.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 测试4 测试参数
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/24 12:44
 */
@RestController
@RequestMapping("/param")
public class ParamController {

    /**
     * http://localhost:8080/param/say1/2
     * @param id
     * @return
     */
    @RequestMapping(value = "/say1/{id}",method = RequestMethod.GET)
    public String paramTest(@PathVariable("id") Integer id){
        return "id: "+ id;
    }

    /**
     * http://localhost:8080/param/say2?id=2
     * 值可以为null
     * @param myId
     * @return
     */
    @RequestMapping(value = "/say2" , method = RequestMethod.GET)
    public String paramTest2(@RequestParam("id") Integer myId){
        return "id:" + myId;
    }

    /**
     * http://localhost:8080/param/say2?id=2
     * 值可以为null
     * @param myId required是否必填 false不必
     * @return
     */
    @RequestMapping(value = "/say3" , method = RequestMethod.GET)
    public String paramTest3(@RequestParam(value = "id", required = false,
            defaultValue = "0") Integer myId){
        return "id:" + myId;
    }

    /**
     * http://localhost:8080/param/say4
     * @param myId
     * @return
     */
    @GetMapping(value = "/say4")
    public String paramTest4(@RequestParam(value = "id", required = false,
            defaultValue = "0") Integer myId){
        return "id:" + myId;
    }
}
