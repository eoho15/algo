package webserver;

public class FileUtilTest {
    public static void main(String[] args) {

        FileUtil fileUtil = new FileUtil("C:\\Users\\handa\\Desktop\\file");
        ContentInfo contentInfo = fileUtil.getContentInfo("/my/hello.txt");

        System.out.println(contentInfo);
    }
}
