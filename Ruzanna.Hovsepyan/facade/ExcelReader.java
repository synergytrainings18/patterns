import java.io.File;

/**
 * Created by ruzanna.hovsepyan on 9/10/2018.
 */
public class ExcelReader {
    String filePath;

    public ExcelReader(String filePath) {
        this.filePath = filePath;
    }

    void read(){
        try (XSSFWorkbook workbook = new XSSFWorkbook(filePath);) {
            project = getNewProjectVersion();
            for (TabSheet tabSheet : sheets) {
                if (!workbook.getSheetAt(tabSheet.getSheetIndex()).getSheetName().equals(tabSheet.getSheetName())) {
                    errorMessages.putIfAbsent(exFile.getName(), new ArrayList<>());
                    errorMessages.get(exFile.getName()).add("Tab order is incorrect");
                    continue START;
                }
            }
            for (TabSheet shR : sheets) {
                shR.readAndValidate(project, workbook);
            }
            for (TabSheet shC : sheets) {
                shC.createFunctionalData(project);
            }

        } catch (Exception e) {
            e.printStackTrace();
            errorMessages.putIfAbsent(exFile.getName(), new ArrayList<>());
        }
    }
}
