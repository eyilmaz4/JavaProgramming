package stringProcessing;

import java.util.ArrayList;

public class TrailingLeadingZeros {
    public static void main(String[] args) {
        String num = "0012.0300";
        System.out.println(deleteZeros(num));
    }


            public static String deleteZeros(String numbers) {
                StringBuilder str = new StringBuilder(numbers);
                int start = 0;
                int end = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != '0') {
                        start = i;
                        break;
                    }
                }
                for (int i = str.length() - 1; i >= 0; i--) {
                    if (str.charAt(i) != '0') {
                        end = i;
                        break;
                    }
                }
                System.out.println(start + " " + end);
                str.replace(end, str.length(), "");
                str.replace(0, start, "");

                return str.toString();
            }
        }

//        String arr[]=n.split(".");
//        ArrayList<Character>list=new ArrayList<>();
//        for(int i=0; i<arr[0].length(); i++){
//            if(arr[0].charAt(i)!=0){
//                list.add(i,arr[0].charAt(i));
//            }
//        }
//        System.out.println(list);
//        ArrayList<Character>list2=new ArrayList<>();
//        for(int i=arr[1].length(); i>=0; i--){
//            if(arr[1].charAt(i)!=0){
//                list2.add(arr[1].charAt(i));
//            }
//        }
//        System.out.println(list2);
//    }
//}

/*
umedi
public class LeadingAndTrailingZeros {
    public static void main(String[] args) {
        removeLeadingTrailing("230.00");
    }
    public static void removeLeadingTrailing(String n){
        StringBuilder s=new StringBuilder();
        for (int i=0,k=0,t=0,y=0;i<n.length();i++){
            while (n.charAt(k)=='0'){
                k++;
                t=k;
            }
            while(n.charAt(t)!='.'){
                s.append(n.charAt(t));
                t++;
                y=t;
            }
            while(n.charAt(y)=='0'){
                s.append(n.charAt(y));
                y++;
            }
        }
        System.out.println(s);
    }

 */