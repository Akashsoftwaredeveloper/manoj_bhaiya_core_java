package method_function;

public class Calculator_With_Return_Type {

    // Syntax: Access_specifier return_type Method name (Data type variable name){body}

    public int Addition(int a, int b){
        int result= a+b;
       return  result;
    }

    public int Subtraction(int a, int b){
        int sub = a-b;
        return sub;
    }


    public int multiplication(int a, int b){
        int mult= a*b;
        return mult;
    }

    public int Division (int a, int b){
        int divide=a/b;
      return divide;
    }

    public static void main(String[] args) {
        Calculator_With_Return_Type object = new  Calculator_With_Return_Type();
        int var=object.Addition(12,43);
        System.out.println(var);
        int var1= object.Subtraction(43,23);
        System.out.println(var1);
        int var3=object.Division(45,2);
        System.out.println(var3);
        int var4= object.multiplication(32,45);
        System.out.println(var4);
    }

}
