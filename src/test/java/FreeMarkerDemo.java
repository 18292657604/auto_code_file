import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by angel on 2019/4/2.
 * 生成java代码
 */
public class FreeMarkerDemo {

    private static final String TEMPLATE_PATH = "src/main/resources/templates/ftl";
    private static final String CLASS_PATH = "src/main/java/com/skycloud/code/test";


    public static void main(String[] args) throws IOException, TemplateException {

        //1、创建freeMarker配置实例
        Configuration configuration = new Configuration();
        Writer out = null;

        //2、获取模版路径
        configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));

        //3、创建数据模型
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("classPath", "com.skycloud.code.test");
        dataMap.put("className", "AutoCodeDemo");
        dataMap.put("helloWorld", "通过简单的 <代码自动生产程序> 演示 FreeMarker的HelloWorld！");

        // 4、加载模版文件
        Template template = configuration.getTemplate("hello.ftl");

        //5、生成数据
        File docFile = new File(CLASS_PATH + "\\" + "AutoCodeDemo.java");

        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));

        //6、输出文件
        template.process(dataMap, out);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^AutoCodeDemo.java 文件创建成功 !");

    }

}
