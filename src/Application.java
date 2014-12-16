import java.util.Scanner;

class Rcalculator {
	
	
}
public class Application {
	public static void main(String[] args) {
	
	Rcalculator ba = new Rcalculator();
	
	Scanner input = new Scanner(System.in);
	
	// ca = current age, cs = current saving, ci = current interest rate 
	// efi = Future interest rate fi = future income, yi = yearly income 
	double ca, cs, ci, efi, fi, yi;
	
	
	//Current Age, Output
	System.out.println("Enter your current Age: ");
	ca = input.nextDouble();
	//Currently saved Output
	System.out.println("Enter your current saving: ");
	cs = input.nextDouble();
	//Current Interest rate.
	System.out.println();
	ci = input.nextDouble();
	// Expected Future Interest rate
	System.out.println("Expected maximum interest rate: ");
	
	
	
	//Wait for user to enter Age
	String currentAge = input.nextLine();

	}
}
