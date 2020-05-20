package oca_Practice;

public class Q7q16 {

        public int i;  // if is static just print AA
        public static void main (String[]args){
            Q7q16 wi1 = new Q7q16();
            Q7q16 wi2 = new Q7q16();
            Q7q16 wi3 = new Q7q16();
            wi1.method();
            wi2.method();
            wi3.method();
        }
        public void method(){
            while (++i < 3) {
                System.out.print("A");
            }
        }
    }

