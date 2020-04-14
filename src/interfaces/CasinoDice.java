package interfaces;

public class CasinoDice extends Dice {

    public int rollDice() {
        int result = (int) (Math.random() * super.faces) + 1;
        return result;

    }
}