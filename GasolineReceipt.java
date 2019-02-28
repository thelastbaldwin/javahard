import java.util.Date;
import java.text.SimpleDateFormat;

public class GasolineReceipt {
	public static void main ( String[] args){
        double ppg = 3.34;
        double gallons = 10.870;
        Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mma");

        System.out.println( "+-----------------------+" );
        System.out.println( "|                       |" );
        System.out.println( "|      CORNER STORE     |" );
        System.out.println( "| " + dateFormat.format(now) + "   |" );
        System.out.println( "|                       |" );
        System.out.printf( "| Gallons:      %.3f  |\n", gallons );
        System.out.printf( "| Price/gallon: $ %.3f |\n", ppg );
        System.out.println( "|                       |" );
        System.out.printf( "| Fuel total:  $ %.2f  |\n", gallons * ppg );
        System.out.println( "|                       |" );
        System.out.println( "+-----------------------+" );
    }
}
