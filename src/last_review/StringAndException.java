package last_review;

public class StringAndException {
    public static void main(String[] args) {
        String a=null;
        try {
            System.out.println(a.charAt(10));
        }
        catch (NullPointerException e){
            System.out.println("cant be null");
        }
        StringBuilder x= new StringBuilder("abc");
try {
    System.out.println(x.charAt(10));
}
catch (StringIndexOutOfBoundsException e){
    System.out.println("out ofbound");
}

StringBuffer buffer=new StringBuffer("java");
buffer.append(new B(1,2));
        System.out.println(buffer.charAt(5));
        System.out.println(buffer.substring(4).length());
    }
   public static class B{
        int x;
        int y;

        public B(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    }

