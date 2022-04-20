package wbazmy.study.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 22:23
 */
@Component("myAspect")
@Aspect
public class MyAspect {
    @Before("execution(public void wbazmy.study.anno.Target.get())")
    public void before() {
        System.out.println("before");
    }
}
