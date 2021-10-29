package exception_handling;

import java.util.Scanner;

public class CustomException_Demo {

    public void verify_number(int num) throws InvalidNumberException.InvalidNumException {
        if (num > 10 ){
            throw new InvalidNumberException.InvalidNumException("Please enter 10 digit number");
        }else if (num<10){
            throw new InvalidNumberException.InvalidNumException("Invalid number: number is less than 10 digit");
        }else{
            System.out.println("Thank you");
        }
    }

    public static void main(String[] args) {
        Scanner scObj= new Scanner(System.in);

        System.out.println("Please enter 10 digit number");
        String number= scObj.next();
        int num=number.length();
        CustomException_Demo obj = new CustomException_Demo();
        try {
            obj.verify_number(num);
        } catch (InvalidNumberException.InvalidNumException e) {
            e.printStackTrace();
        }


    }
}
