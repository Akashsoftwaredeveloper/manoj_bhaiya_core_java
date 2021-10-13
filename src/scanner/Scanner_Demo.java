package scanner;

import java.util.Scanner;

public class Scanner_Demo {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter username");
        // String
        String username= myObj.nextLine();
        System.out.println("You have entered username as"+username);

        // Numeric int
        System.out.println("Please enter your age");
        int age= myObj.nextInt();
        System.out.println("You have entered age as "+age);

        // double
        System.out.println("Please enter your salary ");
        double salary= myObj.nextDouble();
        System.out.println("You have entered your salary "+ salary);



    }
}
