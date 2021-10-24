package collection;

import javax.imageio.stream.ImageInputStream;
import java.util.HashMap;

public class StudentHashMap {
    public HashMap<String, Student> demo (){

        HashMap<String, Student> hashmap_names = new HashMap<>();
        Student student1 =new Student("RAj",23,"IT");
        Student student2 =new Student("Rajat",3,"Commerce");
        Student student3 =new Student("Sanjay",32,"Arts");

        hashmap_names.put("A",student1);
        hashmap_names.put("B",student2);
        hashmap_names.put("c",student3);

        return hashmap_names;
        }



    public static void main(String[] args) {
        StudentHashMap object = new StudentHashMap();
        HashMap<String, Student> obj = object.demo();

        for(String var: obj.keySet() ){
            System.out.println("Printing names "+ obj.get(var).getName());
            System.out.println("Printing age "+ obj.get(var).getAge());
            System.out.println("Printing section "+ obj.get(var).getSection());
    }

    }
}
