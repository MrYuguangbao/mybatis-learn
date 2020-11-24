package mapper;

import model.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: mapper
 * @Description: country接口
 * @CreateTime: 2020-06-26 19:01
 */
@Mapper
public interface CountryMapper {

    List<Country> selectAllCountry();
}
