package IQ_Study;

public class HR_MinMove {
    public static void main(String[] args) {
        int arr[]={123,543};
        int arr2[]={321,279};
        System.out.println(minMove(arr,arr2));
    }
    public static int minMove(int arr[], int arr2[]){
      String a= ""+arr[0];
      String b=""+arr[1];
      String c=""+arr2[0];
      String d=""+arr2[1];
      int count1=0;
      int count2=0;
      for(int i=0; i<a.length(); i++){
          count1+=Math.abs(Integer.parseInt(""+a.charAt(i))-Integer.parseInt(""+c.charAt(i)));
      }
        for(int i=0; i<a.length(); i++){
            count2+=Math.abs(Integer.parseInt(""+b.charAt(i))-Integer.parseInt(""+d.charAt(i)));
        }
       return count1+count2;
    }
    public static int minimumMoves(int[] arr1, int[] arr2) { // ## Author Melih Kaya ##
        int sum = 0;
        for (int i = 0; i < 2; i++) { // 2 element from each array. loop run 2 times
            while (arr1[i]>0) { // icerigi sifir olana kadar devam ediyor
                sum += Math.abs(arr1[i] %10 - arr2[i] %10 ); //son basamaktaki rakami alip farkini buluyor.
                arr1[i] = arr1[i] / 10; // son basamagi siliyor
                arr2[i] = arr2[i] / 10;
            }
        }
        return sum;
    }
}
