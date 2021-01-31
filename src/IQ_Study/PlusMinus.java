package IQ_Study;

public class PlusMinus {
    public static void main(String[] args) {
        int [] arr={1,1,0,-1,-1};
        plusMinusRatio(arr);
    }

    public static void plusMinusRatio(int[] arr) {
        int countP = 0;
        int countM = 0;
        int countZ = 0;
        for (int i=0; i<arr.length;i++) {
            if (arr[i] == 0) {
                countZ++;
            } else if (arr[i] < 0) {
                countM++;

            } else if (arr[i] > 0) {
                countP++;
            }
        }
        double rP = (double) countP / arr.length;
        double rM = (double) countM / arr.length;
        double rZ = (double) countZ / arr.length;

        System.out.printf("%f%n",rP);
        System.out.printf("%f%n",rM);
        System.out.printf("%f%n",rZ);


    }
}
