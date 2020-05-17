package chatBotProject;

public class ChatSentences {
    public static void main(String[] args) {
        System.out.println(sentence());
    }
    public static String sentence(){
        String [] arr=new String [10];
        arr[0]="Hello";
        arr[1]="Howdy";
        arr[2]="How r u";
        arr[3]="Hi";
        arr[4]="good";
        arr[5]="awesome";
        arr[6]="what s your name";
        arr[7]="How old are you";
        arr[8]="where are you from";
        arr[9]="whats your favorite color";

int index=(int)(Math.random()*10) ;

        return arr[index];
    }

}
