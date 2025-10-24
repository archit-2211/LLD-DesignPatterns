package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion;

public class CustomWebHook implements Datasource {
    private String endpointUrl;
    private String authToken;
    private int pollIntervalSec;

    private CustomWebHook() {}

    @Override
    public void connect() {
        System.out.println("Connecting Using Datasource : CUSTOM WEBHOOK");
    }

    @Override
    public void fetch() {
        System.out.println("Fetching using CUSTOM WEBHOOK");
    }

    public static class WebHookBuilder {
        private String endpointUrl;
        private String authToken;
        private int pollIntervalSec = 30; // default 30 seconds

        public WebHookBuilder(String endpointUrl) {
            this.endpointUrl = endpointUrl;
        }

        public WebHookBuilder setAuthToken(String token) {
            this.authToken = token;
            return this;
        }

        public WebHookBuilder setPollIntervalSec(int seconds) {
            this.pollIntervalSec = seconds;
            return this;
        }

        public CustomWebHook build() {
            CustomWebHook obj = new CustomWebHook();
            obj.endpointUrl = this.endpointUrl;
            obj.authToken = this.authToken;
            obj.pollIntervalSec = this.pollIntervalSec;
            return obj;
        }
    }
}
