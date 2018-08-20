package Builder;
public class Application {

    private final String applicationName;
    private String host;
    private int port;
    private String databaseNameType;
    private String kbDatabaseName;
    private String dataDatabaseName;

    private Application(ApplicationBuilder applicationBuilder) {
        this.applicationName = applicationBuilder.applicationName;
        this.host = applicationBuilder.host;
        this.port = applicationBuilder.port;
        this.databaseNameType = applicationBuilder.databaseNameType;
        this.kbDatabaseName = applicationBuilder.kbDatabaseName;
        this.dataDatabaseName = applicationBuilder.dataDatabaseName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getDatabaseNameType() {
        return databaseNameType;
    }

    public String getKbDatabaseName() {
        return kbDatabaseName;
    }

    public String getDataDatabaseName() {
        return dataDatabaseName;
    }

    public void deploy() {

        System.out.println("Application deployed...");
    }

    public void start() {
        System.out.println("Application started...");
    }

    public void stop() {
        System.out.println("Application stopped...");
    }

    @Override
    public String toString() {
        return "Application{" +
                "applicationName='" + applicationName + '\'' +
                ", host='" + host + '\'' +
                ", port=" + port +
                ", databaseNameType='" + databaseNameType + '\'' +
                ", kbDatabaseName='" + kbDatabaseName + '\'' +
                ", dataDatabaseName='" + dataDatabaseName + '\'' +
                '}';
    }

    public static class ApplicationBuilder {
        private final String applicationName;
        private String host;
        private int port;
        private String databaseNameType;
        private String kbDatabaseName;
        private String dataDatabaseName;

        ApplicationBuilder(String applicationName) {
            this.applicationName = applicationName;
        }

        public ApplicationBuilder host(String host) {
            this.host = host;
            return this;
        }

        public ApplicationBuilder port(int port) {
            this.port = port;
            return this;
        }

        public ApplicationBuilder databaseNameType(String databaseNameType) {
            this.databaseNameType = databaseNameType;
            return this;
        }

        public ApplicationBuilder kbDatabaseName(String kbDatabaseName) {
            this.kbDatabaseName = kbDatabaseName;
            return this;
        }

        public ApplicationBuilder dataDatabaseName(String dataDatabaseName) {
            this.dataDatabaseName = dataDatabaseName;
            return this;
        }

        public Application build() {
            return new Application(this);
        }

    }
}
