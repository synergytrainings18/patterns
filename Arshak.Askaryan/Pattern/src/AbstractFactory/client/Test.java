package AbstractFactory.client;

import AbstractFactory.api.TableFactory;
import AbstractFactory.api.TableMaker;

public class Test {
    public static void main(String[] args) {
        TableFactory tableFactory = new MutantTableFactory();
        TableMaker tableMaker = new TableMaker(tableFactory);
        tableMaker.makeTable();
    }
}
