package Polymorphysim;

import java.util.Arrays;

public class Attendance {
    protected String[] studentNames;
    protected int[] studentIDs;
    protected int[][] weeklyCheckList;
    final String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public Attendance(String[] studentNames, int[] studentIDs) {
        this.studentNames = studentNames;
        this.studentIDs = studentIDs;
        int[][] weeklyEmpty = new int[this.daysOfWeek.length][this.studentNames.length];
        this.weeklyCheckList = weeklyEmpty;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "studentNames=" + Arrays.toString(studentNames) +
                ", studentIDs=" + Arrays.toString(studentIDs) +
                ", weeklyCheckList=" + Arrays.toString(weeklyCheckList) +
                ", daysOfWeek=" + Arrays.toString(daysOfWeek) +
                '}';
    }

    public int[][] getWeeklyCheckList() {
        return weeklyCheckList;
    }

    public void setWeeklyCheckList(int[][] weeklyCheckList) {
        this.weeklyCheckList = weeklyCheckList;
    }

    public int[][] enterCurrentDayAttendance(String today, int[] attendanceOfDay) {
        for (int j = 0; j < this.daysOfWeek.length; j++) {
            if (this.daysOfWeek[j].equalsIgnoreCase(today)) {

                for (int i = 0; i < this.studentNames.length; i++) {
                    this.weeklyCheckList[j][i] = attendanceOfDay[i];
                }

//                for (int nums[] : weeklyCheckList) {
//                    for (int num : nums) {
//                        System.out.print(num);
            }
//                    System.out.println();
        }
        return this.weeklyCheckList;
    }

    public void printWeeklyAttendance() {
        System.out.println("\t\t Esra \t Birsen\t Inci\t Sibel\t Rumeysa");
        for (int i = 0; i < this.daysOfWeek.length; i++) {
            System.out.print(this.daysOfWeek[i] + "\t\t");
            for (int j = 0; j < this.studentNames.length; j++) {

                System.out.print("\t" + this.weeklyCheckList[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
    public void printDailyAttendance(String day) {
        System.out.println("\t\t Esra \t Birsen\t Inci\t Sibel\t Rumeysa");

        for (int i = 0; i < this.daysOfWeek.length; i++) {
            if (this.daysOfWeek[i].equalsIgnoreCase(day)) {
                for (int j = 0; j < this.studentNames.length; j++) {
                    if (day.equalsIgnoreCase("friday")) {
                        System.out.print("\t" + this.weeklyCheckList[4][j] + "\t\t");
                    } else if (day.equalsIgnoreCase("monday")) {
                        System.out.print("\t" + this.weeklyCheckList[0][j] + "\t\t");
                    } else if (day.equalsIgnoreCase("tuesday")) {
                        System.out.print("\t" + this.weeklyCheckList[1][j] + "\t\t");
                    } else if (day.equalsIgnoreCase("wednesday")) {
                        System.out.print("\t" + this.weeklyCheckList[2][j] + "\t\t");
                    } else if (day.equalsIgnoreCase("thursday")) {
                        System.out.print("\t" + this.weeklyCheckList[3][j] + "\t\t");
                    }
                }
            }
        }
        System.out.println();
    }
    public void mostAttendingStudent() {
        int max = 0;
        int[] maxRow = new int[this.studentNames.length];
        for (int i = 0; i < this.studentNames.length ; i++) {
            max=0;
            for (int j = 0; j < this.daysOfWeek.length; j++) {
                max += this.weeklyCheckList[i][j];
            }
            maxRow[i]=max;
        }
        int newMax=0;
        for(int i=0; i<maxRow.length; i++){
            if(maxRow[i]>newMax){
                newMax=maxRow[i];
            }
            System.out.println("max student is"+newMax);
        }

    }
}



