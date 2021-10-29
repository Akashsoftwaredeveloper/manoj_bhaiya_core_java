package exception_handling;

import java.util.Scanner;

public class CustomExceptionDemo {

    public void verify_age(int age) throws InvalidAgeException {
        if (age < 18){
            throw new InvalidAgeException("Invalid age exception as your age is less than 18 ");
        }else{
            System.out.println("Welcome to voting System "
            );
        }
    }

    public static void main(String[] args) throws InvalidAgeException {

        Scanner myObj= new Scanner(System.in);

        System.out.println(" Please enter your age for voting ");
        int age = myObj.nextInt();

        CustomExceptionDemo obj= new CustomExceptionDemo();
        obj.verify_age(age);

    }
}
