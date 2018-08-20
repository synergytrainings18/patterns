package Builder;
import Builder.Application;

public class Client {
    public static void main(String[] args) {
        Application aus_fhf = new Application.ApplicationBuilder("AUS-FHF")
                .host("localhost")
                .port(8080)
                .databaseNameType("MSSQL")
                .kbDatabaseName("DEV-FHF-PPMS-Phase3-KB")
                .dataDatabaseName("DEV-FHF-PPMS-Phase3-DATA")
                .build();
        System.out.println(aus_fhf.toString());
        aus_fhf.deploy();
        aus_fhf.start();
        aus_fhf.stop();
    }
}
