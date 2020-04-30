package enums;

import java.util.Arrays;

public class Colors {
    enum Color{
        MAROON(155,200,180),
        TEAL(10,230,50),
        ZERO_GRAVITY(10,20,30);

        private int R,G,B;
        Color(final int R, final int G,final int B){
            this.B=B;
            this.G=G;
            this.R=R;
        }
        public int  getR(){//red
            return this.R;
        }

        public int getB() {//blue
            return this.B;
        }

        public int getG() {//green
            return this.G;
        }
        public int [] colors(){
            int allColors[]=new int[3];
            allColors[0]=this.R;
            allColors[1]=this.G;
            allColors[2]=this.B;

            return allColors;
        }

    }

    public static void main(String[] args) {
        Color myColor=Color.MAROON;
        System.out.println(Arrays.toString(myColor.colors()));
  Color myColor2=Color.TEAL;
        System.out.println(myColor2.G);
    }
}
