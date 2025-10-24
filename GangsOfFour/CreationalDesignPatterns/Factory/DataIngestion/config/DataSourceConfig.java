package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config; 

public abstract class DataSourceConfig {
    private String sourceName;
    public DataSourceConfig(String sourceName) {
        this.sourceName = sourceName;
    }
    public String getSourceName() {
        return sourceName;
    }
}
