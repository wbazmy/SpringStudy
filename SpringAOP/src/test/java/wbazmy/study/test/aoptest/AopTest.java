package wbazmy.study.test.aoptest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wbazmy.study.aop.Target;
import wbazmy.study.aop.TargetInterface;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 22:49
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
    @Autowired
    private TargetInterface target;
    @Test
    public void test1(){
        target.get();
    }
}
