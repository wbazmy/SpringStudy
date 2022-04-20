package wbazmy.study.aop;

import jdk.jfr.StackTrace;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 22:21
 */
public class Target implements TargetInterface {
    @Override
    public void get() {
        System.out.println("running");
    }
}
