import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static HashMap<String, Double> mapStudent = new HashMap<>();

  public static void main(String[] args) {
    String filename = new String();

    Scanner scans = new Scanner(System.in);
    System.out.println("Введите название файла");
    filename = scans.nextLine();

    WriteInFilesTxt file1 = new WriteInFilesTxt();
    WriteInFilesXml file2 = new WriteInFilesXml();
    WriteInFilesJson file3 = new WriteInFilesJson();

    addstudents(scans);
    file1.SaveFiles(filename,mapStudent);
    file2.SaveFiles(filename,mapStudent);
    file3.SaveFiles(filename,mapStudent);
    scans.close();


  }
  public static void addstudents(Scanner scans){

    System.out.printf("Введите Фамилию Имя Отчество: \n");
    String FIO = scans.nextLine();
    System.out.printf("Введите оценку: \n");
    String mark = scans.nextLine();

    if (!FIO.isEmpty() && !mark.isEmpty() ) {
      mapStudent.put(FIO,Double.parseDouble(mark));
    }else {
      System.out.printf("Попробуйте еще раз: \n");
      addstudents(scans);
    }

  }
}