package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion;

public class RabbitMQ implements Datasource {
    private String host;
    private int port;
    private String username;
    private String password;
    private String queueName;

    private RabbitMQ() {}

    @Override
    public void connect() {
        System.out.println("Connecting Using Datasource : RABBITMQ");
    }

    @Override
    public void fetch() {
        System.out.println("Fetching using RABBITMQ");
    }

    public static class RabbitBuilder {
        private String host;
        private int port = 5672;
        private String username;
        private String password;
        private String queueName;

        public RabbitBuilder(String host, String queueName) {
            this.host = host;
            this.queueName = queueName;
        }

        public RabbitBuilder setPort(int port) {
            this.port = port;
            return this;
        }

        public RabbitBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public RabbitBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public RabbitMQ build() {
            RabbitMQ obj = new RabbitMQ();
            obj.host = this.host;
            obj.port = this.port;
            obj.username = this.username;
            obj.password = this.password;
            obj.queueName = this.queueName;
            return obj;
        }
    }
}
