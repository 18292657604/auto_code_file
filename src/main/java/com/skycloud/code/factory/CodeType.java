package com.skycloud.code.factory;

/**
 * 代码类型的枚举
 * @author lsy
 * @date 2019/4/2
 */
public enum CodeType {

    serviceImpl("ServiceImpl"),
    dao("Dao"),
    service("Service"),
    controller("Controller"),
    entity("Entity");

    private String value;

    CodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
