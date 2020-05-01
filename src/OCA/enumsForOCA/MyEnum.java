package OCA.enumsForOCA;

public class MyEnum {
    public static void main(String[] args) {
        goToEnv(Environment.STAG);
    }
    public static void goToEnv(Environment env){
        String url="";
       if(env==Environment.PROD) {
           url = "http.na.edu";
       }
       else if(env==Environment.QA) {
           url = "http://stag.na.edu";
       }
         else if(env==Environment.STAG) {
           url = "http://qa.na.edu";
       }

        System.out.println("navigating to: "+url);
    }
}
