package digital.zelenev.image.imageprocessing;

import digital.zelenev.image.image.Image;
import digital.zelenev.image.image.ImageInputBoundary;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ImageAmqpListener {

    private final ImageInputBoundary imageInputBoundary;

    @RabbitListener(queues = "${AMQP_IMAGE_PROCESSING_RESULT_QUEUE}")
    public void listenProcessedImage(byte[] image) {
        imageInputBoundary.saveImage(new Image(image));
    }
}
