package conditional_statement;

public class Logical_Operator {
    public static void main(String[] args) {

        int age= 15;
        String city= "Agra";

        if (age>15 && city == "Agra") {
            System.out.println("this person is adult and live in agra");
        }else{
            System.out.println("This person is not adult and not live in agra city");
        }
        if(age<16 || city=="Delhi"){
            System.out.println("This person is adult and not live in agra");
        }else{
            System.out.println("This is else part");
        }
    }
}
