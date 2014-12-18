import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Rcalculator {
	
	
}
public class Application {
	public static void main(String[] args) {
	
	Rcalculator ba = new Rcalculator();
	
	Scanner input = new Scanner(System.in);
	
	/* ca = current age
	ra = retirement age*/
	
	int ca, ra;
	
	/*cs = current saving, ci = current interest rate
	 * cye = current earning
   * pfye = projected future yearly earning 
	efi = Maximum future interest rate
	 emi = Minimum future interest rate
	fi = future income
	yi = yearly income */
	
	double cs, ci, cye, pfye, efi,emi, fi, yi;
	
	
	/*dAge = Difference from  Retirement age to current age
	 *cInt = Current interest rate average
	 * hInt = High interest rate average
	 * mInt = Minimum interest rate average
	 * ySi = Yearly salary Increase
	 * yTr = Yearly times retirement years left
	 */
	int dAge;
	double  cInt, hInt, mInt,ySi,yTr;
	
	
	//Current Age, Output
	System.out.println("Enter your current Age: ");
	ca = input.nextInt();
	if (ca <= 0) {
		System.out.println("Invalid number, you cannot be an age 0");
		
		System.exit(0);
	}
	//Year expected to retirement age
	System.out.println("Retirement Age: " );
	ra = input.nextInt();
	if (ca >= ra) {
		System.out.println("Invalid number, Current age shouldn't be higher than retirement age");
		
		System.exit(0);
	}
	// Current Monthly Earning
	System.out.println("Current Yearly Earning: ");
	cye = input.nextDouble();
	//Currently saved Output
	System.out.println("Enter your current saving: ");
	cs = input.nextDouble();
	//Current Interest rate.
	System.out.println("Enter current savings rate: ");
	ci = input.nextDouble();
	ci /= 100.0;

	
	
	
	// Years difference 
	dAge = ra - ca;
	
	//With current earning + interest
	cInt = (cye * ci) ;
	
	//Yearly Increase in Salary about 3.8%
	
	ySi = (cye * 0.038) + cye;  
	
	
	//Yearly Increase time retirement years left
	
	yTr = ySi * dAge;
	
	//
	
	
	
	System.out.println("You have " + dAge + " Years left for Retirement");
	System.out.println(ySi);
	System.out.println(yTr);
	
	
	


	}
}
}