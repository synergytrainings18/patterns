package Patterns.Proxy.client;

import Patterns.Proxy.core.Person;
import Patterns.Proxy.core.Statement;
import Patterns.Proxy.core.StatementImplementation;
import Patterns.Proxy.core.StatementProxy;

/**
 * Created by ani.alaverdyan on 8/24/2018.
 */
public class ProxyDemo {
    public static void main(String[] args) {

        Statement statement = new StatementImplementation();
//        statement.insert();
//        statement.update();
//        statement.delete();
//
        Person person = new Person();
        person.setName("Ani");
        person.setId(1);
        person.setCanInsert(true);
        person.setCanUpdate(true);
        person.setCanDelete(false);
        statement = new StatementProxy(person);
        statement.insert();
        statement.update();
        statement.delete();
    }
}
