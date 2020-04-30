package OCA.Exceptions;

public class Exceptions2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"123", "456", "789", "4556", "abc", "454"};
        try {
            for (int i = 0; i <= arr.length; i++) {
                int j = Integer.parseInt(arr[i]);
                System.out.println(j);
            }
            throw new IllegalArgumentException("this is my illegal argument exception");
        }
        catch ( ArrayIndexOutOfBoundsException e){

            System.out.println(e.getMessage());
            System.out.println("array out");
        }
        catch (NumberFormatException f){
            System.out.println("number exception");
            System.out.println(f.getMessage());
        }
        catch (Exception a){
            System.out.println("caught exception all is fine");
        }
    }
}
