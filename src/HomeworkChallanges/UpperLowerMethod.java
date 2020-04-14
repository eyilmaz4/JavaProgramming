package HomeworkChallanges;

import java.util.Arrays;

public class UpperLowerMethod {
    public static void main(String[] args) {
        System.out.println(convertLowerToUpper("java"));
        System.out.println(convertUpperToLower("JAVA"));
    }

    public static String convertLowerToUpper(String word){
    int [] newWord=new int[word.length()];

        for(int i=0; i<word.length(); i++){
        newWord[i]=(int)(word.charAt(i));
    }
        System.out.println(Arrays.toString(newWord));

        for(int i=0; i<word.length(); i++) {
        if(newWord[i]==106){
            newWord[i]=74;
        }
        if(newWord[i]==97){
            newWord[i]=65;
        }

        else if(newWord[i]==98){
            newWord[i]=66;
        }
        else if(newWord[i]==99){
            newWord[i]=67;
        }
        else  if(newWord[i]==100){
            newWord[i]=68;
        }
        else  if(newWord[i]==101){
            newWord[i]=69;
        }
        else  if(newWord[i]==102){
            newWord[i]=70;
        }
        else  if(newWord[i]==103){
            newWord[i]=71;
        }
        else  if(newWord[i]==104){
            newWord[i]=72;
        }
        else  if(newWord[i]==105){
            newWord[i]=73;
        }
        else  if(newWord[i]==106){
            newWord[i]=74;
        }
        else  if(newWord[i]==107){
            newWord[i]=75;
        }
        else  if(newWord[i]==108){
            newWord[i]=76;
        }
        else  if(newWord[i]==109){
            newWord[i]=77;
        }
        else  if(newWord[i]==110){
            newWord[i]=78;
        }
        else  if(newWord[i]==111){
            newWord[i]=79;
        }
        else  if(newWord[i]==112){
            newWord[i]=80;
        }
        else  if(newWord[i]==113){
            newWord[i]=81;
        }
        else  if(newWord[i]==114){
            newWord[i]=82;
        }
        else  if(newWord[i]==115){
            newWord[i]=83;
        }
        else  if(newWord[i]==116){
            newWord[i]=84;
        }
        else  if(newWord[i]==117){
            newWord[i]=85;
        }
        else  if(newWord[i]==118){
            newWord[i]=86;
        }
        else  if(newWord[i]==119){
            newWord[i]=87;
        }
        else  if(newWord[i]==120){
            newWord[i]=88;
        }
        else  if(newWord[i]==121){
            newWord[i]=89;
        }
        else  if(newWord[i]==122){
            newWord[i]=90;
        }


    }
        System.out.println(Arrays.toString(newWord));
    char []newest=new char[word.length()];
for(int i=0; i<word.length(); i++){
        newest[i]+=(char)(newWord[i]);
    }
    String result=" ";
        for(int i=0; i<word.length(); i++){
        result+=newest[i];
    }
//        System.out.println("result:"+result);
        return result;
    }

    public static String convertUpperToLower(String word){

        int [] newWord=new int[word.length()];

            for(int i=0; i<word.length(); i++){
                newWord[i]=(int)(word.charAt(i));
            }
            System.out.println(Arrays.toString(newWord));

            for(int i=0; i<word.length(); i++) {
                if(newWord[i]==74){
                    newWord[i]=106;
                }
                if(newWord[i]==65){
                    newWord[i]=97;
                }

                else if(newWord[i]==66){
                    newWord[i]=98;
                }
                else if(newWord[i]==67){
                    newWord[i]=99;
                }
                else  if(newWord[i]==68){
                    newWord[i]=100;
                }
                else  if(newWord[i]==69){
                    newWord[i]=101;
                }
                else  if(newWord[i]==70){
                    newWord[i]=102;
                }
                else  if(newWord[i]==71){
                    newWord[i]=103;
                }
                else  if(newWord[i]==72){
                    newWord[i]=104;
                }
                else  if(newWord[i]==73){
                    newWord[i]=105;
                }
                else  if(newWord[i]==74){
                    newWord[i]=106;
                }
                else  if(newWord[i]==75){
                    newWord[i]=107;
                }
                else  if(newWord[i]==76){
                    newWord[i]=108;
                }
                else  if(newWord[i]==77){
                    newWord[i]=109;
                }
                else  if(newWord[i]==78){
                    newWord[i]=110;
                }
                else  if(newWord[i]==79){
                    newWord[i]=111;
                }
                else  if(newWord[i]==80){
                    newWord[i]=112;
                }
                else  if(newWord[i]==81){
                    newWord[i]=113;
                }
                else  if(newWord[i]==82){
                    newWord[i]=114;
                }
                else  if(newWord[i]==83){
                    newWord[i]=115;
                }
                else  if(newWord[i]==84){
                    newWord[i]=116;
                }
                else  if(newWord[i]==85){
                    newWord[i]=117;
                }
                else  if(newWord[i]==86){
                    newWord[i]=118;
                }
                else  if(newWord[i]==87){
                    newWord[i]=119;
                }
                else  if(newWord[i]==88){
                    newWord[i]=120;
                }
                else  if(newWord[i]==89){
                    newWord[i]=121;
                }
                else  if(newWord[i]==90){
                    newWord[i]=122;
                }


            }
            System.out.println(Arrays.toString(newWord));
            char []newest=new char[word.length()];
            for(int i=0; i<word.length(); i++){
                newest[i]+=(char)(newWord[i]);
            }
            String result=" ";
            for(int i=0; i<word.length(); i++){
                result+=newest[i];
            }
//        System.out.println("result:"+result);
            return result;
        }

    }

