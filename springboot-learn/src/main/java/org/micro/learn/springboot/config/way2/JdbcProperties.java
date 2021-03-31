package org.micro.learn.springboot.config.way2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * It will use the default config file: application.properties
 */
@ConfigurationProperties(prefix="jdbc")
@Data//lombox, Generates getters for all fields
public class JdbcProperties {
    /**
     * SpringBoot属性注入方式
     */
    String url;
    String username;
    String password;
    String driverClassName;
}
