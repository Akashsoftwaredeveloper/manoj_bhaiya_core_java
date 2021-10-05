package loops;

public class Do_While_Loop {
    public static void main(String[] args) {
        /* do {
         code to be executed / loop body
         update statement
         } while (condition);
         */
          int i=0;
        do {
            System.out.println("This is do while loop "+i);
            i++;
        } while(i<5);

        // 2 do while loop
        int k=0;
        do {
            System.out.println("This is 2 do while loop "+k);
            k++;
        }while (k<6);

    }
}
