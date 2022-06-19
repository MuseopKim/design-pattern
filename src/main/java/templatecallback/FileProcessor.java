package templatecallback;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

    private String path;

    public FileProcessor(String path) {
        this.path = path;
    }

    public int process(Operator operator) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                result = operator.getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException exception) {
            throw new IllegalArgumentException(path + " file is not exist", exception);
        }
    }
}
