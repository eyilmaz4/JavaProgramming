package java_files;

public class prime {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++){
            for(int j=1; j<=100; j++)
                if(i%1==0 && i%i==0 ){
                    if(i%j!=0){
                        System.out.println(i);
                    }
                }
        }
    }

}

