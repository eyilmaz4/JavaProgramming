package IQ_Study;

import java.util.Arrays;

public class All_max_min {
    public static void main(String[] args) {

        int array[] = {8, 2, 17, 5};
        System.out.println(max(array));
        System.out.println(min(array));
        System.out.println(minClassic(array));

    }

    public static int max(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static int minClassic(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
