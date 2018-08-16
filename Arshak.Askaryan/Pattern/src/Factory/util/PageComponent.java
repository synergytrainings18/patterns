package Factory.util;


import Factory.interfaces.IFactory;
import Factory.interfaces.TableComponent;

import java.util.List;

public class PageComponent {
    private IFactory tableFactory;
    private List<TableComponent> tableComponentList;
    public PageComponent(IFactory tableFactory) {
        this.tableFactory = tableFactory;
    }

    public List<TableComponent> createPageTabels(int tableCount, String type) {
        for (int i = 0; i < tableCount; i++) {
            setTable(tableFactory.createComponent(type));
        }
        return tableComponentList;
    }

    public void setTable(TableComponent table) {
        tableComponentList.add(table);
    }
}
