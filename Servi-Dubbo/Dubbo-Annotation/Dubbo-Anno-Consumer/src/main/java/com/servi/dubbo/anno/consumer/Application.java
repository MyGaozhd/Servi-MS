package com.servi.dubbo.anno.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.servi.dubbo.service.IUserService;
import com.servi.dubbo.user.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        IUserService service = context.getBean("userServiceComponent", UserServiceComponent.class);
        User user = service.getUser("1");
        System.out.println("result :" + user.getName());
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.servi.dubbo.anno.consumer")
    @PropertySource("classpath:/spring/dubbo-consumer.properties")
    @ComponentScan(value = {"com.servi.dubbo.anno.consumer"})
    static class ConsumerConfiguration {

    }
}
