package com.wbazmy.test;

import com.wbazmy.service.ServiceClass;
import com.wbazmy.config.ConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/14 - 0:00
 */
public class TestClass {
    public static void main(String[] args) {
        ApplicationContext app=new AnnotationConfigApplicationContext(ConfigClass.class);
        ServiceClass service=app.getBean(ServiceClass.class);
        service.run();
    }
}
