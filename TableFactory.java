/**
 * Created by ruzanna.hovsepyan on 8/6/2018.
 */
public class TableFactory implements AbstractFactory {
    @Override
    public AbstractTypeScriptFile createTypeScriptFiles() {
        return new TableTypeScriptFile();
    }

    @Override
    public AbstractHtmlFile createHtmlScriptFiles() {
        return new TableHtmlFile();
    }

    @Override
    public AbstarctCssFile createCssFiles() {
        return new TableCssFile();
    }
}
