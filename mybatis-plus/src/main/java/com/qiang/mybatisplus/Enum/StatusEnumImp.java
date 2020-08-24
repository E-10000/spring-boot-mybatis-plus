package com.qiang.mybatisplus.Enum;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum StatusEnumImp implements IEnum<Integer> {
    GOOD(1,"好书"),
    BAD(0,"坏书");

    private Integer code;
    private String msg;

    StatusEnumImp(Integer code,String msg) {
        this.code=code;
        this.msg=msg;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }
}
