package digital.zelenev.image.imageprocessing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AmqpConfiguration {

    @Value("${AMQP_IMAGE_PROCESSING_QUEUE}")
    private String imageProcessingQueue;

    @Value("${AMQP_IMAGE_PROCESSING_RESULT_QUEUE}")
    private String imageProcessingResultQueue;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setPassword("admin");
        connectionFactory.setUsername("admin");
        connectionFactory.setHost("message-broker");
        connectionFactory.setPort(5672);
        return connectionFactory;
    }

    @Bean
    public Queue imageProcessingQueue() {
        return new Queue(imageProcessingQueue, false);
    }

    @Bean
    public Queue imageProcessingResultQueue() {
        return new Queue(imageProcessingResultQueue, false);
    }
}
