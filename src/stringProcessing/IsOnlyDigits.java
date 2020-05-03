package stringProcessing;

public class IsOnlyDigits {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("12u44");
        boolean result=false;
int count=0;
        for( int i=0; i<str.length(); i++) {
            if (!(str.codePointAt(i) >= 48 && str.codePointAt(i) <= 57)) {
               count++;
            }
        }
        if(count==0){
            result=true;
        }
        System.out.println(result);
        /* Ferhat s solution

        public static void main(String args[]){
    String sample = "north American 2020";
    char[] chars = sample.toCharArray();
    for(char c : chars){
        if(c>=48&&c<=57){
            System.out.println(c);
        }

        //Duran
        public class AllDigits {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("019846515641564");
        System.out.println(builder.codePointAt(2));
        System.out.println(isAllDigit(builder));
    }
    public static boolean isAllDigit(StringBuilder str){
        boolean result = true;
        for (int i = 0; i < str.length() ; i++) {
            if( !(str.codePointAt(i)>=48 && str.codePointAt(i)<=57) ){
                result = false;
​
            }
        }
        return result;
    }

    }
         */
    }
}
