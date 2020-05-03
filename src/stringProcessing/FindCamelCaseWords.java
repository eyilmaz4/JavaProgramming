package stringProcessing;

public class FindCamelCaseWords {
    public static void main(String[] args) {
        System.out.println(countLetter("FindCamelCaseWords"));
        System.out.println(countUpperCase("FindCamelCaseWords"));
    }
        public static  int countLetter(String s){
            int count =1;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    count++;
                }
            }

            return count;

        }
    private static long countUpperCase(String s) {
        return s.codePoints().filter(c-> Character.isUpperCase(c)).count()+1;
    }








}
