package com.wbazmy.Controller;

import com.wbazmy.service.ServiceClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/13 - 21:35
 */
public class ControlClass {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceClass service = (ServiceClass) app.getBean("userService");
        service.run();
    }
}
