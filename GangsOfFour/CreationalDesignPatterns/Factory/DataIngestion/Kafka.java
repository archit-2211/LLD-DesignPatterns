package GangsOfFour.CreationalDesignPatterns.Factory.DataIngestion;



public class Kafka implements Datasource {
    private String bootstrapServers ; 
    private String topicName ; 
    private String groupId ; 
    private boolean enableAutoCommit ; 
    private int pollTimeOutMs ;

    private Kafka() {}
    public void connect() {
       System.out.println("Connecting Using Datasource : KAFKA") ; 
    }
  
    public void fetch() {
        System.out.println("Fetching using KAFKA") ; 
    } 


    public static class KafkaBuilder {
        private String bootstrapServers ; 
        private String topicName ; 
        private String groupId ; 
        private boolean enableAutoCommit ; 
        private int pollTimeOutMs ;
        

        /*
         * Mandatory Parameters will be passed here in the constructor itself
         */
        public KafkaBuilder (String groupId, boolean enableAutoCommit) { 
            this.groupId = groupId ; 
            this.enableAutoCommit = enableAutoCommit ; 


        }

        /*Adding custom settors */ 

        public KafkaBuilder setBootstrapServers(String servers) {
            this.bootstrapServers = servers ; 
            return this ; 
        }

        public KafkaBuilder setTopicName(String name) {
            this.topicName = name; 
            return this ; 
        }

        public KafkaBuilder setPollTimeOut(int timeoUT) {
            this.pollTimeOutMs = timeoUT ; 
            return this ; 
        }

        public Kafka build() { 
            Kafka object = new Kafka() ; 
            object.bootstrapServers = this.bootstrapServers ; 
            object.topicName = this.topicName ; 
            object.groupId = this.groupId ; 
            object.enableAutoCommit = this.enableAutoCommit ; 
            object.pollTimeOutMs = this.pollTimeOutMs ; 
            return object ; 
        }


    }


    
}
