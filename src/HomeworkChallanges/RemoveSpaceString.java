package HomeworkChallanges;
//Write a method to remove White Spaces from the String. (Only 1 space is allowed) Sample input : "Java        is            Fun"     output : "Java is Fun"
public class RemoveSpaceString {
    public static void main(String[] args) {
removeSpace("java  is  fun");
    }
    public static void removeSpace(String sentence){
       String result=" ";
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)!=' '){
                result+=sentence.charAt(i);
            }
            else  if(sentence.charAt(i)==' '){
                result+=sentence.charAt(i);
            }
            else if(sentence.charAt(i)==' ' && sentence.charAt(i+1)==' '){
                result=result;
            }
            else{
                System.out.println("not valid");
            }

        }
        System.out.println(result);

    }
}
