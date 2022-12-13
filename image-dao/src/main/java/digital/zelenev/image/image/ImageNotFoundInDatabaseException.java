package digital.zelenev.image.image;

public class ImageNotFoundInDatabaseException extends RuntimeException {

    public ImageNotFoundInDatabaseException(String message) {
        super(message);
    }
}
