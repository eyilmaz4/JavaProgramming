package HomeworkChallanges;
//Write a method to check Integer Palindromes.
public class IntPalindrome {
    public static void main(String[] args) {

                int r,sum=0,temp;
                int n=122;//It is the number variable to be checked for palindrome

                temp=n;
                while(n>0){
                    r=n%10;  //getting remainder 2
                    sum=(sum*10)+r;//2
                    n=n/10;//12
                }
                if(temp==sum)
                    System.out.println("palindrome number ");
                else
                    System.out.println("not palindrome");

    }
    }
