package MyProjects;

public class SurveyMineBasic {
    public static void main(String[] args) {
        String [] survey={"q1:Java","q2:SQL","q3:HTML"};
        String [] sur={"Yes","No","Maybe"};
        System.out.println("---------Survey------");
        System.out.println("--Question------Choices--");
       for(int i=0 ;i<survey.length; i++){
           System.out.print(survey[i]+"\t\t");
           for(int j=0; j<sur.length; j++){
               System.out.print(sur[j]+"\t");
                        }
           System.out.println();
       }
    }
}
