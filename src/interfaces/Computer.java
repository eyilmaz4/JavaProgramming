package interfaces;

public class Computer implements Computers {
    protected String mainBoardSpec;
    protected int memorySize;
    protected double CpuSpeed;
    protected String CPUtype;

    public Computer(String mainBoardSpec, int memorySize, double cpuSpeed, String CPUtype) {
        this.mainBoardSpec = mainBoardSpec;
        this.memorySize = memorySize;
        CpuSpeed = cpuSpeed;
        this.CPUtype = CPUtype;
    }
    public void setMainBoard(){
        System.out.println("mainboard CPU type:"+this.getMainBoardSpec()+"");
    }
    public void InstallCPU(){

    }
    public  void InstallMemory(){

    }
    public void setWireless(){
        System.out.println("wireless");
    }
    public void turnOn(){
        System.out.println("Computer turned on");
    }
    public void turnOff(){
        System.out.println("Computer turned off");
    }
    public void boot(){
        System.out.println("computer booted");
    }

    public String getMainBoardSpec() {
        return mainBoardSpec;
    }

    public void setMainBoardSpec(String mainBoardSpec) {
        this.mainBoardSpec = mainBoardSpec;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public double getCpuSpeed() {
        return CpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        CpuSpeed = cpuSpeed;
    }

    public String getCPUtype() {
        return CPUtype;
    }

    public void setCPUtype(String CPUtype) {
        this.CPUtype = CPUtype;
    }
}
