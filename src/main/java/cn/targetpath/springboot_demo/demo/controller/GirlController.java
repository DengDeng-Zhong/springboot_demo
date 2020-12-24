package cn.targetpath.springboot_demo.demo.controller;

import cn.targetpath.springboot_demo.demo.entity.GirlEntity;
import cn.targetpath.springboot_demo.demo.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/24 17:40
 */
@RestController
public class GirlController {

    @Autowired
    private GirlService girlService;

    /**
     * 查询所有girl列表
     * http://localhost:8080/girls
     * @return
     */
    @GetMapping(value = "/girls")
    public List<GirlEntity> girlList(){
        return girlService.girlList();
    }

    /**
     * 添加一个girl
     * http://localhost:8080/girls
     * @param name
     * @param age
     */
    @PostMapping(value = "/girls")
    public GirlEntity girlAdd(@RequestParam("name") String name,
                        @RequestParam("age") Integer age){
        GirlEntity girlEntity = new GirlEntity();
        girlEntity.setName(name);
        girlEntity.setAge(age);
        GirlEntity saveGirl = girlService.save(girlEntity);
        return saveGirl;
    }

    /**
     * 通过id查询一个girl
     * http://localhost:8080/girls/3
     * @param id
     * @return girl信息
     */
    @GetMapping(value = "/girls/{id}")
    public Optional<GirlEntity> girlFindOne(@PathVariable("id") Integer id){
        return girlService.findOne(id);
    }

    /**
     * 通过id更新一个girl
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/girls/{id}")
    public GirlEntity girlUpdate(@PathVariable("id") Integer id,
                                 @RequestParam("name") String name,
                                 @RequestParam("age") Integer age){
        GirlEntity girlEntity = new GirlEntity();
        girlEntity.setId(id);
        girlEntity.setName(name);
        girlEntity.setAge(age);
        return girlService.save(girlEntity);
    }


    /**
     * 通过id删除一个girl
     * @param id
     */
    @DeleteMapping(value = "/girls/{id}")
    public String girlDelete(@PathVariable("id") Integer id){
        try{
            girlService.deleteById(id);
            return "成功!";
        }catch (Exception e){
            return e.getMessage();
        }

    }

    /**
     * 根据年龄查询所有数据
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<GirlEntity> girlFindByAge(@PathVariable(value = "age") Integer age){
        return girlService.findByAge(age);
    }

    @GetMapping(value = "/girls/test")
    public void insertTwo(){
        this.girlService.insertTwo();
    }

}
