// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*In the heyday of the Dunder Mifflin empire, Scranton used a monetary system based on schrute-bucks, stanley-nickels, and klevins.

There were 20 klevins to a schrute-buck, and 12 stanley-nickels to a klevin.

The notation for this old system used two decimal points, so that, for example, $5.2.8 meant 5 schrute-bucks, 2 klevins and 8 stanley-nickels.

The new monetary system introduced after Kevin was deposed, consists of only schrute-bucks and stanley-nickels, with 100 stanley-nickels to a schrute-buck. We'll call this new system decimal schrute-buck.

Thus $5.2.8 in the old notation is $5.13 in decimal schrute-bucks (actually $5.1333333).
Write a program to convert the old schrute-bucks stanley-nickels klevins format to decimal schrute-bucks.
Use final variables for each conversion rate
Choose variable names which are meaningful for this problem.*/

import java.util.Scanner;
class CurrencyConversion {
    public static void main(String[] args) {
        final int KLEVINSPERSCHRUTE = 20;
        final int STANLEYPERKELVIN = 12;
        final int STANLEYNICKELPERSCHRUTE = 240;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter schrute-bucks: ");
        int schruteBucks = scanner.nextInt();
        
        System.out.println("Enter klevins: ");
        int klevins = scanner.nextInt();
        
        System.out.println("Enter stanley-nickels: ");
        int stanleyNickels = scanner.nextInt();
        
        double convertKlevins = (double) klevins/KLEVINSPERSCHRUTE;
        double convertStanleynickels = (double) stanleyNickels/STANLEYNICKELPERSCHRUTE;
        double decimalSchrute = schruteBucks + convertKlevins + convertStanleynickels;
        
         System.out.printf("Decimal schrute-bucks = $%.2f", decimalSchrute);
        
        
        
       
    }
}
//console output
/*Enter schrute-bucks: 
7
Enter klevins: 
17
Enter stanley-nickels: 
9
Decimal schrute-bucks = $7.89
/*


*/
