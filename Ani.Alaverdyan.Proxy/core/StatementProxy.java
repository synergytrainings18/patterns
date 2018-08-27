package Patterns.Proxy.core;

/**
 * Created by ani.alaverdyan on 8/24/2018.
 */
public class StatementProxy implements Statement {

    Person person;
    Statement statementImplementation = new StatementImplementation();

    public StatementProxy(Person person) {
        this.person = person;
    }

    @Override
    public void insert() {
        if (person.isCanInsert()) {
            statementImplementation.insert();
        } else {
            System.out.println(person.getName() + " You don't have permission for insert");
        }

    }

    @Override
    public void update() {
        if (person.isCanUpdate()) {
            statementImplementation.update();
        } else {
            System.out.println(person.getName() + " You don't have permission for update");
        }
    }

    @Override
    public void delete() {
        if (person.isCanDelete()) {
            statementImplementation.delete();
        } else {
            System.out.println(person.getName() + " You don't have permission for delete");
        }
    }
}
