package wbazmy.study.proxy.jdk;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 18:43
 */
public class Advice {
    public void before() {
        System.out.println("start...");
    }

    public void after() {
        System.out.println("end...");
    }
}
