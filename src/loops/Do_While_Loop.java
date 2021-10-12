package loops;

public class Do_While_Loop {
    public static void main(String[] args) {
        /* do {
         code to be executed / loop body
         update statement
         } while (condition);
         */
        int i = 0;
        do {
            System.out.println("This is do while loop " + i);
            i++;
            if (i == 3) {
                break;
            }
        } while (i < 5);

        // 2 do while loop Statement
        int k = 0;
        do {
            System.out.println("This is 2 do while loop " + k);
            k++;
            if (k == 4) {
                break;
            }
        } while (k < 6);

        // 3 do while loop
        int p = 0;
        do {
            System.out.println("This is 3 do while loop" + p);
            p++;
            if (p==2) {
                break;
            }
        }while (p < 8) ;
    }
}
