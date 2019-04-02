package com.skycloud.code.entity;

import java.util.ArrayList;
import java.util.List;
/**
 * 代码生成接收的实体类
 * @author lsy
 * @date 2019/4/2
 */
public class CodeGenerate {

    private String entityPackage = "test";
    private String entityName = "Test";
    private String decription = "测试用例";
    private List<Columnt> columns = new ArrayList();

    public CodeGenerate() {
    }

    public CodeGenerate(String entityPackage, String entityName, String decription) {
        this.entityPackage = entityPackage;
        this.entityName = entityName;
        this.decription = decription;
    }

    public String getEntityPackage() {
        return entityPackage;
    }

    public void setEntityPackage(String entityPackage) {
        this.entityPackage = entityPackage;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
