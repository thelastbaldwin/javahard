import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double f, i, kg, m, bmi;
		final double FEET_PER_METER = 0.3048;
		final double POUNDS_PER_KG = 2.2046;

		System.out.print( "Your height (feet only): ");
		f = keyboard.nextDouble();
		System.out.print( "Your height (inches only): ");
		i = keyboard.nextDouble();
		f += ( i / 12.0);
		m = f * FEET_PER_METER;

		System.out.print( "Your weight in pounds: ");
		kg = keyboard.nextDouble() / POUNDS_PER_KG;
		
		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
		keyboard.close();
	}
}
