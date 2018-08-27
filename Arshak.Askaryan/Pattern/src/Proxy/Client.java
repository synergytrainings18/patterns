package Proxy;

public class Client {

    public static void main(String[] args) {
        Entity entity =new  MainEntityProxy();
        entity.loadEntity();
    }
}
