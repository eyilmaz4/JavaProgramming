package last_review;

public class CurlyBraces {
    public static void main(String[] args) {
Curly a= new Curly(10);
    }
}
class Curly{
    int a;
    public Curly(int a){
        this.a=a;
    }
    {
        System.out.println(this.a);
    }
}
