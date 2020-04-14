package Polymorphysim;

public class Calculation {
    public static void calculatePerimeter(int a, int b){
        System.out.println("perimeter of rectangle: "+(a+b)*2);

    }
    public static void calculatePerimeter(int a){
        System.out.println("perimeter of square: "+(a*4));

    }
    public static void calculatePerimeter(int r, double pi){
        System.out.println("perimeter of circle: "+2*pi*r);

    }
    public void  calculateArea(int a, int b){
        System.out.println("area of rectangle: "+a*b);
    }
    public void  calculateArea(int a){
        System.out.println("Area of square: "+a*a);
    }
    public void  calculateArea(int r, double pi){
        System.out.println("area of circle: "+pi*(r*r));
    }

}
