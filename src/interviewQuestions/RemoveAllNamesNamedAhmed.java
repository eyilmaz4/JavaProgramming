package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllNamesNamedAhmed {

    //18. Given a list of people' names: "Ahmed", "John", Eric",
    //"Ahmed".....
    //Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {

        String[] names ={"Ahmed", "John", "Eric","Ahmed"};
        removeName(names);
    }

    public static void removeName(String[] n){

        ArrayList<String> names = new ArrayList<>(Arrays.asList(n));
        names.removeAll( Arrays.asList("Ahmed"));
        System.out.println(names);


    }

}
