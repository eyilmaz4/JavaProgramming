package IQ_Study;

public class HR_Triplets {
    public static void main(String[] args) {
        int [] A={17,28,30};
        int []B={99,16,8};
   compare(A,B);
    }

    public static void compare(int[]a, int[]b){
        int []alice=new int[3];
        int []bob=new int[3];
        for(int i=0; i<a.length; i++) {
            if (a[i] > b[i]) {
                alice[i] = 1;
                bob[i]=0;
            } else if (a[i] < b[i]) {
                bob[i] = 1;
                alice[i]=0;
            } else if (a[i] == b[i]) {
                alice[i] = 0;
                bob[i] = 0;
            }
        }
            int score1 = 0;
            for (int scoreAlice : alice) {
                score1 += scoreAlice;
            }
            int score2 = 0;
            for (int scoreBob : bob) {
                score2 += scoreBob;
            }

        System.out.println("["+score1+" "+score2+"]");
    }

}
