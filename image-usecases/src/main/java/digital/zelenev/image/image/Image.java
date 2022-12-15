package digital.zelenev.image.image;

public class Image {

    private String name;

    private byte[] imageContent;

    private String extension;

    private Long length;

    public Image(String name, byte[] imageContent, String extension, Long length) {
        this.name = name;
        this.imageContent = imageContent;
        this.extension = extension;
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

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }
}
