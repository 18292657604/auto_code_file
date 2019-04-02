package com.skycloud.code.factory;


import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

/**
 * 自动代码生成工厂
 * @author angel
 * @date 2019/4/2
 */
public abstract class CodeGenerateFactory {

    private Logger log = Logger.getLogger(CodeGenerateFactory.class);

    //生成文件方法
    public abstract void generateFile();

    /**
     * 获取路径
     * @return
     */
    public String getPath(){
        


        return "";
    }

    /**
     * 创建文件
     * @param path 路径
     * @return
     */
    public boolean createFile(String path) {
        try{
            File file = new File(path);
            //是文件夹
            if(file.isDirectory()&&!file.exists()){
                file.mkdirs();
            }
            //是文件且文件不存在，创建文件
            if(file.isFile()&&!file.exists()){
                file.createNewFile();
            }
            return true;
        }catch (IOException e){
            log.info("创建文件夹异常：" + e.getMessage());
        }
        return false;
    }
}
