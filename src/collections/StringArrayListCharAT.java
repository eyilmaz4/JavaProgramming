package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArrayListCharAT {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> words = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>(Arrays.asList("JaVa", "is", "Fun"));
        words.add(a);
        words.add(a);
        words.get(1).add("AAAAA");
        System.out.println(words);
        findUpperCases(words);
        findLowerCases(words);
        findUpperCasesInWord(words);
    }

    public static void findUpperCases(ArrayList<ArrayList<String>> arr) {
        int counterWord;
        int counterRow;
        for (int i = 0; i < arr.size(); i++) { //to fetch 1 dim String arrays
            counterRow = 0;
            for (int j = 0; j < arr.get(i).size(); j++) { //to fetch String elements
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++) { //to fetch chars
                    if (Character.isUpperCase(arr.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }
                counterRow += counterWord;
            }
            System.out.println("There are " + counterRow + " upper cases at row" + (i + 1));

        }
    }

    public static void findLowerCases(ArrayList<ArrayList<String>> arr) {
        int counterWord;
        int counterRow;
        for (int i = 0; i < arr.size(); i++) { //to fetch 1 dim String arrays
            counterRow = 0;
            for (int j = 0; j < arr.get(i).size(); j++) { //to fetch String elements
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++) { //to fetch chars
                    if (Character.isLowerCase(arr.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }
                counterRow += counterWord;
            }
            System.out.println("There are " + counterRow + " lower cases at row" + (i + 1));

        }
    }

    public static void findUpperCasesInWord(ArrayList<ArrayList<String>> arr) {
        int counterWord;

        for (int i = 0; i < arr.size(); i++) { //to fetch 1 dim String arrays

            for (int j = 0; j < arr.get(i).size(); j++) { //to fetch String elements
                counterWord = 0;
                for (int k = 0; k < arr.get(i).get(j).length(); k++) { //to fetch chars
                    if (Character.isUpperCase(arr.get(i).get(j).charAt(k))) {
                        counterWord++;
                    }
                }
                System.out.println("there are " + counterWord + " lowerCases in " + arr.get(i).get(j));
            }


        }
    }
}