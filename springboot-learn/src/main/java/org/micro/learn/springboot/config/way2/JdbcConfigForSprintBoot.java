package org.micro.learn.springboot.config.way2;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfigForSprintBoot {

    @Bean
    public DataSource dataSource(JdbcProperties prop) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(prop.driverClassName);
        dataSource.setUrl(prop.url);
        dataSource.setUsername(prop.username);
        dataSource.setPassword(prop.password);
        return dataSource;
    }
}
