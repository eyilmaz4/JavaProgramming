package last_review;

public class StringReversing {
    public static void main(String[] args) {
        String str="Java is fun";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        StringBuilder word=new StringBuilder("java is fun");
        char temp;
        for(int i=0,j=word.length()-1;i<j;i++,j-- ){
            temp=word.charAt(i);
            word.setCharAt(i,word.charAt(j));
            word.setCharAt(j,temp);
        }
        System.out.println(word);


    }
}
