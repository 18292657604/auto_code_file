package com.skycloud.code.factory;

/**
 * controller 工厂类
 * @author lsy
 * @date 2019/4/2
 */
public class ControllerFactory extends CodeGenerateFactory{


    @Override
    public void generateFile() {
        String path = getPath() + "/controller/";
    }
}
