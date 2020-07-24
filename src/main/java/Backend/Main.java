
package Backend;

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese la primera palabra");
        String sequence1 = scanner.nextLine();              
        System.out.println("Ingrese la segunda palabra");
        String sequence2 = scanner.nextLine();  
        
        Control control1 = new Control(sequence1,sequence2);
        String result = control1.CompareSequences();
        System.out.println(result);
    }
    
    
}
