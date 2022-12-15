package digital.zelenev.image.image;

public class Image {

    private String name;

    private byte[] imageContent;

    private String contentType;

    private Long length;

    public Image(String name, byte[] imageContent, String contentType, Long length) {
        this.name = name;
        this.imageContent = imageContent;
        this.contentType = contentType;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImageContent() {
        return imageContent;
    }

    public void setImageContent(byte[] imageContent) {
        this.imageContent = imageContent;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }
}
