import java.util.*;
public class BillCalculator
{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	double sale, taxes, total;
	
	final double TAX_RATE = 0.08;
	final double SHIPPING_FEE = 5.00;
	
	System.out.println("Enter the item price=");
	sale = input.nextDouble();
	taxes = sale*TAX_RATE;
	total = sale + TAX_RATE;
	System.out.println("Sale: $" + sale);
	System.out.println("TAX: $" + taxes);
	
	if(sale<25.00)
	{
		total +=SHIPPING_FEE;
		System.out.println("SHIPPING IS $5.00");
	}
	
	System.out.println("final cost: $"+ total);
	
	}
}