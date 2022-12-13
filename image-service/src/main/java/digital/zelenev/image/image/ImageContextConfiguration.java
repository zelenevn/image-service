package digital.zelenev.image.image;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImageContextConfiguration {

    @Bean
    public ImageInputBoundary imageInputBoundary(ImageOutputBoundary imageOutputBoundary, ImageGateway imageGateway) {
        return new ImageInteractor(imageOutputBoundary, imageGateway);
    }
}
