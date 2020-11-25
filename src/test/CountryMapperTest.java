import model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: PACKAGE_NAME
 * @Description: country接口测试
 * @CreateTime: 2020-06-26 19:08
 */
public class CountryMapperTest {

    private static SqlSessionFactory factory;

    @BeforeClass
    public static void init(){
        try {
            InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(resource);
            resource.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*@Test
    public void testSelectAll(){
        SqlSession sqlSession = factory.openSession();
        List<Country> list = sqlSession.selectList("selectAllCountry");
        list.forEach(ele-> System.out.println(ele.getId()
                +"\t"+ele.getCountryName()
                +"\t"+ele.getCountryCode()
                +"\t"+ele.getCreateTime()
                +"\t"+ele.getUpdateTime()));
    }*/

}
