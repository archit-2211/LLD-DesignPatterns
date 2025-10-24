package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion;
import GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config.AwsSqsConfig;
import GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config.DataSourceConfig;
import GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config.KafkaConfig;

public class DataSourceFactory {
    public static Datasource getDataSource(DataSourceConfig config) {
        if (config instanceof KafkaConfig) {
            return new Kafka.KafkaBuilder(((KafkaConfig) config).getGroupId(),
                                          ((KafkaConfig) config).isEnableAutoCommit())
                            .setBootstrapServers(((KafkaConfig) config).getBootstrapServers())
                            .setTopicName(((KafkaConfig) config).getTopicName())
                            .setPollTimeOut(((KafkaConfig) config).getPollTimeoutMs())
                            .build();
        } else if (config instanceof AwsSqsConfig) {
            AwsSqsConfig sqs = (AwsSqsConfig) config;
            return new AwsSqs.SqsBuilder(sqs.getQueueUrl(), sqs.getRegion())
                            .setAccessKey(sqs.getAccessKey())
                            .setSecretKey(sqs.getSecretKey())
                            .setWaitTimeSeconds(sqs.getWaitTimeSeconds())
                            .build();
        }
        // and so on for RabbitMq and Webhook
        throw new IllegalArgumentException("Unsupported datasource type: " + config.getClass());
    }
}
