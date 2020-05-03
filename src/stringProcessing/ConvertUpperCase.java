package stringProcessing;

public class ConvertUpperCase {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("java");
        StringBuilder str2= new StringBuilder("");
        System.out.println(str);
        str.replace(0,4,"JAVA");
        System.out.println(str);

   for( int i=0; i<str.length()-1; i++){
       str2.insert(i,((char)(str.charAt(i)-32)));

}
        System.out.println(str);

   /*
   public class ConvertUpper {
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
    }
}
