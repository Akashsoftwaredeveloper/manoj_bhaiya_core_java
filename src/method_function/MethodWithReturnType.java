package method_function;

public class MethodWithReturnType {

    // Syntax: Access_specifier return_type method_name (Data_Type variable_name) {Body}

    public String demo(){
         String name= "This is returntype method";
         return name;
    }
    public int  demoInt(){
        int age = 34;
        return age;
    }
    public String Demo (String var){
        String output= var +"Welcome to Java ";
        return output;
    }

    public static void main(String[] args) {
        MethodWithReturnType object = new MethodWithReturnType();
        String var= object.demo();
        System.out.println(var);

        int var1 = object.demoInt();
        System.out.println("This is demoint method "+var1);

        String var2=object.Demo("Pratham");
        System.out.println("This is var2 method "+var2);
    }

}
