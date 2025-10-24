package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config;

public class AwsSqsConfig extends DataSourceConfig {
    private String queueUrl;
    private String region;
    private String accessKey;
    private String secretKey;
    private int waitTimeSeconds;

    public AwsSqsConfig(String sourceName, String queueUrl, String region, String accessKey,
                        String secretKey, int waitTimeSeconds) {
        super(sourceName);
        this.queueUrl = queueUrl;
        this.region = region;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.waitTimeSeconds = waitTimeSeconds;
    }

    public String getQueueUrl() { return queueUrl; }
    public String getRegion() { return region; }
    public String getAccessKey() { return accessKey; }
    public String getSecretKey() { return secretKey; }
    public int getWaitTimeSeconds() { return waitTimeSeconds; }
}
