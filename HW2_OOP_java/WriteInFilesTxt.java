import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WriteInFilesTxt extends WriteInFiles {

    @Override
    void SaveFiles(String name, Map<String, Double> maps) {
        String pathProject = System.getProperty("user.dir");
        String pathFiles = pathProject.concat("/" + name + ".txt");
        File fileTxt = new File(pathFiles);

        try {
            FileWriter fw = new FileWriter(fileTxt, true);
            for (Map.Entry<String, Double> entry : maps.entrySet()) {
                fw.append(entry + "\n");
                fw.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
