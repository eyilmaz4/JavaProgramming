package Polymorphysim;

public class CalculationTest {
    public static void main(String[] args) {
        Calculation myObj=new Calculation();
        Calculation.calculatePerimeter(10);
        Calculation.calculatePerimeter(3,5);
        Calculation.calculatePerimeter(2,3.14);

        myObj.calculateArea(10);
        myObj.calculateArea(3,5);
        myObj.calculateArea(2,3.14);

    }
}
