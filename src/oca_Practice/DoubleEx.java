package oca_Practice;

public class DoubleEx {
    public static void main(String[] args) {

        Double d =new Double("6.5");
        String str = "55";

      /* returns a Double object holding the value represented
         by str */
        System.out.println(d);
        Double e=Double.valueOf("120D");
        System.out.println(e);
        System.out.println("Value = " +  d.valueOf(str));
    }
}

