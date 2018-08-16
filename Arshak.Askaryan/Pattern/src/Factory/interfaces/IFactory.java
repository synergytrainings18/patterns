package Factory.interfaces;

import Factory.util.TableComponentType;

public interface IFactory {
    public TableComponent createComponent(String tableType);
}
