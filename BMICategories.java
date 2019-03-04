import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args) {
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

    System.out.println("BMI: " + bmi);
    System.out.println("BMI category: ");
    if ( bmi < 15.0 ){
      System.out.println("very severely underweight");
    }
    else if (bmi <= 16.0 ){
      System.out.println("severely underweight");
    }
    else if (bmi < 18.5){
      System.out.println("underweight");
    }
    else if (bmi < 25.0){
      System.out.println("normal weight");
    }
    else if (bmi < 30.0){
      System.out.println("overweight");
    }
    else if (bmi < 35.0){
      System.out.println("moderately obese");
    }
    keyboard.close();
  }
}