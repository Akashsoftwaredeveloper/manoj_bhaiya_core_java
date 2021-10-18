package collection;

import java.util.ArrayList;

public class ListWithStudent {
    public ArrayList<Student> demo() {
        // ArrayList <Generics> object_name= new ArrayList(){body}

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student student1 = new Student("Rahul", 32, "IT");
        Student student2 = new Student("Ram", 23, "CS");
        Student student3 = new Student("Raj", 23, "Commerce");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        return studentArrayList;
    }

    public static void main(String[] args) {
        ListWithStudent obj = new ListWithStudent();
        ArrayList<Student> studentArrayList = obj.demo();
        for (Student var : studentArrayList) {
            System.out.println("Printing List with return of student name " + var.getName());
            System.out.println("Printing List with return of student age " + var.getAge());
            System.out.println("Printing List with return of student section " + var.getSection());

        }
    }
}