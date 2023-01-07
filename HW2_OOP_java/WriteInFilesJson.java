import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WriteInFilesJson extends WriteInFiles {

    @Override
    void SaveFiles(String name, Map<String, Double> maps) {
        String pathProject = System.getProperty("user.dir");
        String pathFiles = pathProject.concat("/" + name + ".json");
        File fileJson = new File(pathFiles);
        File fileTemp = new File(pathProject.concat("/tmp.json"));


        try {
            FileWriter fwJson = new FileWriter(fileJson, true);
            FileReader JsonFileRead = new FileReader(fileJson);
            BufferedReader readerJson = new BufferedReader(JsonFileRead);

            long countLines = readerJson.lines().count();
            System.out.println(countLines);

            if (countLines == 0) fwJson.append("{\n");

            for (Map.Entry<String, Double> entry : maps.entrySet()) {
                if (countLines == 0) fwJson.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue());
                if (countLines > 0) {
                    fwJson.append(",\n\"" + entry.getKey() + "\"" + ":" + entry.getValue());
                }
            }
            fwJson.append("\n}");
            fwJson.close();
            JsonFileRead.close();

            FileWriter fwTemp = new FileWriter(fileTemp, true);
            List<String> listOfStrings = new ArrayList<String>();
            FileReader fileReadTemp = new FileReader(fileJson);
            BufferedReader readerTemp = new BufferedReader(fileReadTemp);

            String line = readerTemp.readLine();
            int i = 0;

            while (line != null) {
                if (!line.contains("}") && !line.equals(",")) {
//                    System.out.println(line + " - " + i);
                    if (i == 1 && countLines != 0 && !line.contains(",")) listOfStrings.add(line + ",");
                    else if (i > 1 && i < countLines - 1 && !line.contains(",")) listOfStrings.add(line + ",");
                    else listOfStrings.add(line);
                    i++;
                }

                line = readerTemp.readLine();
            }
            listOfStrings.add("}");
            Files.write(fileJson.toPath(), listOfStrings);

//            String[] array = listOfStrings.toArray(new String[0]);
//            for (String str : array) {
//                System.out.println(str);
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
