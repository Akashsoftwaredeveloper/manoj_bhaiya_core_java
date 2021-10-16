package collection;

import java.util.ArrayList;

public class List {
    public void demo(){

        // Syntax of List: Arraylist object_name = new Arraylist(){body
        ArrayList list = new ArrayList();

        list.add("Java");          // 0 index
        list.add("Core");          // 1  index spring
        list.add("Spring");        // 2 index  spring boot
        list.add("Spring boot");   // 3 index  microservice
        list.add("microservice");  // 4 index  cloud
        list.add("cloud");         // 5 index  test
        list.add("Test");          // 6 index


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));

        // for loop
        for (int i=0; i<list.size();i++){
            System.out.println("Printing List in for loop "+list.get(i));
        }
        // Advance for loop
        for(Object var: list){
            System.out.println("Printing list in advance loop  "+var);
        }

        System.out.println("element of list size before deleting is "+ list.size());

        list.remove(1);
        list.remove(4);

        for(Object output: list){
            System.out.println("Objects after deleting in advance for loop "+output);
        }


        System.out.println("After deleting 1"+ list.get(1));
        System.out.println("After deleting 2"+ list.get(4));


        System.out.println("element of list size after deleting "+ list.size());
    }

    public static void main(String[] args) {
       List object= new List();
       object.demo();
    }

}
