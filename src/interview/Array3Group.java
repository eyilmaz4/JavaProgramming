package interview;

public class Array3Group {
    public static void main(String[] args) {
        int []Array={-1,0,1,2,-1,-4};

        for (int i = 0; i < Array.length-2; i++) {

            for (int j =i+1; j <Array.length-1 ; j++) {

                for (int k = j+1; k <Array.length ; k++) {

                    if(Array[i]+Array[j]+Array[k]==0){

                       System.out.println(Array[i]+" "+Array[j]+" "+Array[k]);
                        }
                    }


                    }
                }

            }

        }


