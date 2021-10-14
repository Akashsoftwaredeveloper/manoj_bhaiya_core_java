package scanner;

import java.util.Scanner;

public class CalculatorWithScanner2 {
    public int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int subtraction(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int multi(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public int divide(int a, int b) {
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {
        CalculatorWithScanner2 obj= new CalculatorWithScanner2();

        Scanner myoObj= new Scanner(System.in);
        System.out.println("Please enter choice value of 1 for Addition, 2 for Subtraction, 3 for Multiplication and 4 for divide ");

        int choice= myoObj.nextInt();
        System.out.println("Please enter value of a:");
        int a= myoObj.nextInt();
        System.out.println("Please enter value of b:");
        int b= myoObj.nextInt();

        int result;
        if ( choice ==1){
            System.out.println("You have selected ADDITION");
            result= obj.addition(a,b);
        }
        else if (choice == 2){
            System.out.println("You have selected SUBTRACTION");
            result= obj.subtraction(a,b);
        }
        else if (choice== 3){
            System.out.println("You have selected MULTIPLICATION");
            result= obj.multi(a,b);
        }
        else{
            System.out.println("You have selected DIVISION");
            result= obj.divide(a,b);
        }
        System.out.println(" Calculator Result is"+result);
    }

    }