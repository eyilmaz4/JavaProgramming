package oca_Practice;

public class WhizP2_46 {
    public static void main(String[] args) {
        Person stu=new Student();
        stu.read();
        stu.listen();
        //((Student)stu).run();

    }
}

 class Person{
     void read(){
         System.out.println("bcv");
     }

    void listen(){
        System.out.println("radio");
    }
}

class Student extends Person{
 void read(){
       System.out.println("Reading");
   }
   void run(){
       System.out.println("run");
   }
}
