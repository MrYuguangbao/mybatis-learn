package model;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: model
 * @Description: 用户角色实体类
 * @CreateTime: 2020-06-27 08:38
 */
@Data
@ToString
public class SysUserRole {
    private Long userId;
    private Long roleId;
}
