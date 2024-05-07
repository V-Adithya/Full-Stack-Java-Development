import java.io.*;
import java.util.*;

class Student {
    int rollno;
    String name;
    float fees;
    String branch;
    int year;
    int sem;
    int age;
    static String clg;

    public Student(int rollno, String name, float fees, String branch, int year, int sem, int age) {
        this.rollno = rollno;
        this.name = name;
        this.fees = fees;
        this.branch = branch;
        this.year = year;
        this.sem = sem;
        this.age = age;
        clg = "PU";
    }

    public String toString() {
        return rollno + " " + name + " " + fees + " " + branch + " " + year + sem + " " + age + " " + clg + "\n";
    }

}

class AgeComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

class NameComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s1.name.compareTo(s2.name);
    }
}

class FeesCompator implements Comparator {
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.fees == s2.fees) {
            return 0;
        } else if (s1.fees > s2.fees) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Temp {
    public static void main(String[] args){
        ArrayList s1 = new ArrayList<>();
        s1.add(new Student(1, "Shruthi", 10000.00f, "cse", 1, 1, 18));
        s1.add(new Student(2, "Venky", 12000.00f, "ise", 1, 2, 20));
        s1.add(new Student(3, "Bella", 17000.00f, "ece", 1, 1, 19));
        s1.add(new Student(3, "Alina", 12000.00f, "eee", 1, 1, 19));
        s1.add(new Student(3, "Riya", 11000.00f, "mech", 1, 1, 21));
        System.out.println("Sorting by Name");
        System.out.println("");
        Collections.sort(s1, new NameComparator());
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st);
        }
        System.out.println("Sorting by Age");
        System.out.println("");
        Collections.sort(s1, new AgeComparator());
        Iterator itr2 = s1.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st);
        }
    }
}