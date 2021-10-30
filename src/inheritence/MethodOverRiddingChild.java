package inheritence;

public class MethodOverRiddingChild extends MethodOverRiding_Parent {
    public void m2 (){
        System.out.println(" Im in m1 method child class");
    }

    public static void main(String[] args) {
        MethodOverRiddingChild child = new MethodOverRiddingChild();
        child.m2();
        MethodOverRiding_Parent obj= new MethodOverRiddingChild();
        obj.m2();

    }
}
