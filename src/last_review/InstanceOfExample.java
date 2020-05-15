package last_review;

public class InstanceOfExample {
    public static void main(String[] args) {
        GardenTool a= new GardenTool();
        if(a instanceof GardenTool){
            System.out.println("Belongs to GardenTool");
        }
        GardenTool b= new LawnMower();
        if(b instanceof GardenTool){
            System.out.println("Belongs to GardenTool");
        }

        LawnMower c= new LawnMower();
        if(c instanceof LawnMower){
            System.out.println("belonges to LawnMover");
        }
    }
}
class GardenTool{
    void start(){
        System.out.println("started");
    }
}
class LawnMower extends GardenTool{
    void move(){
        System.out.println("cut cut cut");
    }

}