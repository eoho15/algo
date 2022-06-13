package webserver;

import java.io.File;
import java.nio.file.Files;

public class FileUtil {
    // baseDir는 /로 끝나지 않는다.
    private String baseDir;

    public FileUtil(String baseDir) {
        this.baseDir = baseDir;
    }
    // filePath는 /로 시작된다.
    public ContentInfo getContentInfo(String filePath){
        //File
        File file = new File(this.baseDir + filePath);
        if(!file.exists())
            return null;

        String contentType = null;
        try {
            contentType = Files.probeContentType(file.toPath());
        }catch(Exception ex) {

            return null;
        }
        ContentInfo contentInfo = new ContentInfo(file.length(), contentType);
        return contentInfo;
        }
}
