package exception_handling;

public class Throw_Exceptions {
    public void demo_Throw (int a, int b){
        int result;
        try{
            result= a/b;
        }catch(Exception e){
            System.out.println("Exception occurred "+e);
        }finally {
            System.out.println("This is finally blocked and handled");
        }
    }
    public void WithThrowException(int a,int b) throws ArithmeticException{
        int result= a/b;
        System.out.println("Inside throw "+result);
    }
    public void addition(int a, int b)throws Exception{
        int result= a+b;
        throw new Exception();
    }

    public static void main(String[] args) {
        Throw_Exceptions obj= new Throw_Exceptions();
        obj.demo_Throw(44,0);

        try {
            obj.WithThrowException(4, 0);
        }catch (Exception e){
            System.out.println("Exception occurred with throw exception ");
        }

        try {
            obj.addition(4,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
