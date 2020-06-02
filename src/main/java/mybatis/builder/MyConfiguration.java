package mybatis.builder;

import lombok.Data;

/**
 * @author admin
 * @date 2020/3/27 16:19
 */
@Data
public class MyConfiguration {

    private String component1;
    private String component2;
    private String component3;
    private String component4;

    public void showBuildResult(){
        System.out.println(component1);
        System.out.println(component2);
        System.out.println(component3);
        System.out.println(component4);
    }

}
