package Polymorphysim;

import java.util.Arrays;

public class LabAttendance extends Attendance {
   private String[] labSubjects;

    public LabAttendance(String[] labSubjects, String[] studentNames, int[] studentIDs) {
        super(studentNames, studentIDs);
        this.labSubjects = labSubjects;
    }


    public void enterGrade(String subject, int[] gradeForSubject) {
        int[][] grades = new int[this.labSubjects.length][super.studentNames.length];
        for (int i = 0; i < this.labSubjects.length; i++) {
            if (labSubjects[i] == subject) {
                grades[i] = gradeForSubject;
            }
        }

        System.out.print(subject);
        for(int grade[]:grades){
            for(int gradeShow:grade){
                System.out.print(gradeShow+"\t");
            }
        }
    }
}
