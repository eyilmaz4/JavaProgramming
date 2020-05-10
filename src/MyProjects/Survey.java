package MyProjects;

import java.util.List;

public class Survey {
    public static void main(String[] args) {
        SurveyPrepairing mySurvey=new SurveyPrepairing();
       List<SurveyQuestions>survey=mySurvey.prepSurvey(3);
       mySurvey.startSurvey(survey);
       /*
       ublic class Survey {
    public static void main(String[] args) {
        SurveyPreparing mySurvey = new SurveyPreparing();
        List<SurveyQuestions> survey= mySurvey.prepSurvey(3);
        mySurvey.startSurvey(survey);
    }

        */
    }
}
