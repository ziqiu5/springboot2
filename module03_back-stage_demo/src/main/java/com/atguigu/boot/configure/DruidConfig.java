package com.atguigu.boot.configure;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebFilter;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * ClassName: DruidConfig
 * Package: com.atguigu.boot.configure
 * Description:
 *
 * @author ziqiu
 * @Create: 2023/1/31 - 11:57  11:57
 * @Version: v1.0
 */

//@Configuration
public class DruidConfig {

    /**
     * 加入监控和防火墙、slf4j日志功能功能
     * 注解--》 bean 往IOC容器中存放组件
     * 注解--》 ConfigurationProperties //复用配置文件的数据源配置（spring.datasource）
     *
     * @return 返回DruidDataSource数据源
     * @throws SQLException SQL异常
     */
//    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setFilters("stat,wall,slf4j");
        return druidDataSource;
    }

    /**
     * 配置 druid的监控页功能
     * @return 返回ServletRegistrationBean
     */
//    @Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(statViewServlet,"/druid/*");
        registrationBean.addInitParameter("loginUsername", "ziqiu");
        registrationBean.addInitParameter("loginPassword", "123");
        return registrationBean;
    }

//    @Bean
    public FilterRegistrationBean WebStatFilter(){
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<>(webStatFilter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return registrationBean;
    }

}
