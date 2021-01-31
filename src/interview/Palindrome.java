package interview;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("madam"));
//        System.out.println(isPalindrome("bayan"));
//        System.out.println(isPalindrome("car"));
        System.out.println(isPalinSB("madam"));
        System.out.println(isPalinSB("ccar"));
    }

    public static boolean isPalindrome(String word) {
        int k = 0;
        boolean result=false;
        for (int i = 0; i <= word.length() / 2; i++) {
            for (int j = word.length() - 1; j >= word.length() / 2; j--) {
                if (word.charAt(i) == word.charAt(j)) {
                    result= true;
                }

            }

        }
        return result;
    }
    public  static boolean isPalinSB(String word){
        StringBuilder newWord=new StringBuilder(word);
        if (newWord==newWord.reverse()){
            return true;
        }
        return false;
    }
}