package oca_Practice;

public class WhizP2_24 {
    public static void main(String[] args) {
        int array[][]={{3,2,1},{5,4,2},{0,8,7}};
        outer:for(int x=0, k=0;x<3; x++ ){
            k=0;
            inner:while(true){
                System.out.print(array[x][k++]);
            }
        }

    }
}
