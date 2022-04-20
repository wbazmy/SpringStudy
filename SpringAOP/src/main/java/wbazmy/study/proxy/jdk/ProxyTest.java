package wbazmy.study.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/20 - 18:44
 */
public class ProxyTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("wbazmy.study.proxy.jdk.Target");
        Target t=new Target();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
            Advice advice=new Advice();
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                advice.before();
                Object o = method.invoke(t, args);
                advice.after();
                return o;
            }
        });
        proxy.save();

    }
}
