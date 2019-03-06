import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevised {
	public static void main ( String[] args) throws Exception{
        double ppg = 3.34;
        double gallons, total;
        Scanner keyboard = new Scanner(System.in);
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mma");
        PrintWriter fileout;

        System.out.println("Gas costs $" + ppg + " per gallon.");
        System.out.print("How many gallons of gas do you want? ");
        gallons = keyboard.nextDouble();
        total = gallons * ppg;
        System.out.println("Total cost: $" + total);

        System.out.print("Writing customized receipt to 'receipt.txt'...");
        try { 
            fileout = new PrintWriter("receipt.txt");
        }
        catch (IOException err){
            System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
            System.out.println("Maybe the file exists and is read-only?");
            fileout = null;
            System.exit(1);
        }

        fileout.println( "+-----------------------+" );
        fileout.println( "|                       |" );
        fileout.println( "|      CORNER STORE     |" );
        fileout.println( "| " + dateFormat.format(now) + "   |" );
        fileout.println( "|                       |" );
        fileout.printf( "| Gallons:      %.3f  |\n", gallons );
        fileout.printf( "| Price/gallon: $ %.3f |\n", ppg );
        fileout.println( "|                       |" );
        fileout.printf( "| Fuel total:  $ %.2f  |\n", total );
        fileout.println( "|                       |" );
        fileout.println( "+-----------------------+" );
        fileout.close();
        System.out.print("done.\n");
        keyboard.close();
    }
}
