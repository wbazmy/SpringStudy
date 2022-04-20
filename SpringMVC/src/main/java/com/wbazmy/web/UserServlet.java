package com.wbazmy.web;

import com.wbazmy.config.ConfigClass;
import com.wbazmy.service.ServiceClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/14 - 0:09
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        ApplicationContext app= (ApplicationContext) servletContext.getAttribute("app");
        ServiceClass service = app.getBean(ServiceClass.class);
        service.run();
    }
}
