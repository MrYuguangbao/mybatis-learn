package mapper;

import model.SysDict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * @Author: admin
 * @Description: 字典mapper接口
 * @BelongsProject: mybatis-learn
 * @BelongsPackage: mapper
 * @CreateTime: 2020-11-24 23:46:14
 */
@Mapper
public interface DictMapper {
    SysDict selectByPrimaryKey(Long id);

    List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);

    int insert(SysDict sysDict);

    int updateById(SysDict sysDict);

    int deleteById(Long id);


}
