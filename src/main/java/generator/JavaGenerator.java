package generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import sun.nio.cs.Surrogate;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: generator
 * @Description: 读取MBG配置生成代码
 * @CreateTime: 2020-06-14 23:17
 */
public class JavaGenerator {

    public static void main(String[] args) {
        List<String> warnings = new ArrayList<>();
        //生成的代码重复时，覆盖原代码
        boolean overwrite = true;
        InputStream is = Surrogate.Generator.class.getResourceAsStream("/generator/generatorConfig.xml");
        ConfigurationParser parser = new ConfigurationParser(warnings);
        Configuration configuration = null;
        try {
            configuration = parser.parseConfiguration(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = null;
        try {
            myBatisGenerator = new MyBatisGenerator(configuration,callback,warnings);
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
        try {
            myBatisGenerator.generate(null);
            for (String warning : warnings) {
                System.out.println(warning);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
