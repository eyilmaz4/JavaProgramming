package HomeworkChallanges;

public class CBlen {
    public static void main(String[] args) {
        String word="deneme";
        String word2=word.substring(1);
        System.out.println(word2);

        System.out.println(delDel("hdelello"));
    }
    public static String delDel(String str) {
        String newS="";
        String del="";
        for(int i=0; i<str.length(); i++){
            if(!(str.charAt(i)=='d' && str.charAt(i+1)=='e' && str.charAt(i+2)=='l')){
               newS+=str.charAt(i);
            }
            else{
                newS+=str.substring(i+2);
            }
        }
        return newS;
    }

}
