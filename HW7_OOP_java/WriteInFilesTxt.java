package itog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteInFilesTxt {

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
