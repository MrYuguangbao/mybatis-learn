package mybatis.builder;

/**
 * @author admin
 * @date 2020/3/27 16:16
 */
public class ConcreteBuilder1 extends AbstractBuilder {

    @Override
    public void buildComponent1() {
        configuration.setComponent1("构建组件1");
    }

    @Override
    public void buildComponent2() {
        configuration.setComponent2("构建组件2");
    }

    @Override
    public void buildComponent3() {
        configuration.setComponent3("构建组件3");
    }

    @Override
    public void buildComponent4() {
        configuration.setComponent4("构建组件4");
    }
}
