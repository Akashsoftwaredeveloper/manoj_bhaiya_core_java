package conditional_statement;

public class Condition {

    public static void main(String[] args) {
        // if (expression) {code}
        // else {code}

        int age= 16;
        if (age>18){
            System.out.println("This person is adult");
        }else{
            System.out.println("This person is not adult");
        }

        String city = "pune";
        if (city=="delhii"){
            System.out.println("This person is in pune");
        }else{
            System.out.println("This person is not in pune");
        }
    }
}
