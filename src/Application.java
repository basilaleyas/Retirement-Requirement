import java.util.Scanner;

class Rcalculator {
	
	
}
public class Application {
	public static void main(String[] args) {
	
	Rcalculator ba = new Rcalculator();
	
	Scanner input = new Scanner(System.in);
	
	// ca = current age, ra = retirement age
	int ca, ra;
	/*cs = current saving, ci = current interest rate, cye = current earning
   * pfye = projected future yearly earning 
	efi = Maximum future interest rate, emi = Minimum future interest rate
	fi = future income, yi = yearly income */
	double cs, ci, cye, pfye, efi,emi, fi, yi;
	/*dAge = Difference from  Retirement age to current age
	 * hInt = High interest rate average
	 * mInt = Minimum interest rate average
	 */
	double dAge, hInt, mInt;
	
	
	//Current Age, Output
	System.out.println("Enter your current Age: ");
	ca = input.nextInt();
	//Year expected to retirement age
	System.out.println("Retirement Age: " );
	ra = input.nextInt();
	// Current Monthly Earning
	System.out.println("Current Monthly Earning: ");
	cye = input.nextDouble();
	//Projected future earning
	System.out.println("Estimated future earning: ");
	pfye = input.nextDouble();
	//Currently saved Output
	System.out.println("Enter your current saving: ");
	cs = input.nextDouble();
	//Current Interest rate.
	System.out.println("Enter current interest rate: ");
	ci = input.nextDouble();
	// Maximum Future Interest rate
	System.out.println("Maximum interest rate: ");
	efi = input.nextDouble();
	//Minimum interest rate
	System.out.println("Mimum Interest rate: ");
	emi = input.nextDouble();
	
	
	
	
	dAge = ra - ca;
	
	
	


	}
}
