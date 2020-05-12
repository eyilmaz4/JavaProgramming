package last_review;

public class ExceptionsEx2 {
    public static void main(String[] args) {
        String arr[] = {"asd", null, "def", null, null, "qwe"};

            for (int i = 0; i < arr.length; i++) {
                try {
                    System.out.println(arr[i].charAt(0));
                } catch (Exception e) {
                    System.out.println("opps");
                    e.printStackTrace();
                }
            }
    }
}
