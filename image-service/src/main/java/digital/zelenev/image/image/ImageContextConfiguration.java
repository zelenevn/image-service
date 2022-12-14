package digital.zelenev.image.image;

import digital.zelenev.image.imageprocessing.ImageProcessor;
import digital.zelenev.image.imageprocessing.ProcessingImageInteractor;
import digital.zelenev.image.imageprocessing.ProcessingInputBoundary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImageContextConfiguration {

    @Bean
    public ImageInputBoundary imageInputBoundary(ImageGateway imageGateway) {
        return new ImageInteractor(imageGateway);
    }

    @Bean
    public ProcessingInputBoundary processingInputBoundary(ImageProcessor imageProcessor) {
        return new ProcessingImageInteractor(imageProcessor);
    }
}
