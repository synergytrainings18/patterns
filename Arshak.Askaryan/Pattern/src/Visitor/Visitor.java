package Visitor;

/**
 * Created by Arshak Askaryan on 05.11.2017.
 */
public interface Visitor {
    int visit(Fruit fruit);

    int visit(Drink drink);

    int visit(Notebook notebook);
}
