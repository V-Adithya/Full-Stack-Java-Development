import java.io.*;

public class Student implements Serializable {

  int id;
  String name;
  float fees;

  public Student(int id, String name, float fees) {
    this.id = id;
    this.name = name;
    this.fees = fees;
  }

  public String toString() {
    return id + " " + name + " " + fees + "\n";
  }
}
