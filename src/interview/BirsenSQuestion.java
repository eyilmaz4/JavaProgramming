package interview;

public class BirsenSQuestion {
    public static void main(String[] args) {
        int[] arr1 = {123, 543};
        int[] arr2 = {321, 279};
        System.out.println(minimumMoves2(arr1, arr2));
        int[] arr3 = {123, 456};
        int[] arr4 = {789, 321};
        System.out.println(minimumMoves(arr3, arr4));

    }

    public static int minimumMoves(int[] arr1, int[] arr2) {
        String[] nums1 = new String[arr1.length];
        String[] nums2 = new String[arr1.length];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            nums1[i] = "" + arr1[i];
            nums2[i] = "" + arr2[i];
        }
        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums1[i].length(); j++) {
                count += Math.abs(Integer.parseInt(String.valueOf(nums1[i].charAt(j))) - Integer.parseInt(String.valueOf(nums2[i].charAt(j))));
            }

        }
        return count;
    }
    int[] arr1 = {123, 543};
    int[] arr2 = {321, 279};

    public static int minimumMoves2(int[] arr1, int[] arr2) {

        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += Math.abs(arr1[i] % 10 - arr2[i] % 10);
                arr1[i] = arr1[i] / 10;
                arr2[i] = arr2[i] / 10;
            }
        }

        return sum;

    }
}