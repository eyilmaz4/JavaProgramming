package last_review;

public class StringBuilderEx {
    public static void main(String[] args) {


        String x = "a";
    //    x. charAt(0)='b';//you cant change the content of the string;
        StringBuilder builder=new StringBuilder("abcdefgh");
        builder.setCharAt(0,'z');//you can change the content of SB
        System.out.println(builder);
        builder.delete(0,builder.length());
        System.out.println(builder);
        builder.append(x);
        System.out.println(builder);
        builder=new StringBuilder(x);
    }
}