package model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: admin
 * @Description: 字典实体类
 * @BelongsProject: mybatis-learn
 * @BelongsPackage: model
 * @CreateTime: 2020-11-24 23:34:47
 */
@Data
@ToString
public class SysDict implements Serializable {

    private static final long serialVersionUID = -2899983436555728733L;

    private Long id;
    /**
     * 类别
     */
    private String code;
    /**
     * 字典名
     */
    private String name;
    /**
     * 字典值
     */
    private String value;
    private Date createTime;
    private Date updateTime;




}
