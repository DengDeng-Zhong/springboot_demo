package cn.targetpath.springboot_demo.demo.dao;

import cn.targetpath.springboot_demo.demo.entity.GirlEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/24 17:45
 */
public interface GirlDao extends JpaRepository<GirlEntity,Integer> {

    List<GirlEntity> findByAge(Integer age);
}
