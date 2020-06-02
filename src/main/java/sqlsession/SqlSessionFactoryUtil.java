package sqlsession;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author admin
 * @date 2020/3/26 19:01
 */
public class SqlSessionFactoryUtil {

    private static SqlSessionFactory factory = null;

    public static SqlSessionFactory initFactory(){
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(factory == null){
            synchronized (SqlSessionFactoryUtil.class){
                if(factory == null){
                    factory = new SqlSessionFactoryBuilder().build(is);
                }
            }
        }
        return factory;
    }

    public static SqlSession openSqlSession(){
        if (factory==null) {
            factory = initFactory();
        }
        return factory.openSession();
    }

}
