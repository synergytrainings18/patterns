package Factory;

import Factory.impl.TableComponentFactory;
import Factory.interfaces.TableComponent;
import Factory.util.PageComponent;

import java.util.List;

/**
 * Created by arshak.askaryan on 11/13/2017.
 */
public class Client {
    public static void main(String[] args) {
        PageComponent dataTableComponentFactory = new PageComponent(new TableComponentFactory());
        List<TableComponent> tabels = dataTableComponentFactory.createPageTabels(3, "EDITABLE_TABLE");
    }
}
