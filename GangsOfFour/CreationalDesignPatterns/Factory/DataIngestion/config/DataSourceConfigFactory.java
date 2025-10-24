package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config;

import GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config.*;

/**
 * Factory responsible for creating DataSourceConfig objects for different types of datasources.
 * This separates configuration creation from datasource construction.
 */
public class DataSourceConfigFactory {

    /**
     * Creates a DataSourceConfig based on the provided type.
     * 
     * @param type String representing datasource type (KAFKA, SQS, RABBITMQ, WEBHOOK)
     * @return DataSourceConfig appropriate for the requested datasource
     */
    public static DataSourceConfig createConfig(String type) {

        /*For now we are adding manual configurations we can also take this in the runtime via apis */

        switch (type.toUpperCase()) {
            case "KAFKA":
                return new KafkaConfig(
                        "KafkaSource",
                        "localhost:9092",
                        "orders-topic",
                        "order-consumer-group",
                        true,
                        1000
                );

            case "SQS":
                return new AwsSqsConfig(
                        "SqsSource",
                        "https://sqs.ap-south-1.amazonaws.com/1234567890/orders",
                        "ap-south-1",
                        "ACCESS_KEY_123",
                        "SECRET_KEY_456",
                        20
                );

            case "RABBITMQ":
                return new RabbitMqConfig(
                        "RabbitSource",
                        "localhost",
                        5672,
                        "guest",
                        "guest",
                        "order-queue"
                );

            case "WEBHOOK":
                return new WebHookConfig(
                        "WebhookSource",
                        "https://example.com/api/webhook",
                        "auth-token-123",
                        60
                );

            default:
                throw new IllegalArgumentException("Unknown Data Source Type: " + type);
        }
    }
}
