package method_function;

public class Calculator {

    int a= 24;
    int b= 12;

    // Syntax/: Access_specifier return_type method_name(){body}
    public void add(){
        int sum= a+b;
        System.out.println("This is addition method "+ sum);
    }
    // This is subtraction method
    public void sub(){
        int minus = a-b;
        System.out.println("This is subtraction method  "+minus);
    }
    // multiplication method
    public void multiplication (){
        int multi= a*b;
        System.out.println("This s multiplication method "+multi);
    }
    // This is division method
    public void division(){
        int divide =a/b;
        System.out.println("This is division method "+divide);
    }

    public static void main(String[] args) {
        Calculator object = new Calculator();
        object.add();
        object.sub();
        object.multiplication();
        object.division();
    }
}
