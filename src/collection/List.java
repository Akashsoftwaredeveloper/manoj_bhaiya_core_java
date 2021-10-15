package collection;

import java.util.ArrayList;

public class List {
    public void demo(){

        // Syntax of List: Arraylist object_name = new Arraylist(){body
        ArrayList list = new ArrayList();

        list.add("Java");          // 0 index
        list.add("Core");          // 1  index
        list.add("Spring");        // 2 index
        list.add("Spring boot");   // 3 index
        list.add("microservice");  // 4 index
        list.add("cloud");         // 5 index


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
            System.out.println("Printing list in advance loop"+var);
        }

        System.out.println("element of list size before deleting is "+ list.size());

        list.remove(1);
        list.remove(2);

        System.out.println("After deleting 1"+ list.get(1));
        System.out.println("After deleting 2"+ list.get(2));

        System.out.println("element of list size after deleting "+ list.size());
    }

    public static void main(String[] args) {
       List object= new List();
       object.demo();
    }

}
