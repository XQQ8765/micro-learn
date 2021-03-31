package org.micro.learn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "hello, dataSource:" + dataSource;
    }
}
