package Singleton;

public class Client {
    public static void main(String[] args) {
        Configuration configuration = Configuration.getInstance();
        System.out.println(configuration.getProperty("db.password"));
        System.out.println(configuration.getProperty("app.name"));
    }
}
