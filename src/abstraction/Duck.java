package abstraction;

public class Duck extends Animal {
    String beakColor="yellow";

    public Duck(String beakColor) {
        this.beakColor = beakColor;
    }

    public String getBeakColor() {
        return beakColor;
    }

    public void setBeakColor(String beakColor) {
        this.beakColor = beakColor;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "beakColor='" + beakColor + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void swim(){
        System.out.println("swim");
    }
    public void quack(){
        System.out.println("quack");
    }
}
