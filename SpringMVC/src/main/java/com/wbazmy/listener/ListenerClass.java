package com.wbazmy.listener;

import com.wbazmy.config.ConfigClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/14 - 16:34
 */
public class ListenerClass implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ApplicationContext app=new AnnotationConfigApplicationContext(ConfigClass.class);
        ServletContext servletContext=sce.getServletContext();
        servletContext.setAttribute("app",app);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
