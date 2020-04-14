package exceptions;

public class Multiple2 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try {
            System.out.println(arr[10/0]);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
        catch(Exception e){
            System.out.println("parent");
        }
        System.out.println("code ...");
    }
}
