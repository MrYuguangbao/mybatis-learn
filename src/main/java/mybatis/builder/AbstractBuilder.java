package mybatis.builder;

/**
 * @author admin
 * @date 2020/3/27 16:15
 */
public abstract class AbstractBuilder {

    public abstract void buildComponent1();
    public abstract void buildComponent2();
    public abstract void buildComponent3();
    public abstract void buildComponent4();

    protected MyConfiguration configuration = new MyConfiguration();

    public MyConfiguration getBuildResult(){
        return configuration;
    }

}
