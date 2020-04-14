package CodesDuran;

public class WorkStation extends Computer implements Computers{

        private String housingType;
        private int screenSize;

        public WorkStation(String[] mainBoardSpecs, int memorySize, int cpuSpeed, String cpuType, String housingType, int screenSize) {
            super(mainBoardSpecs, memorySize, cpuSpeed, cpuType);
            this.housingType = housingType;
            this.screenSize = screenSize;
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

        public void setMainBoard(){
            System.out.println("MainBoard CPU Type : "+this.getMainBoardSpecs()[0]+
                    "\n MainBoard CPU Speed : "+this.getMainBoardSpecs()[1]+
                    "\n MainBoard Memory Capacity : "+this.getMainBoardSpecs()[2]);
            System.out.println("MainBoard is set");
        }
        public void installCPU(){
            if(super.getCpuType().equalsIgnoreCase(this.getMainBoardSpecs()[0])
                    && super.getCpuSpeed()<=Integer.parseInt(this.getMainBoardSpecs()[1])){
                System.out.println("CPU is supported and installed");
            }
            else{
                if(!super.getMainBoardSpecs()[0].equalsIgnoreCase(this.getCpuType())){
                    System.out.println("Sorry CPU is not same Type");
                }
                if(this.getCpuSpeed()>Integer.parseInt(this.getMainBoardSpecs()[1])){
                    System.out.println("Sorry CPU speed more than MainBoard support");
                }
            }
        }
        public void installMemory(int size){
            if(this.getMemorySize()<= Integer.parseInt(this.getMainBoardSpecs()[2])){
                System.out.println("Memory size supported and installed");
            }
            else{
                System.out.println("Sorry memory size is not supported");
            }
        }
        public void setWireless(){
            System.out.println("Wireless setup completed");
        }

        @Override
        public String toString() {
            return "WorkStation{" +
                    "housingType='" + housingType + '\'' +
                    ", screenSize=" + screenSize +

                    '}';
        }
    }


