package model;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: model
 * @Description: 角色权限实体类
 * @CreateTime: 2020-06-27 08:57
 */
@Data
@ToString
public class SysRolePrivilege {

    private Long roleId;
    private Long privilegeId;

}
