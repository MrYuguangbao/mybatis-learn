package mybatis.builder;

/**
 * @author admin
 * @date 2020/3/27 16:14
 */
public class BuildDirector {

    private AbstractBuilder builder;

    public BuildDirector(AbstractBuilder builder){
        this.builder = builder;
    }

    public void direcBuild(){
        builder.buildComponent1();
        builder.buildComponent2();
        builder.buildComponent3();
        builder.buildComponent4();
    }

}
