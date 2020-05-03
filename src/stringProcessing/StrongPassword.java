package stringProcessing;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(findMissing("1HackerRanK"));
        System.out.println(findMissing("abc5N1@!"));
        System.out.println(findMissing("aA5gdg"));
    }
    public static int findMissing(String p){
        StringBuilder str=new StringBuilder(p);
int result=0;
        int lenght=str.length();
        int upper=0;
        for(int i=0; i<str.length(); i++){
            if(str.codePointAt(i)>=65 && str.codePointAt(i)<=90){
                upper++;
            }
        }
        int lower=0;
        for(int i=0; i<str.length(); i++){
            if(str.codePointAt(i)>=97 && str.codePointAt(i)<=122){
                lower++;
            }
        }
        int digit=0;
        for(int i=0; i<str.length(); i++){
            if(str.codePointAt(i)>=48 && str.codePointAt(i)<=57){
                digit++;
            }
        }
        int kar=0;
        for(int i=0; i<str.length(); i++) {
            if (str.codePointAt(i) >= 32 && str.codePointAt(i) <= 43 || str.codePointAt(i)==64 || str.codePointAt(i)==94 || str.codePointAt(i)==45) {
                kar++;
            }
        }
        System.out.println("lenght "+lenght+" upper "+upper+" lower "+lower+" digit "+digit+ " kar "+kar);

        if (lenght>=6){
            if(upper>=1){
                if(lower>=1){
                    if(digit>=1){
                        if(kar>=1){
                            System.out.println("Strong Password");
                            //result=0;
                        }
                        else {
                            result=1;
                        }

                    }
                    else {
                        result=1;
                    }

                }
                else {
                    result=1;
                }

            }
            else{
                result=1;
            }

        }
        else {
            result=6-lenght;
        }
        return result;
    }
}
