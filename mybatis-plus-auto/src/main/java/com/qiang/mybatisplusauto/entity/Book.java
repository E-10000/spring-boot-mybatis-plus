package com.qiang.mybatisplusauto.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 小强
 * @since 2020-08-20
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Book implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;

    private String author;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer version;

    private Integer status;

    private Integer deleted;


}
