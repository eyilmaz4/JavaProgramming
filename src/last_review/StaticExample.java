package last_review;

public class StaticExample {

        public static int numberStatic=0;
        public int numberNonStatic=0;

        public StaticExample() {
            this.numberNonStatic++;
            numberStatic++;
        }
    }
    class Test {
        public static void main(String[] args) {
            StaticExample obj1 = new StaticExample();
            System.out.println("Static value: " + StaticExample.numberStatic + "\tNon Static: " + obj1.numberNonStatic);
            StaticExample obj2 = new StaticExample();
            System.out.println("Static value: " + StaticExample.numberStatic + "\tNon Static: " + obj2.numberNonStatic);
            StaticExample obj3 = new StaticExample();
            System.out.println("Static value: " + StaticExample.numberStatic + "\tNon Static: " + obj1.numberNonStatic);
            StaticExample obj4 = new StaticExample();
            System.out.println("Static value: " + StaticExample.numberStatic + "\tNon Static: " + obj2.numberNonStatic);
        }
    }