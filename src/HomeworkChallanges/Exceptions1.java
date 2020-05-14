package HomeworkChallanges;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
            System.out.println("here");
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by 0");
            System.out.println(e);
        }


        try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");


        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("restof the code");


        try {
            int a[] = new int[5];
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("restof the code");

        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("restof the code");

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        //catch(ArithmeticException e)
        {
            System.out.println("task1 is completed");
        }
        //  catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("task 2 completed");
        }
        System.out.println("rest of the code...");
        divide(10, 2);

        int[][] arr = {{1, 2}
                , {3, 4}};
        cover(arr, 0, 1);
        cover(arr, 0, 2);
        wordNull("abc");
        wordNull(null);
    }

    public static void divide(int num1, int num2) {

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible, please try again");
        }

    }

    public static void cover(int[][] arr, int num1, int num2) {
        try {
            System.out.println(arr[num1][num2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index number please try again");
        }
    }

    public static void wordNull(String word) {
        String str = "";
        try {
            for (int i = 0; i < word.length(); i++) {
                str +=  (char)(word.charAt(i) + 1);

            }
            System.out.println(str);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
