package last_review;

import java.util.Arrays;

public class EdaBitValidIP {
    public static void main(String[] args) {
        String a = "1.2.3.4";
        System.out.println(isValid(a));
    }

    public static boolean isValid(String num) {
        String[] arr = num.split("\\.");
        System.out.println(Arrays.toString(arr));
        if (arr.length != 4) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == '0' || arr[i].charAt(arr.length - 1) == '0') {
                return false;
            } else {
                if (!(Integer.parseInt(arr[i]) > 0 && Integer.parseInt(arr[i]) < 256)) {
                    System.out.println("1-255");
                    return false;
                }
            }
        }
        return true;
    }
}