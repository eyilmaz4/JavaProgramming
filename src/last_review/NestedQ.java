package last_review;

public class NestedQ {
    public static void main(String[] args) {
        //House house=new House(2,"avc");
        //House.Room room= new House.Room(10.9);//if inner class static
        House myHouse=new House(2,"abc");
        House.Room myRoom=myHouse.new Room(10.7);



    }
}
class House{
    int roomNum;
    String address;

    public House(int roomNum, String address) {
        this.roomNum = roomNum;
        this.address = address;
    }
    void turnLight(){
    System.out.println("turn on the lights");
}
    void findHouse(){
        System.out.println("address");
    }
    class Room{
        double sqrt;

        public Room(double sqrt) {
            this.sqrt = sqrt;
        }

        void calculate(){
            System.out.println("area is..");
        }
    }
    /*
    public class NestedClass2 {
    public static void main(String[] args) {
        House myHouse = new House("1100 W. Airport",5);
        House.Room myRoom = myHouse.new Room(100);
        System.out.println(myRoom instanceof House.Room);
        myHouse.warmUp();
        myHouse.turnLightOn();
        myRoom.openDoor();
        myRoom.closeDoor();
    }
}
​
class House{
    String address;
    int rooms;
​
    public House(String address, int rooms) {
        this.address = address;
        this.rooms = rooms;
    }
    void turnLightOn(){
        System.out.println("Lights On");
    }
    void coolDown(){
        System.out.println("House is cooling down");
    }
    void warmUp(){
        System.out.println("House is warming up");
    }
​
    class  Room{
        double size;
​
        public Room(double size) {
            this.size = size;
        }
        void openDoor(){
            System.out.println("Door opened");
        }
        void closeDoor(){
            System.out.println("Door closed");
        }
    }

     */
}
