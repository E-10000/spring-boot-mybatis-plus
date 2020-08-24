package com.qiang.mybatisplusauto.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    public class Shop implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "shop_id", type = IdType.AUTO)
      private Integer shopId;

    private String shopName;

    private Integer bookId;


}
