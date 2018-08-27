package Proxy;

public class MainEntity implements Entity {

    public MainEntity() {
        loadEntity();
    }


    @Override
    public void loadEntity() {
        try {
            Thread.sleep(5000);
            System.out.println("Main entity loaded");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
