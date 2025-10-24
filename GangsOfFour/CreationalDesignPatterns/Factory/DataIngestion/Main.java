
package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion;

import GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config.DataSourceConfig;
import GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion.config.DataSourceConfigFactory;

/**
 * Demonstrates end-to-end DataSource creation using:
 * - DataSourceConfigFactory (creates the right config)
 * - DataSourceFactory (creates the actual Datasource)
 * - Builder pattern (constructs each datasource cleanly)
 */
public class Main {

    public static void main(String[] args) {

        // ✅ Step 1: Choose your source type (could be from config file / env)
        String type = "KAFKA";  // try "SQS", "RABBITMQ", or "WEBHOOK"

        // ✅ Step 2: Create a config object for the selected type
        DataSourceConfig config = DataSourceConfigFactory.createConfig(type);

        // ✅ Step 3: Use central DataSourceFactory to get the actual data source
        Datasource datasource = DataSourceFactory.getDataSource(config);

        // ✅ Step 4: Use the data source
        datasource.connect();
        datasource.fetch();

        // ✅ Step 5 (Optional): Simulate runtime switch
        System.out.println("\nSwitching to SQS...");
        DataSourceConfig sqsConfig = DataSourceConfigFactory.createConfig("SQS");
        Datasource sqsSource = DataSourceFactory.getDataSource(sqsConfig);
        sqsSource.connect();
        sqsSource.fetch();
    }
}
