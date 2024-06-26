import java.util.*;
class Student{
    int rno;
    String name;
    int age;
    float fees;

    public Student(int rno,String name,int age,float fees){
        super();
        this.rno=rno;
        this.name=name;
        this.age=age;
        this.fees=fees;
    }

    @Override
    public String toString(){
        return rno+" "+name+" "+age+" "+fees;
    }
}

class HelloWorld{
    public static void main(String[] args) {
        List <Student> s = new <Student>ArrayList();
        s.add(new Student(1,"er",20,20000.00f));
        s.add(new Student(2,"atk",15,15000.00f));
        s.add(new Student(3,"def",10,10000.00f));

        System.out.println("Sorting on the basis of name...");

        //implementing lambda expression
        Collections.sort(s,(s1,s2)->{return s1.name.compareTo(s2.name);});
        for(Student l:s){
            System.out.println(l);
        }
        System.out.println("Sorting by age");

        Collections.sort(s,(s1,s2)->s1.age-s2.age);
        s.forEach((l)->System.out.println(l));

        System.out.println("Sorting by fees");

        Collections.sort(s,(s1,s2)->(int)s1.fees-(int)s2.fees);
        s.forEach((l)->System.out.println(l));
    }
}