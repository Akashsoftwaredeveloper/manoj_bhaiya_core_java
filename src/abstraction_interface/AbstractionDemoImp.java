package abstraction_interface;

public class AbstractionDemoImp extends AbstractionDemo {

    @Override
    public void m1() {
        System.out.println("This is m1 method of Abstract class");
    }

    public static void main(String[] args) {
        AbstractionDemoImp obj = new AbstractionDemoImp();
        obj.m1();
    }
}
