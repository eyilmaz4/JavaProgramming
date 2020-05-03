package stringProcessing;

public class RedBlue {
    public static void main(String[] args) {
seeColor("bluexdd");
    }


        public static String seeColor(String color){
            if(color.substring(0,3).equals("red")){
                return "red";
            }
            else if(color.substring(0,4).equals("blue")){
                return "blue";
            }
            else {
                return "";


            } }



    }
