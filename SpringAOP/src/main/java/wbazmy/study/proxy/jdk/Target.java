package wbazmy.study.proxy.jdk;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 18:42
 */
public class Target implements TargetInterface {

    @Override
    public void save() {
        System.out.println("running...");
    }
}
