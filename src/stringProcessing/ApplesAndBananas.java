package stringProcessing;

public class ApplesAndBananas {
    public static void main(String[] args) {
String str="Apples and babanas";
        System.out.println(convertVowel(str,'U'));
        System.out.println(convertVowel("apples and bananas", 'I'));
    }
    public static StringBuilder convertVowel(String sentence, char v){
       StringBuilder str=new StringBuilder(sentence);
       StringBuilder newS=new StringBuilder(sentence.toUpperCase());
       for(int i=0; i<newS.length(); i++){
           if(newS.charAt(i)==65 ||newS.charAt(i)==69 ||newS.charAt(i)==79 || newS.charAt(i)==85 ||newS.charAt(i)==73){
             newS.setCharAt(i,v);
           }
       }
       return newS;
    }
    /*
      public static String replaceVowels(String str,char replacement){
        StringBuilder builder = new StringBuilder(str);
        String vowels = "aeuio";
        for (int i = 0 ; i < builder.length() ; i++) {
            //System.out.println(builder.substring(i));
            if(vowels.contains(builder.substring(i,i+1))){
                System.out.println("OK");
                builder.setCharAt(i,replacement);
            }
        }
        return builder.toString();
        //melih
         public static String replace(String s,String c){
        return s.replaceAll("[aeiuo]",c);


     */
}
