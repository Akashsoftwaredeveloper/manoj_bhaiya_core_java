package collection;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenerics {
    public ArrayList<String> Generics_demo() {

        // Syntax: ArrayList <Datatype> object_name = new ArrayList <>(){Body}

        ArrayList<String> List_names = new ArrayList<>();
        List_names.add("Rahul");
        List_names.add("Ramesh");
        List_names.add("Rajesh");
        List_names.add("Santosh");
        List_names.add("Ibrahim");

        return List_names;
    }
    public ArrayList<Integer> marks_Generics() {
        // Syntax: ArrayList <Datatype> object_name = new ArrayList <>(){Body}

        ArrayList<Integer> list_marks = new ArrayList<>();
        list_marks.add(435);
        list_marks.add(654);
        list_marks.add(854);
        list_marks.add(521);
        list_marks.add(545);
        return list_marks;
    }
     public ArrayList<Double> salary_demo(){
         // Syntax: ArrayList <Datatype> object_name = new ArrayList <>(){Body}
         ArrayList<Double> salary= new ArrayList<>();
         salary.add(5242.23);
         salary.add(521.23);
         salary.add(2141.32);
         return salary;
        }


    public static void main(String[] args) {
        ListWithGenerics object = new ListWithGenerics();

        //    String ArrayList
        ArrayList<String> output = object.Generics_demo();
        for (String var : output) {
            System.out.println("Printing arraylist with return type= " + var);
        }
        // Integer marks result
        ArrayList<Integer> result= object.marks_Generics();
        for( Integer var: result){
            System.out.println("Printing marks with return type= "+ var);
        }
        // Double salary
        ArrayList<Double>  salary_list =  object.salary_demo();
        for (Double slr: salary_list){
            System.out.println("Printing salary list with return type= "+ slr);
        }
    }

}
