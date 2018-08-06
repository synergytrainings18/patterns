/**
 * Created by ruzanna.hovsepyan on 8/6/2018.
 */
public class Combo_boxFactory implements AbstractFactory {
    @Override
    public AbstractTypeScriptFile createTypeScriptFiles() {
        return new Combo_boxTypeScriptFile();
    }

    @Override
    public AbstractHtmlFile createHtmlScriptFiles() {
        return new Combo_boxHtmlFile();
    }

    @Override
    public AbstarctCssFile createCssFiles() {
        return new Combo_boxCssFile();
    }
}
