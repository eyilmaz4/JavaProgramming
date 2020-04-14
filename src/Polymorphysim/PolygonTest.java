package Polymorphysim;

public class PolygonTest {
    public static void main(String[] args) {
        Polygon myPoli=new Polygon();
        myPoli.calculatePerimeter(3);
        Square myObj=new Square();
        myObj.calculatePerimeter(3);
        Triangle myTri=new Triangle();
        myTri.calculatePerimeter(1,2,3);

    }
}
