package scanner;

import java.util.Scanner;

public class CalculatorWithScanner {
    public int addition(int a,int b){
        int sum= a+b;
        return sum;
    }
    public int subtraction(int c, int d){
        int sub= c-d;
        return sub;
    }public int multiplication(int g,int h){
        int multi =g*h;
        return multi;
    }public int divide(int x, int z){
        int div=x/z;
        return div;
    }

    public static void main(String[] args) {
        CalculatorWithScanner obj= new CalculatorWithScanner();

        // Addition
        Scanner myObj= new Scanner(System.in);// Scanner object is created
        System.out.println("Please enter value of a");
        int a= myObj.nextInt();
        System.out.println("Please enter value of b");
        int b= myObj.nextInt();

       int result= obj.addition(a,b);
        System.out.println("Addition is: "+result);
        // subtraction

        System.out.println("please enter value of c");
        int c=myObj.nextInt();
        System.out.println("please enter value of d");
        int d =myObj.nextInt();

        int output=obj.subtraction(c,d);
        System.out.println("Subtraction is"+output);

        // Multiplication

        System.out.println("Please enter value of g");
        int g= myObj.nextInt();
        System.out.println("Please enter value of g");
        int h=myObj.nextInt();

        int Store=obj.multiplication(g,h);
        System.out.println("Multiplication is "+Store);

        // division
        System.out.println("Please enter vale of x");
        int x=myObj.nextInt();
        System.out.println("Please enter value f z");
        int z= myObj.nextInt();

        int put=obj.divide(x,z);
        System.out.println("Division is: "+put);


    }
}
