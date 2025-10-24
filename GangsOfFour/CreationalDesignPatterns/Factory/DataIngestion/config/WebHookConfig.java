package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config;

public class WebHookConfig extends DataSourceConfig {
    private String endpointUrl;
    private String authToken;
    private int pollIntervalSec;

    public WebHookConfig(String sourceName, String endpointUrl, String authToken, int pollIntervalSec) {
        super(sourceName);
        this.endpointUrl = endpointUrl;
        this.authToken = authToken;
        this.pollIntervalSec = pollIntervalSec;
    }

    public String getEndpointUrl() { return endpointUrl; }
    public String getAuthToken() { return authToken; }
    public int getPollIntervalSec() { return pollIntervalSec; }
}
