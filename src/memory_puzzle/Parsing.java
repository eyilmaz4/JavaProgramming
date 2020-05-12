//package memory_puzzle;
//
//public class Parsing {
//
//        public static void main(String[] args) {
//            String code = "start ; print() ; end ;";
//            boolean typo = hasTypo(code);
//            boolean semiColon = checkSemiColons(code);
//            if(typo && semiColon){
//                System.out.println("Code is OK");
//            }
//            else {
//                System.out.println("Code is not OK");
//            }
//        }
//        public static boolean isInKeyWords(String word){
//            String keywords[] = {"start","print()","end"};
//            for (String kw : keywords){
//                if(kw.equalsIgnoreCase(word)){
//                    return true;
//                }
//            }
//            return false;
//        }
//        public static boolean isInKeySymbols(String word){
//            String keySymbols[] = {";","(",")"};
//            for(String ks:keySymbols){
//                if(ks.equalsIgnoreCase(word)){
//                    return true;
//                }
//            }
//            return false;
//        }
//        public static boolean hasTypo(String code){
//            boolean result = true;
//            code = code.strip();
//            String arr[] = code.split(" ");
//            for(String key : arr){
//                if(!(isInKeyWords(key) || isInKeySymbols(key))){
//                    result = false;
//                }
//            }
//            return result;
//        }
//​
//        public static boolean checkSemiColons(String code){
//            boolean result = true;
//            String arr[] = code.split(" ");
//            for (int i = 0; i < arr.length-1 ; i+=2) {
//                if( !(arr[i+1].equals(";"))  ){
//                    result=false;
//                }
//            }
//            return result;
//        }
//    }
//
//
//
//
