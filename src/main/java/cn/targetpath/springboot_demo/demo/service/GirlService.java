package cn.targetpath.springboot_demo.demo.service;

import cn.targetpath.springboot_demo.demo.dao.GirlDao;
import cn.targetpath.springboot_demo.demo.entity.GirlEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/24 17:52
 */
@Service
public class GirlService {

    @Autowired
    private GirlDao girlDao;

    public List<GirlEntity> girlList(){
        return girlDao.findAll();
    }

    public GirlEntity save(GirlEntity girlEntity) {
        return girlDao.save(girlEntity);
    }

    public Optional<GirlEntity> findOne(Integer id) {
        return girlDao.findById(id);
    }

    public void deleteById(Integer id) {
        this.girlDao.deleteById(id);
    }

    public List<GirlEntity> findByAge(Integer age){
        return this.girlDao.findByAge(age);
    }

    @Transactional
    public void insertTwo(){
        GirlEntity girlA = new GirlEntity();
        girlA.setName("A");
        girlA.setAge(2);
        girlDao.save(girlA);

        GirlEntity girlB = new GirlEntity();
        girlB.setName("BB");
        girlB.setAge(28);
        girlDao.save(girlB);
    }
}
