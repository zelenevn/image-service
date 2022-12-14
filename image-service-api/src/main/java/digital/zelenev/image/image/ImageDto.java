package digital.zelenev.image.image;

public class ImageDto {

    private byte[] image;

    public ImageDto(byte[] image) {
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
