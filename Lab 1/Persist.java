import java.io.*;

class Persist {

  public static void main(String args[]) {
    try {
      Student s1 = new Student(1, "ram", 10000.00f);
      FileOutputStream fout = new FileOutputStream("d:\\f.txt");
      ObjectOutputStream out = new ObjectOutputStream(fout);
      out.writeObject(s1);
      out.flush();
      out.close();
      System.out.println("success");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
