package last_review;

public class DownCastingExample {
    public static void main(String[] args) {
        Appliance ob1 = new Appliance();
        ob1.Kitchen();

        Appliance b = new Refrigerator();
        b.Kitchen();

        Refrigerator c = new Refrigerator();
        c.Kitchen();
        c.cool();
        ((Refrigerator)ob1).cool();
        Refrigerator d=(Refrigerator)b;
        Appliance e=d;
        e.Kitchen();
        Refrigerator f=d;
        f.cool();
        Refrigerator k=(Refrigerator)ob1;


    }


}
class Appliance{
    int size;
    void Kitchen(){
        System.out.println("Kitchen Appliance");
    }
}
class Refrigerator extends Appliance{
    void cool(){
        System.out.println("cooling");
    }

}

