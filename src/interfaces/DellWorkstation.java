package interfaces;

public class DellWorkstation extends Workstation {
    public DellWorkstation(String mainBoardSpec, int memorySize, double cpuSpeed, String CPUtype, String housingType, int screenSize) {
        super(mainBoardSpec, memorySize, cpuSpeed, CPUtype, housingType, screenSize);
    }

    public void installDellSoftware(){
        System.out.println("Dell software installed");
    }
}
