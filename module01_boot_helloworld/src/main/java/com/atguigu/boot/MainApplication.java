package com.atguigu.boot;

import com.atguigu.boot.configure.MyConfigure;
import com.atguigu.boot.pojo.Car;
import com.atguigu.boot.pojo.Employee;
import com.atguigu.boot.pojo.Pet;
import com.atguigu.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ClassName: MainApplication
 * Package: com.atguigu.boot
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/18 - 12:17  12:17
 * @Version: v1.0
 */

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args){
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        boolean user01 = run.containsBean("user01");
        System.out.println("user01 bean对象是否存在IOC容器中: " + user01);
        boolean tom = run.containsBean("tom");
        System.out.println("tom bean对象是否存在IOC容器中: " + tom);

        User user02 = run.getBean("user02", User.class);
        System.out.println(user02);
        Pet pet02 = run.getBean("pet02", Pet.class);
        System.out.println(pet02);

        Car car = run.getBean("car", Car.class);
        System.out.println(car);

        MyConfigure myConfigure = run.getBean("myConfigure", MyConfigure.class);
        Employee emp = myConfigure.getEmp();
        System.out.println(emp);//Employee(empId=7, empName=ziqiu, age=25, gender=male)

    }
}
