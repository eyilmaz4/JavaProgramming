package abstraction;

public class Zebra extends Animal {
    boolean isWild;

    public Zebra(boolean isWild) {
        this.isWild = isWild;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "isWild=" + isWild +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void run(){
        System.out.println("run");
    }
}
