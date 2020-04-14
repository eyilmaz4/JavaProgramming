package exceptions;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
writeNextLetter();
    }
    public static void writeNextLetter(){
      Scanner x= new Scanner(System.in);
        System.out.println("enter word");
      String word=x.nextLine();
       String newWord=" ";
        try {
            for(int i=1; i<word.length(); i++){
            newWord+=word.charAt(i);
        }
        newWord+=(char)(word.charAt(word.length()-1)+1);

            System.out.println(newWord);
            System.out.println("successfull");
        }
        catch (NullPointerException e){
            System.out.println("not valid");
        }
    }
}
