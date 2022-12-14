package digital.zelenev.image.image;

import java.util.UUID;

public class ImageInteractor implements ImageInputBoundary {

    private final ImageGateway imageGateway;

    public ImageInteractor(ImageGateway imageGateway) {
        this.imageGateway = imageGateway;
    }

    @Override
    public void saveImage(Image image) {
        imageGateway.saveImage(image);
    }

    @Override
    public Image getImageById(UUID id) {
        return imageGateway.getImageById(id);
    }
}
