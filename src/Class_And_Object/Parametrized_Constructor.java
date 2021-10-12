package Class_And_Object;

public class Parametrized_Constructor {

    String name;
    int age;

    // Parametrized constructor

    public Parametrized_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Parametrized_Constructor object= new Parametrized_Constructor("Bunty",23);
        System.out.println(object.age);
        System.out.println(object.name);

    }
}
