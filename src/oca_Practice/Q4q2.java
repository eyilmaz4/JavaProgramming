package oca_Practice;

public class Q4q2 {
    public static void main(String[] args) {
        final int x=0;

        final int y=2;
        int i=(int)(Math.random()*4);
        switch(i){
            case x:{
                System.out.print("A");} break;
            case 1:
                System.out.println("B");
            case 4:
                System.out.println("D");break;
            case y:
                System.out.println("C");
        }
    }
}
