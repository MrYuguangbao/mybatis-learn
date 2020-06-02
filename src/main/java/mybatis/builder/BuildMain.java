package mybatis.builder;

/**
 * @author admin
 * @date 2020/3/27 16:38
 */
public class BuildMain {

    public static void main(String[] args) {
        AbstractBuilder builder = new ConcreteBuilder1();
        BuildDirector director = new BuildDirector(builder);

        director.direcBuild();
        MyConfiguration buildResult = builder.getBuildResult();
        buildResult.showBuildResult();
    }


}
