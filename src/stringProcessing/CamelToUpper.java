package stringProcessing;

public class CamelToUpper {
    public static void main(String[] args) {
        /*public class ConvertUpper {
            public static void main(String[] args) {
                StringBuilder builder = new StringBuilder("java");
                int letter;
                for (int i = 0 ; i < builder.length() ; i++){
                    letter = builder.codePointAt(i); //get lowercase letter unicode number
                    letter -= 32; //substract 32 to find uppercase unicode value
                    builder.setCharAt(i,(char)letter);
​
                }
                System.out.println(builder);
            }

         */
        convertUpper("CamelCase");

        }
        public static void convertUpper(String a){
        StringBuilder str=new StringBuilder(a);
        int letter;
        for(int i=0; i<str.length(); i++){

            if(str.codePointAt(i)>=97 &&str.codePointAt(i)<=122){
str.setCharAt(i,(char)(str.codePointAt(i)-32));
            }
        }
            System.out.println(str);
        }
}
