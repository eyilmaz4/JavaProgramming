package stringProcessing;

public class Second {
    public static void main(String[] args) {
        StringBuilder myB= new StringBuilder("Camera");
        StringBuilder my2B=new StringBuilder(myB.reverse().toString());
        System.out.println(my2B);
        if(myB.equals(my2B)){
            System.out.println("they are same");
        }
        else {
            System.out.println("they are different");
        }
        System.out.println(myB.capacity());
        myB.append("this is new string just added");
        System.out.println(myB);
        System.out.println(myB.capacity());
        myB.append("This is another String just added");
        System.out.println(myB.capacity());
    }
}
