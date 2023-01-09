import java.time.LocalDate;

public class Student {

  private String name;
  private int age;
  private float averageMark;

  public Student(String name, int age, float averageMark){
    this.name = name;
    this.age = age;
    this.averageMark = averageMark;
}

  @Override
  public String toString() {
    return "Student [name=" + name + '\'' +
                  ", date=" + age +
                  ", averageMark=" + averageMark +
                  ']';
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public float getAverageMark() {
    return averageMark;
  }

}
