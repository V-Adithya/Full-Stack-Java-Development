import java.io.*;

class Depersist {

  public static void main(String args[]) {
    try {
      FileInputStream fin = new FileInputStream("d:\\f.txt");
      ObjectInputStream in = new ObjectInputStream(fin);
      Student s = (Student) in.readObject();
      System.out.println(s);
      in.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
