package interviewQuestions;

public class GivenNumberIsEvenOrOdd {

    //13. Write a method which can identifies given number is even or
    //odd
    public static void main(String[] args) {
        System.out.println("Result :"+identifyOddEven(5));
    }

    public static String identifyOddEven( int n ) {
        return n%2==0 ? "Even" : "odd" ;
    }



}
