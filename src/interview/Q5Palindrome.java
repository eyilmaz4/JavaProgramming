package interview;

public class Q5Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar",true));
    }
    public static boolean isPalindrome(String str){
        for(int i=0,j=str.length()-1 ; i<j ; i++, j--){
            System.out.println("i = "+i+"\t"+"j = "+j);
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(String str,boolean sb){
        StringBuilder original = new StringBuilder(str);
        StringBuilder reversed = original.reverse();
        if (original.equals(reversed)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isnumberPal(int num){
        String number=" "+num;
        return isPalindrome(number);
    }
/*
vahit
public static boolean isPalindrome (String s){
    StringBuilder sb1 = new StringBuilder(s);
    StringBuilder sb2 = sb1.reverse();
    if (s.equals(String.valueOf(sb2))){
        return true;
    }
    return false;
}
 */
}
