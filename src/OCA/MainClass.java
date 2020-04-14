//package OCA;
//
//public class MainClass {
//    public static void main(String[] args) {
//
//
//        Doctor dr1 = new Doctor("Dr.Nancy");
//        dr1.doSurgery();
//        Doctor dr2=new Doctor("Dr.Oz");
//        //System.out.println(dr1.);
//        Doctor dr3=new Doctor("Joe", "Adams");
//        dr3.speak();
//        System.out.println("handCount before change:"+dr3.handCount);
//        dr3.handCount=3;
//        System.out.println("afterchange:"+dr3.handCount);
//        Person p1=new Doctor("Dr.Robert");
//        Object o1=new Doctor("Dr.Musa");
//        Object o2=new String("text");
//
//
//        p1.doSurgery(); // person is not a dr compile time error override needed, since it is doctor, doctor doing surgery
//       // Person p2=new Person();
//        //p2.doSurgery();//person doing surgery
//Employee e1=new Doctor("Dr. Joe");
//        p1.speak();//speak method inside the dr object
//        dr3.speak();
//
//    }
//    public static void printDrName(Doctor doctor){
//        System.out.println(doctor.getName());
//    }
//}