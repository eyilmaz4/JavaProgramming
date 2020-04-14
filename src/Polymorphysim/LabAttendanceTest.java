package Polymorphysim;

public class LabAttendanceTest {
    public static void main(String[] args) {
        String students[]={"Melih", "Umedi"};
        String labs[]={"java","C++"};
        int IDs[]={1,2};
        int grades[]={100,100};
        LabAttendance myLab=new LabAttendance(labs,students,IDs);
        myLab.enterGrade("java",grades);

    }
}
