package collection;

import java.util.HashSet;

public class HashsetDemo {
    public HashSet<String>  demo(){
        // Syntax : HashSet <Data Type> object name = new HashSet<>();

        HashSet<String> string_names= new HashSet<>();

        string_names.add("Ram");
        string_names.add("Shyam");
        string_names.add("Surendre");
        string_names.add("Ram");
        string_names.add("Shyam");
        string_names.add("Surendre");
        string_names.add("Ram");
        string_names.add("Shyam");
        string_names.add("Surendre");

          return string_names;
        }

    public static void main(String[] args) {
        HashsetDemo obj= new HashsetDemo();
        HashSet<String> object=  obj.demo();
        for(String var:object)
        System.out.println("Printing HashSet demo with return type: " + var);
        }

    }

