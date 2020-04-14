package HomeworkChallanges;

public class FrontBack {
    public static void main(String[] args) {

    }
    public String frontBack(String str) {
        String newStr=" ";
        if(str.length()>1){
            newStr+=str.charAt(str.length()-1);
            for(int i=1; i<str.length()-1;i++){
                newStr+=str.charAt(i);
            }
            newStr+=str.charAt(0);

        }
        return newStr;
    }

}
