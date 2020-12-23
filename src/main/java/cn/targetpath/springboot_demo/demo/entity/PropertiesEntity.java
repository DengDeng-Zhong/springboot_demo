package cn.targetpath.springboot_demo.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 配置实体
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2020/12/24 0:08
 */
@Component
@ConfigurationProperties(prefix = "demo")
public class PropertiesEntity {

    private String field1;
    private Integer field2;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public Integer getField2() {
        return field2;
    }

    public void setField2(Integer field2) {
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "PropertiesEntity{" +
                "field1='" + field1 + '\'' +
                ", field2=" + field2 +
                '}';
    }
}
