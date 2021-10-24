package collection;

import java.util.HashMap;

public class HashMapDemo {
    public void demo(){
       // Syntax: HashMap <Datatype_key, Datatype value > object_name= new hashMap<>{body}

        HashMap<Integer, String> hashmap_names= new HashMap<>();
        hashmap_names.put(1,"Raj");
        hashmap_names.put(2,"Santosh");
        hashmap_names.put(3,"Rajan");
        hashmap_names.put(4,"Jayant");

        // get method
        System.out.println(hashmap_names.get(1));
        System.out.println(hashmap_names.get(2));
        System.out.println(hashmap_names.get(3));

        // we can use advance for loop but we cant use normal loop
        for (Integer var: hashmap_names.keySet()){
            System.out.println("Printing names in advance loop "+hashmap_names.get(var));
        }
    }

    public static void main(String[] args) {
        HashMapDemo obj= new HashMapDemo();
        obj.demo();
    }

}
