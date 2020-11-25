package service.impl;

import mapper.DictMapper;
import model.SysDict;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.DictService;

import java.util.List;
import java.util.Objects;

/**
 * @Author: admin
 * @Description: 字典服务实现类
 * @BelongsProject: mybatis-learn
 * @BelongsPackage: service.impl
 * @CreateTime: 2020-11-25 00:10:23
 */
@Service
public class DictServiceImpl implements DictService {

    @Autowired
    private DictMapper mapper;

    @Override
    public List<SysDict> findBySysDict(SysDict sysDict, Integer offset, Integer limit) {
        RowBounds rowBounds = RowBounds.DEFAULT;
        if (Objects.nonNull(offset) && Objects.nonNull(limit)) {
            rowBounds = new RowBounds(offset, limit);
        }
        return mapper.selectBySysDict(sysDict, rowBounds);
    }
}
