package model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: admin
 * @BelongsProject: mybatis-arist
 * @BelongsPackage: model
 * @Description: 用户信息实体类
 * @CreateTime: 2020-06-14 22:42
 */
@Data
@ToString
public class SysUser {

    private Long id;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userInfo;
    private byte[] headImg;
    private Date createTime;

}
