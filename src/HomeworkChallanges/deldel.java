package HomeworkChallanges;

public class deldel {
    public static void main(String[] args) {
        System.out.println(delDel("hdelello"));
    }

        public static String delDel(String str) {
            if(str.length()>=4 && str.substring(1,4).equals("del")){
                return str.substring(0,1)+str.substring(4);

            }
            return str;
        }

    }
