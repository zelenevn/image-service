package digital.zelenev.image.imageprocessing;

import digital.zelenev.image.image.Image;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ImageAmqpProcessor implements ImageProcessor {

    @Value("${AMQP_IMAGE_PROCESSING_QUEUE}")
    private String imageProcessingQueue;

    private final RabbitTemplate rabbitTemplate;

    @Override
    public void processImage(Image image) {
        rabbitTemplate.convertAndSend(imageProcessingQueue, image.getImage());
    }
}
