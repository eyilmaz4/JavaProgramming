package CodesDuran;

public class Laptop implements Computers{
    protected String mainBoardSpecs;
    protected int memorySize;
    protected int cpuSpeed;
    protected String cpuType;
    protected int batteryPercent;

    public Laptop(String mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType, int batteryPercent) {
        this.mainBoardSpecs = mainBoardSpecs;
        this.memorySize = memorySize;
        this.cpuSpeed = cpuSpeed;
        this.cpuType = cpuType;
        this.batteryPercent = batteryPercent;
    }
    public void setMainBoard(){
        if(this.mainBoardSpecs.contains("intel")){
            System.out.println("Intel MainBoard is set");
        }
        else if(this.mainBoardSpecs.contains("amd")){
            System.out.println("AMD mainBoard is set");
        }
        else{
            System.out.println("Unknown MainBoard");
        }
    }
    public void installCPU(){
        System.out.println(this.cpuType+" installed");
    }
    public void installMemory(int size){
        System.out.println(size+" GB memory installed");
    }
    public void chargeBattery(){
        System.out.println("Battery charging");
        this.batteryPercent++;
    }
    public void setWireless(){
        System.out.println("Wireless connection is set");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "mainBoardSpecs='" + mainBoardSpecs + '\'' +
                ", memorySize=" + memorySize +
                ", cpuSpeed=" + cpuSpeed +
                ", cpuType='" + cpuType + '\'' +
                ", batteryPercent=" + batteryPercent +
                '}';
    }

}
