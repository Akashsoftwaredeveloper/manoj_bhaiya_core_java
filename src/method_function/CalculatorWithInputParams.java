package method_function;

public class CalculatorWithInputParams {

    // Syntax: Access_specifier return_type Method name (Data type variable name){body}

    public void Addition(int a, int b){
        int c= a+b;
        System.out.println("This is addition method "+c);
    }

    public void Subtraction(int a, int b){
        int c = a-b;
        System.out.println("This is Subtraction method "+c);
    }


    public void multiplication(int a, int b){
        int c= a*b;
        System.out.println("This is multiplication method "+c);
    }

    public void Division (int a, int b){
        int c=a/b;
        System.out.println("This is division method"+c);
    }

    public static void main(String[] args) {
        CalculatorWithInputParams object = new CalculatorWithInputParams();
        object.Addition(12,43);
        object.Subtraction(43,23);
        object.Division(45,2);
        object.multiplication(32,45);
    }
}

