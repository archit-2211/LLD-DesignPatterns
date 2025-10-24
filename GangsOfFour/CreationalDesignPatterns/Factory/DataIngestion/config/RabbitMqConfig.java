package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config;

public class RabbitMqConfig extends DataSourceConfig {
    private String host;
    private int port;
    private String username;
    private String password;
    private String queueName;

    public RabbitMqConfig(String sourceName, String host, int port, String username, 
                          String password, String queueName) {
        super(sourceName);
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.queueName = queueName;
    }

    public String getHost() { return host; }
    public int getPort() { return port; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getQueueName() { return queueName; }
}
