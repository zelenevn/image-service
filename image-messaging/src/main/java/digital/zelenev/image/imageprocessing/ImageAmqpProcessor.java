package digital.zelenev.image.imageprocessing;

import digital.zelenev.image.image.Image;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ImageAmqpProcessor implements ImageProcessor {

    @Value("${AMQP_IMAGE_PROCESSING_QUEUE}")
    private String imageProcessingQueue;

    private final RabbitTemplate rabbitTemplate;

    private final ImageMessageMapper imageMessageMapper;

    @Override
    public void processImage(Image image) {
        ImageMessage message = imageMessageMapper.toMessage(image);
        rabbitTemplate.convertAndSend(imageProcessingQueue, message);
        log.info("Send image to {} queue. Image name: {}", imageProcessingQueue, image.getName());
    }
}
