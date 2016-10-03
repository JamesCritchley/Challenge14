
package challenge14;
import java.util.Random;
import java.util.Scanner;

public class Challenge14 {

  
    public static void main(String[] args) {
        Random rand = new Random ();
        int n = rand.nextInt(1000000)+1;
        System.out.println("I've thought of a number between 1 and 1000000. Guess it.");
        Scanner sc = new Scanner(System. in);
        boolean loop = true;
        while (loop==true){
        int guess1 = sc.nextInt();
        if (n==guess1){
            System.out.println("Correct, well done!"); 
            break;
        }
        if (n<guess1){
            System.out.println("Lower"); 
        }
        if (n>guess1){
            System.out.println("Higher");
        }}
        
    }
    
}
