package itog;

import java.io.FileWriter;
import java.io.IOException;

//import seminar5.model.User;

public class DataWriter {

  public static void dataWriter (Contragent member)  {
    try (FileWriter writer = new FileWriter("DB.txt", false)) {
//      for (Contragent user: member){
//        writer.write(user.toFileString());
//        writer.write("\n");
//      }
      writer.flush();
    }catch (IOException e) {
      throw new RuntimeException(e);
    }
    }
  }