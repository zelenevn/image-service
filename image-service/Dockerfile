FROM arm64v8/openjdk:17

# Environmet variables
ENV SERVICE_NAME=image-service
ENV SERVICE_HOME=/opt/service
ENV JAR_FILE=${SERVICE_HOME}/${SERVICE_NAME}.jar
ENV AMQP_IMAGE_PROCESSING_QUEUE=imageProcessingQueue
ENV AMQP_IMAGE_PROCESSING_RESULT_QUEUE=imageProcessingReultQueut
ENV DATABASE_USERNAME=admin
ENV DATABASE_PASSWORD=admin
ENV DATABASE_URL=jdbc:postgresql://database:5432/images

# Copy builded jar
ADD build/libs $SERVICE_HOME

# Run service
ENTRYPOINT java -jar ${JAR_FILE}