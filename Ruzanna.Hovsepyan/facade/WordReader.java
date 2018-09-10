import java.io.File;

/**
 * Created by ruzanna.hovsepyan on 9/10/2018.
 */
public class WordReader {
    String filePath;

    public WordReader(String filePath) {
        this.filePath = filePath;
    }

    void read(){
        String words[]; // I miss C
        String line;
        HashMap<String, String> hm = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8")))
        {
            while((line = br.readLine() != null)){
                words = line.split("\\s");
                if (hm.containsKey(words[0])){
                    System.out.println("Found duplicate ... handle logic");
                }
                hm.put(words[0],words[1]); //if index==0 is ur key
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
