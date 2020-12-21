package IQ_Study;

public class Polyndrome {
    public static void main(String[] args) {
        System.out.println(isPolyndrome("madam"));
        System.out.println(isPolyndrome("Esra"));
        System.out.println(isPolyndrome("kazak"));


    }
    public static boolean isPolyndrome(String word){
        String newWord="";
        String newWord2="";
        for(int i=0; i<=word.length()/2; i++){
            newWord+=word.charAt(i);

        }
        for(int i=word.length()-1; i>=word.length()/2;i--){
            newWord2+=word.charAt(i);
        }
        if (newWord.equals(newWord2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPoly(String str){
        int head=0;
        int tail=str.length()-1;
        while(head<tail){
            if(str.charAt(head)!=str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
    public static boolean isPolindromeOrhan(String str){
        String bld = new StringBuilder(str).reverse().toString();
        if(bld.equals(str)){
            return true;
        }
        return false;
    }
    public static boolean isPalindromeNaive(String s){
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = sb1.reverse();
        if (s.equals(String.valueOf(sb2))){
            return true;
        }
        return false;
    }
}
