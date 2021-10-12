package method_function;

public class Function_MethodInputParams {

    // Syntax: Access_specifier ReturnType method_name(Data_Type Variable_name){body}

    public void Hello  (String name){
        System.out.println("This is hello method............"+name);
    }
    public void test (int a, String name){

        a=a+1;

        System.out.println("This is test method"+  a  +"  "+ name);
    }

    public static void main(String[] args) {
        Function_MethodInputParams object= new Function_MethodInputParams();
        object.Hello("Java");
        object.test(3,"Spring");

    }
}
