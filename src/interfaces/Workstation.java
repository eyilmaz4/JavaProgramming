package interfaces;

public class Workstation extends Computer implements Computers {
    protected String housingType;
    protected int screenSize;

    public Workstation(String mainBoardSpec, int memorySize, double cpuSpeed, String CPUtype, String housingType, int screenSize) {
        super(mainBoardSpec, memorySize, cpuSpeed, CPUtype);
        this.housingType = housingType;
        this.screenSize = screenSize;
    }
    public void setMainBoard(){
        System.out.println("mainboard setted");
    }
    public  void InstallCPU(){
        System.out.println("installed CPU");
    }
    public  void InstallMemory(){
        System.out.println("memory intalled");
    }

    public String getHousingType() {
        return housingType;
    }

    public void setHousingType(String housingType) {
        this.housingType = housingType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
public void setWireless(){
    System.out.println("wireless");
}
    @Override
    public String toString() {
        return "Workstation{" +
                "housingType='" + housingType + '\'' +
                ", screenSize=" + screenSize +
                ", mainBoardSpec='" + mainBoardSpec + '\'' +
                ", memorySize=" + memorySize +
                ", CpuSpeed=" + CpuSpeed +
                ", CPUtype='" + CPUtype + '\'' +
                '}';
    }
}
