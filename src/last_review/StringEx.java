package last_review;

public class StringEx {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        System.out.println("a="+a.hashCode()+"b:"+b.hashCode());


        System.out.println(a==b);//result is true
        String c= new String("abc");//c and d are 2 different objects
        String d=new String("abc");
        System.out.println("c:"+c.hashCode()+"d:"+d.hashCode());
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println("abc".compareTo("def"));
        System.out.println(10+10);
        System.out.println(""+10+10);
        System.out.println('0'+'0');//48+48


    }
}
