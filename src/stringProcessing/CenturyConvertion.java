package stringProcessing;

public class CenturyConvertion {
    public static void main(String[] args) {
String num="1453";
String num1="2020";
String num2="1000";
        System.out.println(findCentury(num));
        System.out.println(findCentury(num1));
        System.out.println(findCentury(num2));
    }
    public static int findCentury(String num){
        String newS=""+num.charAt(0)+num.charAt(1);
        int number=Integer.parseInt(newS);
        int century=number;
        if(num.charAt(2)==0 && num.charAt(3)==0) {
            century=century;
        }
        else if(num.charAt(2)>0){
            century=number+1;
        }

        return century;
    }
    /*Duran;
        public static void calculateCentury(int year){
        String cent = ""+ year;
        String firstTwo = cent.substring(0,2);
        String secondTwo = cent.substring(2,4);
        if(secondTwo.equals("00")){
            System.out.println(firstTwo);
        }
        else{
            int century = Integer.parseInt(firstTwo);
            System.out.println(++century);
        }
​
    }

     */
}
