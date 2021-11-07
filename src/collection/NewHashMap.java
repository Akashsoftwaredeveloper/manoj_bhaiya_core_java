package collection;

import model.Student;

import java.util.HashMap;

public class NewHashMap {
    public void MapDemo(){
        // Syntax: HashMap <Datatype_key, Datatype value > object_name= new hashMap<>{body}
        HashMap<String, Student> map_student = new HashMap<>();
        Student student1 = new Student("Raj",23,"It");
        Student student2 = new Student("Rajat", 34,"Cs");

        map_student.put("A",student1);
        map_student.put("B",student2);

        for(Student var: map_student.values()){
            System.out.println(var.getName());
            System.out.println(var.getAge());

            System.out.println("printing in loop "+(var).getName());
            System.out.println("printing in loop "+(var).getAge());
        }

        System.out.println("Printing value of student "+ map_student.get("A").getName());
        System.out.println("Printing value of student "+ map_student.get("B").getAge());

    }

    public static void main(String[] args) {
        NewHashMap object = new NewHashMap();
        object.MapDemo();


    }
}
