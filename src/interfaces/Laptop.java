package interfaces;

public class Laptop implements Computers {

    protected String mainBoardSpec;
    protected int memorySize;
    protected double CpuSpeed;
    protected String CPUtype;
    protected double batteryPercentage;

    public Laptop(String mainBoardSpec, int memorySize, double cpuSpeed, String CPUtype, double batteryPercentage) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        CpuSpeed = cpuSpeed;
        this.CPUtype = CPUtype;
        this.batteryPercentage = batteryPercentage;
    }
    public void setMainBoard(){

if(this.mainBoardSpec.contains("intel")){
    System.out.println("Intel mainboard is set");
}
else if(this.mainBoardSpec.contains("amd")){
    System.out.println("AMD mainboard is set");
}
    }
    public void InstallCPU(){
        System.out.println(this.CPUtype+" installed");
    }
    public void InstallMemory(){
        System.out.println("GB memory installed");
    }
    public void ChargeBattery(){
        System.out.println("battery charging");
        this.batteryPercentage++;
    }
   public void showBatteryPercentage(){

    }
    public void setWireless(){
        System.out.println("wireless");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "mainBoardSpec='" + mainBoardSpec + '\'' +
                ", memorySize=" + memorySize +
                ", CpuSpeed=" + CpuSpeed +
                ", CPUtype='" + CPUtype + '\'' +
                ", batteryPercentage=" + batteryPercentage +
                '}';
    }
}
