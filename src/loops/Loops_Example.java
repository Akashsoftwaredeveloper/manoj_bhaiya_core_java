package loops;

public class Loops_Example {
    public static void main(String[] args) {

        int two= 2;
        int three= 3;

        int i=1;

        while (i<=10){
            int a = two*i;
            int b = three*i;

            System.out.format("Table of two %d    Table of three %d",a,b);
            System.out.println("");
            i++;
        }
    }

}
