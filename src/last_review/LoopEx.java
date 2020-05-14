package last_review;

public class LoopEx {
    public static void main(String[] args) {
        for(int i=0, j=10,k=5;i<10&&j>=0&&k<15;i++,j--,k++){
            System.out.println("i="+i+"\t"+"j="+j+"\t"+"k="+k);
        }
        System.out.println();
        for(int i=0,j=10;i<j;i++,j--){
            System.out.println("i="+i+"\t"+"j="+j);
        }
        int counter=0;
        for(;;){

            System.out.println("hello");//6 hello
            if(counter==5){
                break;
            }
           System.out.println("hello");//5 hello
            counter++;
        }
        String []arr={"abc","def",null,""};
        for(String x:arr){
            if(x==null){
                break;
            }
            System.out.println(x);
        }

    }
}
