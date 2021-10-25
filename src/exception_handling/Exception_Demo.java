package exception_handling;

public class Exception_Demo {
    public void divide(int a, int b){

        int result= 0;
        try {
             result = a / b;
        }catch(Exception e) {
            System.out.println("Exception occurred but handled"+e);
        }
        System.out.println("divide result is "+result);

    }

    public static void main(String[] args) {
        Exception_Demo obj= new Exception_Demo();
        obj.divide(42,0);
    }
}
