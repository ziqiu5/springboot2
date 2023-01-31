package com.atguigu.boot.configure;

import com.atguigu.boot.pojo.Employee;
import com.atguigu.boot.pojo.Pet;
import com.atguigu.boot.pojo.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ClassName: MyConfigure
 * Package: com.atguigu.boot.configure
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/18 - 20:06  20:06
 * @Version: v1.0
 */

/**
 * 注解--》 Configuration 告诉SoringBoot 这是一个配置类 配置类自动会在IOC容器中生成bean对象
 * 注解--》 ImportResource 将配置文件的路径("classpath:bean01.xml")引入SpringBoot 让其解析 交给IOC容器管理
 * 注解--》 EnableConfigurationProperties 使某个类开启配置绑定功能,并把这个类自动注册到容器中
 */
@Configuration
@ImportResource("classpath:bean01.xml")
@EnableConfigurationProperties(Employee.class)
@Data
public class MyConfigure {

    @Autowired
    private Employee emp;


    /**
     * Full:外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
     * 给容器中添加组件。以方法名作为组件的id。返回类型就是组件类型。返回的值，就是组件在容器中的实例
     * @return 返回User的bean对象
     * 注解--》 ConditionalOnBean 表示需要在IOC容器中存在Pet的bean对象 该方法才会生效
     */
    @Bean
    @ConditionalOnBean(name = "tom")
    public User user01() {
        User user = new User(221, "子秋", "123", null);
        //user组件依赖了Pet组件
        user.setPet(tomcatPet());
        return user;
    }

    /**
     * 在IOC容器中创建该类的bean对象(id="tom")
     * @return 返回Pet的bean对象
     */
    @Bean(value = "tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }


}
