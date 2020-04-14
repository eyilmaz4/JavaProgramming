package exceptions;

public class Q3Test {
    public static void main(String[] args) {

          Q3Answer myLtr = new Q3Answer();
            System.out.println(myLtr.sentence);
            myLtr.printNextLetters();
            Q3Answer myLtr2 = new Q3Answer("Java is fun");
            System.out.println(myLtr2.sentence);
            myLtr2.printNextLetters();
        }

    }
