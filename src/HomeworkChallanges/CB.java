package HomeworkChallanges;

import java.util.Arrays;

public class CB {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 9, 11, 4, 5, 7, 6, 8};
        pre4(arr);
        System.out.println(Arrays.toString(pre5(arr)));
    }

    public static void pre4(int[] nums) {
        int count = 0;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 4) {
                    count++;

                } else {
                    break;
                }
            }
            int[] arr = new int[count];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nums[i];
            }
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[] pre5(int[] nums) {
        int count = 0;

        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 4) {
                    count++;

                } else {
                    break;
                }
            }
            int[] arr = new int[count];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = nums[i];
            }
            return arr;
        } else {
            return nums;
        }


    }
    public int[] pre6(int[] nums) {
        int i = 0;

        while(nums[i] != 4)
            i++;

        int[] arr = new int[i];

        for(int j = 0; j < i; j++)
            arr[j] = nums[j];

        return arr;
    }
}