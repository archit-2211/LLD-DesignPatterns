package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion;

public class AwsSqs implements Datasource {
    private String queueUrl;
    private String region;
    private String accessKey;
    private String secretKey;
    private int waitTimeSeconds;

    private AwsSqs() {}

    @Override
    public void connect() {
        System.out.println("Connecting Using Datasource : AWS SQS");
    }

    @Override
    public void fetch() {
        System.out.println("Fetching using AWS SQS");
    }

    public static class SqsBuilder {
        private String queueUrl;
        private String region;
        private String accessKey;
        private String secretKey;
        private int waitTimeSeconds = 10; // default

        public SqsBuilder(String queueUrl, String region) {
            this.queueUrl = queueUrl;
            this.region = region;
        }

        public SqsBuilder setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public SqsBuilder setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public SqsBuilder setWaitTimeSeconds(int seconds) {
            this.waitTimeSeconds = seconds;
            return this;
        }

        public AwsSqs build() {
            AwsSqs obj = new AwsSqs();
            obj.queueUrl = this.queueUrl;
            obj.region = this.region;
            obj.accessKey = this.accessKey;
            obj.secretKey = this.secretKey;
            obj.waitTimeSeconds = this.waitTimeSeconds;
            return obj;
        }
    }
}
