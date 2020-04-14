package HomeworkChallanges;

public class A {
         static int counter=0;
        int count;

        public A(int count){
            this.count=count;
        }
        public void print(){
            System.out.println("Non static attribute(part of object) value :"+this.count);
            counter++;
            System.out.println("Number of method call: "+counter+" (that is static)");
        }
    }
    class Main {
        public static void main(String[] args) {
            A o1 = new A(5);
            A o2 = new A(10);
            A o3 = new A(20);
            o1.print();
            o2.print();
            o3.print();
        }
    }

