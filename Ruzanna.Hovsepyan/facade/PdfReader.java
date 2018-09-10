import java.io.File;

/**
 * Created by ruzanna.hovsepyan on 9/10/2018.
 */
public class PdfReader {
    String filePath;

    public PdfReader(String filePath) {
        this.filePath = filePath;
    }

    void read(){
        PDDocument document = PDDocument.load(new File("test.pdf"));
        if (!document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            String text = stripper.getText(document);
            //download;
        }
    }
}
