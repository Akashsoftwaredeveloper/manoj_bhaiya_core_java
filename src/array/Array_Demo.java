package array;

public class Array_Demo {
    public static void main(String[] args) {
        // Syntax of Array: DataType[] Variable name = {,,,,,,}

        String [] nameArrays = {"Java","Core java","Spring","Spring boot"};

        // for loop
        for (int i=0; i<nameArrays.length; i++){
            System.out.println(nameArrays[i]);
        }

        // Advance loop Statement: for(Datatype var_name: Object_name)
        for(String var: nameArrays){
            System.out.println("Advance for loop"+var);
        }

        int[] marksArray={123,43,123,34,123,33};

        for (int j=0; j<marksArray.length;j++)
        {
            System.out.println(marksArray[j]);
        }
        // Advance loop Statement: for(Datatype var_name: Object_name)

        for (int var:marksArray){
            System.out.println("Printing Advance marks "+var);
        }
        double [] price_double={234.34,321.43,453.43,231.43,564.34};

        for(int l =0; l< price_double.length; l++){
            System.out.println(price_double[l]);
        }
        // Advance loop Statement: for(Datatype var_name: Object_name)

        for (double var:price_double){
            System.out.println("Advance loop double price  "+var);
        }
    }

}
