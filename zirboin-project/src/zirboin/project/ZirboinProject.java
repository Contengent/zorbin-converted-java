/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */

package zirboin.project;
import java.util.Scanner;

public class ZirboinProject {
    public static void main(String[] args) {
        
        // If I remember correctly, this is called(universally) a 2d-array.
        // all it does is hold the name of the coin, then it's value.
        String[][] currencyArray ={
            {"Drobzit", "100000"},
            {"Clickwick", "50000"},
            {"Gazoontight", "10000"},
            {"Frazoint", "1000"},
            {"Biointoint", "500"},
            {"Vorbits", "1"}
        };
        
        // import and variable defined
        Scanner intInput = new Scanner(System.in);
        long calculable;
        
        // menu being printed
        System.out.println("Hello, this program will calculate the least amount of coins required for your vorbits amount.");
        System.out.println("Be weary, if a big enough number is entered, the program will fail!");
        System.out.println("Please enter the amount of Vorbits you own: ");
        calculable = intInput.nextInt();
        System.out.println("");
        
        // simple loop using the amount of values in "currencyArray"
        for(int i = 0; i < currencyArray.length; i++){
            System.out.println("Number of " + currencyArray[i][0] + " coins required: ");
            calculable = calculationFunction(calculable, Integer.parseInt(currencyArray[i][1]));
        }
    }
    
    // A simplification of the calculation function (as to make code a lot cleaner)
    public static long calculationFunction(long baseValue, int currency){
        // input value is devided by currency value. This returns an INTEGER, which will then multiply the currency value
        // then finally take away from the inital input value.
        // ex. 50/4 -> 12 -> 12*4 -> 48 -> 50-48 -> 2
        long tempLong = baseValue - (currency*(baseValue/currency));
        // this simply prints the amount of times currency can fit into baseValue as an integer.
        System.out.println(baseValue/currency + "\n");
        return tempLong;
    }
    
}
