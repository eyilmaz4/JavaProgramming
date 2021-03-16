package IQ_Study;

import java.util.HashSet;

public class HR_HashSet {
    public static void main(String[] args) {
        String [] allNames={"John Tom","John Mary","John Tom","Mary Ana", "Mary Ana"};

        HashSet<String>set=new HashSet<>();
        for (String a:allNames ) {
            set.add(a);
            System.out.println(set.size());

        }
//        String a[]={"100000","id aee", "he fjd","ei ijh","ha ehh","ei cia","ah cjg","da iad","ch haj","de gaj","eh hje","gf gih","ei fig","jj deb","fa dga","ig jba","ac ggg","cc fgb","ef gjd","ej baa"};
//        numberOFDub(5,allNames);
//        numberOFDub(20,a);
//    }
//    public static void numberOFDub(int num, String [] arr){
//        HashSet<String> set = new HashSet<>();
//        for (int i = 0; i < t; i++) {
//            set.add(pair_left[i]+" "+pair_right[i]);
//            System.out.println(set.size());
//        }
////    }
}}
