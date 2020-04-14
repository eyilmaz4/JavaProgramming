package abstraction;

public class MountainBike extends Bike {
    private String tireType;
    private int seatHeight;

    public MountainBike(String tireType, int seatHeight) {
        this.tireType = tireType;
        this.seatHeight = seatHeight;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    void speedUp() {
        System.out.println("speed increase");
    }

    void slowDown() {
        System.out.println("speed decreassed");
    }

    void stop() {
        System.out.println("stop");
    }

    void start() {
        System.out.println("start");
    }
    void switchToSteepMode(){
        System.out.println("Steep mode activated");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "tireType='" + tireType + '\'' +
                ", seatHeight=" + seatHeight +
                '}';
    }
}

