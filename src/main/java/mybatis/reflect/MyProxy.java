package mybatis.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author admin
 * @date 2020/3/27 15:04
 */
public class MyProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target){
        this.target = target;
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始JDK动态代理");
        System.out.println("代理之前");
        Object invoke = method.invoke(target, args);
        System.out.println("代理之后");
        return invoke;
    }
}
