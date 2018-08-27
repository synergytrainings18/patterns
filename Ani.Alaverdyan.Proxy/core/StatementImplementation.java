package Patterns.Proxy.core;

/**
 * Created by ani.alaverdyan on 8/24/2018.
 */
public class StatementImplementation implements Statement {

    @Override
    public void insert() {
        System.out.println("do insert ");
    }

    @Override
    public void update() {
        System.out.println("do update ");
    }

    @Override
    public void delete() {
        System.out.println("do delete ");
    }
}
