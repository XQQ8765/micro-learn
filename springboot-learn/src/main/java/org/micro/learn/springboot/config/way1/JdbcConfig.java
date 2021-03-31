package org.micro.learn.springboot.config.way1;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Way1: Spring Java Annotaion配置方式
 */
@Configuration
@PropertySource("classpath:/org/micro/learn/springboot/config/way1/jdbc.properties")
public class JdbcConfig {
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;
    @Value("${jdbc.driverClassName}")
    String driverClassName;

    //@Bean //TODO: way1 need to recover it
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
