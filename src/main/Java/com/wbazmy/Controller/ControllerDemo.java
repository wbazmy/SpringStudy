package com.wbazmy.Controller;

import com.wbazmy.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/8 - 19:19
 */
public class ControllerDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService service = (UserService) app.getBean("SpringService");
        service.run();
    }
}
