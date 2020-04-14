package exceptions;

public class Q3Answer {
    String sentence;
    public Q3Answer(){
    }
    public Q3Answer(String sentence){
        this.sentence=sentence;
    }
    public void printNextLetters(){
        char letter;
        try{
            for (int i=0 ; i<=this.sentence.length();i++){
                letter=this.sentence.charAt(i);
                letter++;
                System.out.print(letter);
            }
        }
        catch (NullPointerException e){
            System.out.println("String is null!!");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Hold on champ you exceeded");
        }
        catch (Exception e){
            System.out.println("Daddy got you");
        }
    }

}
