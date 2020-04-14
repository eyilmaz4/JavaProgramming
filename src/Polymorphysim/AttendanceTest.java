package Polymorphysim;

import java.util.Arrays;

public class AttendanceTest {
    public static void main(String[] args) {
        String[] studentNames = {"Esra", "Birsen", "Inci", "Sibel", "Rumeysa"};
        int[] mondayAttendance = {1, 1, 1, 1, 1};
        int[] tuesdayAttendance = {0, 0, 1, 0, 1};
        int[] wednesdayAttendance = {1, 1, 0, 0, 1};
        int[] thursdayAttendance = {0, 0, 1, 1, 1};
        int[] fridayAttendance = {0, 0, 0, 0, 0};
        int[] studentIDs = {1, 2, 3, 4, 5};
        String [] labSubjects={"java", "c++"};
        Attendance myStudent = new Attendance(studentNames, studentIDs);
        myStudent.enterCurrentDayAttendance("Monday", mondayAttendance);
        System.out.println();
        myStudent.enterCurrentDayAttendance("tuesday", tuesdayAttendance);
        myStudent.enterCurrentDayAttendance("wednesday", wednesdayAttendance);
myStudent.enterCurrentDayAttendance("thursday", thursdayAttendance);
myStudent.enterCurrentDayAttendance("friday", fridayAttendance);
myStudent.getWeeklyCheckList();
myStudent.printWeeklyAttendance();
myStudent.mostAttendingStudent();

myStudent.printDailyAttendance("monday");
myStudent.printDailyAttendance("tuesday");
myStudent.printDailyAttendance("wednesday");
myStudent.printDailyAttendance("thursday");
myStudent.printDailyAttendance("friday");


           }
}