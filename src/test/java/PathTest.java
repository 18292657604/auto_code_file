/**
 * Created by angel on 2019/4/2.
 */
public class PathTest {

    public static void main(String[] args) {
        System.out.println(getClassPath());
    }


    public static String getClassPath() {
        String path = Thread.currentThread().getContextClassLoader().getResource("./").getPath();
        return path;
    }

}
