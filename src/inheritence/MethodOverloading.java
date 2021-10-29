package inheritence;

public class MethodOverloading {
    public void m1 (){
        System.out.println("m1 method with no parameter");
    }
    public void m1 (int a){
        System.out.println("m1 method with int params ");
    }
    public void m1 (String b){
        System.out.println("m1 method of String params  ");
    }
    public void m1( int a ,String b){
        System.out.println("m1 method with 2 params ");
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.m1();
        obj.m1(123);
        obj.m1("Rahul");
        obj.m1(123,"Sanjay");

    }
}
