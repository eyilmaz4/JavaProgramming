package sortingAlgorithms;

import collections.ArrayList2Dim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(10);
        students.add(new Student(100, "vahit", 10));
        students.add(new Student(111, "ismail", 15));
        students.add(new Student(103, "birsen", 3));
        students.add(new Student(104, "sibel", 7));
        Collections.sort(students, new AgeSorting());
        Collections.sort(students, new IDSorting());
        for (Student st : students) {
            System.out.println(st.id + "\t" + st.name + "\t" + st.age);
        }
        Collections.sort(students, new IDSorting());
        Iterator<Student> iter = students.iterator();
        Student temp;
        while (iter.hasNext()) {
            temp = iter.next();
            System.out.println(temp.id + "\t" + temp.name + "\t" + temp.age);
        }
        Collections.sort(students,new NameSorting());
        for(Student std:students){
            System.out.println(std.id+"\t"+std.name+"\t"+std.age);
        }
    }
}