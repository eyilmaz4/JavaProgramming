package interview;

public class SwapWithoutTemp {
    public static void main(String[] args) {
       swap(4,3);
        swap(9,2);
        swap(53,39);
    }
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a+" b: "+b);
    }


}
