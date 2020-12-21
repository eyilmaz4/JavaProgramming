package IQ_Study;

public class JavaPythonQ {
    public static void main(String[] args) {
        System.out.println(incomplete("vegeterian", 2));
    }
    public static String incomplete(String word, int n){
        String newStr="";
        if (n<word.length()){
            for(int i=0; i<word.length(); i++){
                if(i!=n){
                    newStr+=word.charAt(i);
                }
                else {
                    continue;
                }
            }
        }
        return newStr;
    }
}
