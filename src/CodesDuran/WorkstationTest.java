package CodesDuran;

public class WorkstationTest {
    public static void main(String[] args) {
        String mainboard[]={"intel","3000","128"};
        String anakart[]={"dell", "2000", "120"};
        WorkStation myWrks = new WorkStation(anakart,64,8900,"amd","maxi",42);

        myWrks.setMainBoard();
        myWrks.installMemory(64);
        myWrks.installCPU();
        DellWorkStation myDell = new DellWorkStation(mainboard,128,2500,"intel","tower",29);
     myWrks.installCPU();
    }
}
