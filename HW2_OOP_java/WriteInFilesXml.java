import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteInFilesXml extends WriteInFiles {

    @Override
    void SaveFiles(String name, Map<String, Double> maps) {
        String pathProject = System.getProperty("user.dir");
        String pathFiles = pathProject.concat("/" + name + ".xml");
        File fileXml = new File(pathFiles);

        try {
            FileWriter fw = new FileWriter(fileXml, true);
            fw.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<students>\n");
            for (Map.Entry<String, Double> entry : maps.entrySet()) {
                fw.append("<student>");
                fw.append("<name>" + entry.getKey() + "</name>\n");
                fw.append("<grade>" + entry.getValue() + "</grade>\n");
                fw.append("</student>\n");
                fw.close();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
