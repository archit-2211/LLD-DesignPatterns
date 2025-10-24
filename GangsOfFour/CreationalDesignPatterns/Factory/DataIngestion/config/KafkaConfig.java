package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config;

public class KafkaConfig extends DataSourceConfig {
    private String bootstrapServers;
    private String topicName;
    private String groupId;
    private boolean enableAutoCommit;
    private int pollTimeoutMs;

    public KafkaConfig(String sourceName, String bootstrapServers, String topicName, String groupId,
                       boolean enableAutoCommit, int pollTimeoutMs) {
        super(sourceName);
        this.bootstrapServers = bootstrapServers;
        this.topicName = topicName;
        this.groupId = groupId;
        this.enableAutoCommit = enableAutoCommit;
        this.pollTimeoutMs = pollTimeoutMs;
    }

    // Getters only (immutable configuration)
    public String getBootstrapServers() { return bootstrapServers; }
    public String getTopicName() { return topicName; }
    public String getGroupId() { return groupId; }
    public boolean isEnableAutoCommit() { return enableAutoCommit; }
    public int getPollTimeoutMs() { return pollTimeoutMs; }
}
