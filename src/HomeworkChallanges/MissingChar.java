package HomeworkChallanges;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println( missingChar("envelope",3));

    }
    public static String missingChar(String str, int n) {
        String newString=" ";
        for(int i=0; i<str.length(); i++){
            if((str.charAt(i))!=(str.charAt(n))){
                newString+=str.charAt(i);
            }
        }
        return newString;
    }

}
