package oca_Practice;

public class Q9q11 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Whizlab");
        char[]ch=new char[6];
        sb.getChars(1,5,ch,2);
        for(char c:ch)
            System.out.print(c);

    }
}
