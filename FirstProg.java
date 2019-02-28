import java.util.Date;
import java.text.SimpleDateFormat;

public class FirstProg {
	public static void main ( String[] args){
		String name = "Steve Minor"; 
		System.out.println( "I, " + name + ",  am determined to learn how to code Java." );
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
		System.out.println( "Today's date is " + dateFormat.format(now));

	}
}
