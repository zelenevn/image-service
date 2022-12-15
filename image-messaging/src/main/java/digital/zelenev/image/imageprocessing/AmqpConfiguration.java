package digital.zelenev.image.imageprocessing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AmqpConfiguration {

    @Value("${RABBITMQ_USER}")
    private String rabbitUser;

    @Value("${RABBITMQ_PASSWORD}")
    private String rabbitPassword;

    @Value("${RABBITMQ_HOST}")
    private String host;

    @Value("${RABBITMQ_PORT}")
    private String port;

    @Value("${AMQP_IMAGE_PROCESSING_QUEUE}")
    private String imageProcessingQueue;

    @Value("${AMQP_IMAGE_PROCESSING_RESULT_QUEUE}")
    private String imageProcessingResultQueue;

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setPassword(rabbitPassword);
        connectionFactory.setUsername(rabbitUser);
        connectionFactory.setHost(host);
        connectionFactory.setPort(Integer.parseInt(port));
        return connectionFactory;
    }

    @Bean
    public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
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
