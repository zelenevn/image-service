package digital.zelenev.image.imageprocessing;

import digital.zelenev.image.image.Image;

public class ProcessingImageInteractor implements ProcessingInputBoundary {
    private final ImageProcessor imageProcessor;
    public ProcessingImageInteractor(ImageProcessor imageProcessor) {
        this.imageProcessor = imageProcessor;
    }
    @Override
    public void processImage(Image image) {
        imageProcessor.processImage(image);
    }
}
