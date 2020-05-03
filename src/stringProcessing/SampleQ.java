package stringProcessing;

public class SampleQ {
    public static void main(String[] args) {
        StringBuilder myB=new StringBuilder();
        myB.append("java ");
        myB.append(" is");
        myB.append(" fun");
        System.out.println(myB);
        myB.insert(4," much");
        System.out.println(myB);
        myB.replace(14,17,"so");
        System.out.println(myB);
        myB.delete(0,4);
        System.out.println(myB);
    }
}
