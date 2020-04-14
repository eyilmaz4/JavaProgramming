package interfaces;

public class IntDice implements IntDices {
    int numOfFaces;
    int biasFactor;

    public IntDice(int numOfFaces, int biasFactor) {
        this.numOfFaces = numOfFaces;
        this.biasFactor = biasFactor;
    }
    public int getBiasFactor(){
        return biasFactor;
    }
    public void setbiasFactor(int biasFactor){
        this.biasFactor=biasFactor;
    }
    public void  roll(){
        System.out.println((int)(Math.random()*faces)+1);

    }
    public void rollTwice(){
        System.out.println((int)(Math.random()*faces)+1);
        System.out.println((int)(Math.random()*faces)+1);
    }
    public void rollTriple(){
        System.out.println((int)(Math.random()*faces)+1);
        System.out.println((int)(Math.random()*faces)+1);
        System.out.println((int)(Math.random()*faces)+1);
    }
    public void biasedRoll(){
        if(this.biasFactor>faces){
            System.out.println("bias large set 6 or less");
        }
        else if( this.biasFactor==faces){
            System.out.println(faces);
        }
        else if(this.biasFactor<faces){
            System.out.println((int)(Math.random()*(faces-this.biasFactor+1))+this.biasFactor);
        }
        else {
            System.out.println("bias cant be negative");
        }
    }

    @Override
    public String toString() {
        return "IntDice{" +
                "numOfFaces=" + numOfFaces +
                ", biasFactor=" + biasFactor +
                '}';
    }
}
