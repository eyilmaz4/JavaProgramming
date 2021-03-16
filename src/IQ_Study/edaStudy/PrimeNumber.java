package IQ_Study.edaStudy;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
      //  System.out.println(isPrime(13));
      //  System.out.println(isPalindrome("Madam"));
      //  System.out.println(palindromePermut("kaakz"));
     //   System.out.println(factorial(5));
      //  System.out.println(factorial2(5));
      //  System.out.println(fibonacci(8));
      //  sumOfDigit(183);
      //  System.out.println(isArmstong(370));
       // stair(5);
     //   swapNum(10,30);
        int array[]={4,8,1,9,3,7};// 1 3 4 7 8 9
        System.out.println(largestArray(array));
        System.out.println(min(array));
        System.out.println(medianArr(array));
        System.out.println(uniqueStr("aaaaaabbbbbccddggg"));
    }
    public static String uniqueStr(String str){
        Set<Character> set= new LinkedHashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            set.add(str.charAt(i));
        } // we added all charachters to Set
        System.out.println(set);
            String unique="";
        for (Character a:set){
            unique+=a;// we added unique characters to new string
        }
        return unique;
    }
public static int medianArr(int[] arr){
        Arrays.sort(arr);
        int index=arr.length/2;
        return arr[index];
}
    public static int min(int []arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
    public static int largestArray(int []arr){
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
        }
        return max;
    }
    public static void swapNum(int a, int b){

        a=a^b^(b=a);
//        int c=a;
//        a=b;
//        b=c;
        System.out.println(a+""+b);

    }
    public static void stair(int num){
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"");
            }
            System.out.println();

        }
    }

    public static void sumOfDigit(int num){
        int sum=0;
        while(num>0) {
            sum += num % 10; //3
            num = num / 10; //18
        }
            System.out.println(sum);


    }
    public static boolean isArmstong(int number){
        int sum=0;
        int digit;
        int temp;
        temp=number;
        while(temp>0){
            digit=temp%10;
            sum+=(digit*digit*digit);
            temp=temp/10;
        }
        if(number==sum){
            return true;
        }
        return false;
    }

    public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        else{
            return fibonacci(num-1)+fibonacci(num-2);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        String word=str.toLowerCase();
        if (word.equals(new StringBuilder(word).reverse().toString())) {
            return true;
        }
        return false;
    }
    public static boolean palindromePermut(String str){
        Map<Character, Integer> countChar=new HashMap<>();  // velel  level
        for(char c:str.toCharArray()){
            Integer count=countChar.get(c);
            if(count==null){
                count=Integer.valueOf(1);
            }
            else{
                count=count+1;
            }
            countChar.put(c, count);
        }
        boolean hasOdd=false;
        for(int count: countChar.values()){
            if(count%2==1){
                if(hasOdd){
                    return false;
                }
                else{
                    hasOdd=true;

                }
            }
        }
        return true;

    }
    public static int factorial(int num){
        int fact=1;
        for (int i = 1; i <=num ; i++) {
            fact=fact*i;

        }
        return fact;
    }
  public  static long factorial2(int n) {
        if (n == 1)
            return 1;
        else {
            return (n * factorial2(n - 1));
        }
    }

}

