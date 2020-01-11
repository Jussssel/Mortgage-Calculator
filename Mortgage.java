/** Mortgage is the model. It calculates all the values needed to monitor a house mortgage
 * @param p - the starting principal
 * @param i - the loans interest rate
 * @param y - the number of years needed to pay the loan
 * */

public class Mortgage {
	private double principal;
	private double interes;
	private int years;
	private double payment;
	private double monthlyPayment;
	private double totalPaid;
	private double remainingPrincipal;

public Mortgage(double p, double i, int y)
{	
		principal=p;
		interes=i/100;
		years=y;
}
// Method makeMonthlyPayment() calculates the total payment, the monthly payment, the total paid and the remaining principal
public void makeMonthlyPayment()
{
	payment=(Math.pow((1+interes),years)*principal*interes)/(Math.pow((1+interes),years)-1);
	monthlyPayment= payment/12;
	totalPaid= totalPaid+monthlyPayment;
	remainingPrincipal= principal-totalPaid;
}
// Method monthlyPayment() is a getter method for monthlyPayment
public double monthlyPayment()
{ 	
	return monthlyPayment;
}
//Method totalPaid() is a getter method for totalPaid
public double totalPaid()
{	
	// if the totalPaid is equal or larger than the principal, it means that the loan was totally paid
	if(totalPaid>=principal)
	{
		totalPaid=principal;
	}
	return totalPaid;
}
public double remainingPrincipal() 
{ 
	//if the remainingPrincipal is equal or smaller than 0, means that there is not a remaining principal

	if (remainingPrincipal<=0)
	{
		remainingPrincipal=0;
	}
	return remainingPrincipal;
}
}


