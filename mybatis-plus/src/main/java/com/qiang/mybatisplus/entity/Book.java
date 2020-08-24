package com.qiang.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.qiang.mybatisplus.Enum.StatusEnumImp;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "book")
public class Book {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField(value = "name")
    private String name;
//    @TableField(select = false)
    private String author;

    @TableField(exist = false)//数据库忽略该字段，默认为true，如果实体类中的成员变量在数据库中没有对应的字段，则可以使用 exist，
    private String test;//数据库不存在的列

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    private Integer version;

    private StatusEnumImp status;

    @TableLogic
    private Integer deleted;
}
