/**
 * Created by ruzanna.hovsepyan on 9/10/2018.
 */
public class Demo {
    public static void main(String[] args) {
        FacadeForExportFile.exportFile(FacadeForExportFile.FileTypes.EXCEL,"/file");
        FacadeForExportFile.exportFile(FacadeForExportFile.FileTypes.WORD,"/file");
        FacadeForExportFile.exportFile(FacadeForExportFile.FileTypes.XML,"/file");
    }
}
