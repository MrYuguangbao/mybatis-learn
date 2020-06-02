package mybatis.reflect;

import java.lang.reflect.Method;

/**
 * @author admin
 * @date 2020/3/27 14:59
 */
public class ReflectService implements IReflect {

    @Override
    public void show(String name){
        System.out.println("hello : "+name);
    }


    public static void main(String[] args) throws Exception{
        /*Class<?> aClass = Class.forName(ReflectService.class.getName());
        Object o = aClass.newInstance();
        Method show = o.getClass().getMethod("show", String.class);
        show.invoke(o,"yu");*/

        MyProxy myProxy = new MyProxy();
        IReflect proxy = (IReflect)myProxy.bind(new ReflectService());
        proxy.show("反射成功");

    }
}
