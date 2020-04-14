package interfaces;

public class IntDiceBiasTest {
    public static void main(String[] args) {
        IntDice myDice=new IntDice(6,6);
        myDice.roll();
        myDice.rollTwice();
        myDice.rollTriple();
        myDice.biasedRoll();
        myDice.setbiasFactor(5);
        for(int i=0; i<10; i++){
            myDice.biasedRoll();
        }
    }
}
