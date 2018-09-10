import javax.sql.rowset.spi.XmlReader;

/**
 * Created by ruzanna.hovsepyan on 9/10/2018.
 */
public class FacadeForExportFile {

    public static void exportFile( FileTypes fileType, String filePath ){

        switch (fileType) {
            case EXCEL:
                ExcelReader excelReader = new ExcelReader(filePath);
                excelReader.read();
            case PDF:
                PdfReader pdfReader=new PdfReader(filePath);
                pdfReader.read();
            case WORD:
                WordReader wordReader= new WordReader(filePath);
                wordReader.read();
            case XML:
                XmlReader xmlReader = new XmlReader(filePath);
                xmlReader.readData();




        }


    }

    public static enum FileTypes {
        XML, EXCEL,WORD,PDF;
    }

}
