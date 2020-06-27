package model;

import lombok.Data;
import lombok.ToString;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: model
 * @Description: 权限实体类
 * @CreateTime: 2020-06-27 08:56
 */
@Data
@ToString
public class SysPrivilege {
    private Long id;
    private String privilegeName;
    private String privilegeUrl;
}
