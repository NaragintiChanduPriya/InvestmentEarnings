package InvestmentEarningsproject;
import java.util.Scanner;
import java.text.*;
public class Driver {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the buying price: ");
	double buyingprice=scan.nextDouble();
	double closingprice;
	double totalearnings = 0;
	DecimalFormat df=new DecimalFormat("0.00");
    int day=1;
    while(true) {
    	System.out.println("Enter the closing price for day : "+day+"(any negative value leads to leave");
    	closingprice=scan.nextDouble();
    	if(closingprice<0.0) {
    		System.out.println("We always find earnings with the positive value,it is not possible with negative value");
    		break;
    	}
    	double earnings=closingprice-buyingprice;
    	if(earnings>0.0) {
    		System.out.println("day"+day+": you earned "+df.format(earnings)+" on per share");
    		totalearnings=totalearnings+earnings;
    		System.out.println("Your total earnings is "+df.format(totalearnings)+" till this day"+day);
    		
    	}
    	else if(earnings<0.0) {
    		System.out.println("day"+day+": you lost "+df.format(-earnings)+" on per share");
    		totalearnings=totalearnings+earnings;
    		System.out.println("Your total earnings is"+df.format(totalearnings)+"till this day"+day);
    		
    	}
    	else {
    		System.out.println("day"+day+": you have not earned per share");
    		System.out.println("Your total earnings is"+df.format(totalearnings)+" till this day"+day);
    	}
    	day++;
    	
    	
    
    
    }
	
}
}
