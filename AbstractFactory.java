/**
 * Created by ruzanna.hovsepyan on 8/6/2018.
 */
public interface AbstractFactory {
     AbstractTypeScriptFile createTypeScriptFiles();
     AbstractHtmlFile createHtmlScriptFiles();
     AbstarctCssFile createCssFiles();

}
