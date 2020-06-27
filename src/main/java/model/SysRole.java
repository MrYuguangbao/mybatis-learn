package model;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: model
 * @Description: 角色实体类
 * @CreateTime: 2020-06-27 08:53
 */
@Data
@ToString
public class SysRole {

    private Long id;
    private String roleName;
    private Integer enabled;
    private String createBy;
    private Date createTime;

}
