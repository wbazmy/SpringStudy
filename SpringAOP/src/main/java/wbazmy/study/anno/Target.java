package wbazmy.study.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 22:21
 */
@Component("target")
public class Target implements TargetInterface {
    @Override
    public void get() {
        System.out.println("running");
    }
}
