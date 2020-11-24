package service;

import model.SysDict;

import java.util.List;

/**
 * @Author: admin
 * @Description: 字典服务层
 * @BelongsProject: mybatis-learn
 * @BelongsPackage: service
 * @CreateTime: 2020-11-25 00:08:19
 */
public interface DictService {

    List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit);
}
