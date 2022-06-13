package webserver;

public class ContentInfo {

    //  content-length: 3266
    //  content-type: image/png
    private long contentLength;
    private String contentType;

    public ContentInfo(long contentLength, String contentType){
        this.contentLength = contentLength;
        this.contentType = contentType;
    }

    // getter / setter
    public long getContentLength() {
        return contentLength;
    }

    public void setContentLength(long contentLength) {
        this.contentLength = contentLength;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    //  content-length: 3266
    //  content-type: image/png
    public String toString(){
        String str = "content-length " + contentLength + "\n";
        str += "content-type: " + contentType + "\n";
        return str;
    }
}