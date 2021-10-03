package conditional_statement;

public class Nested_if_else {
    public static void main(String[] args) {

      int  a=5;
      int  b=0;

      // AND OPERATOR
      if(a>0 && b>1){

          System.out.println("a,bis greater than 0");
      }else{

          System.out.println("a,b is not greater than 0");
      }
      // || PIPE OPERATOR
      if (a>40 || b>1){

          System.out.println("OR operator true block");
      }else{

          System.out.println("OR operator false block");
      }
      // == DOUBLE OPERATOR
      if (a==5 && b==1){
          System.out.println("AND operator true block");
      }else{
          System.out.println("AND operator false block");
      }
      // ! NOT OPERATOR
        if(!(a>6)){
            System.out.println("NOT operator true statement");
        }
        else{
            System.out.println("NOT operator false block");
        }
    }
}
