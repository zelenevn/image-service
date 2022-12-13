package digital.zelenev.image.image;

import java.util.UUID;

public interface ImageInputBoundary {

    void saveImage(Image image);

    Image getImageById(UUID id);
}
