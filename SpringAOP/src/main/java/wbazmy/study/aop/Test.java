package wbazmy.study.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 22:53
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        TargetInterface t = (TargetInterface) app.getBean("target");
        t.get();
    }
}
