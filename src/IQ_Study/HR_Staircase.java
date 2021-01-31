package IQ_Study;

public class HR_Staircase {
    public static void main(String[] args) {
staircase(6);
    }
    public static void staircase(int n){
String a="";

       for(int i=0; i<n; i++){
           for(int k=n-1; k>i;k--) {
               a+=" ";
           }
           for(int j=0; j<=i; j++){

               a+="#";

           }
           a+="\n";

       }
        System.out.println(a);
    }
}
