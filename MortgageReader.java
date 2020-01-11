/**MortgageReader is the input view where the user writes the values and the program reads and checks them
 * */
import javax.swing.JOptionPane;
public class MortgageReader 
{
	
// Ask the user to write the starting principal
public double askPrincipal()
{
String starting_principal=JOptionPane.showInputDialog("Please write the principal in $");
double  principal= Double.parseDouble(starting_principal);
//if the user submits a negative value or zero, the program asks the user to type again
if(principal<=0)
{
	JOptionPane.showMessageDialog(null,"Mortgage error, principal negative or zero!");
	this.askPrincipal();
}
return principal;
}

// Asks the user to write the interes rate
public double askInteres()
{
String starting_interes= JOptionPane.showInputDialog("Please write the interes rate in % ");
double interes=Double.parseDouble(starting_interes);
//if the user submits a negative value or zero, the program asks the user to type again
if (interes<=0)
{
	JOptionPane.showMessageDialog(null,"Mortgage error, interes rate negative or zero!");
	this.askInteres();
}
return interes;
}

// Asks the user to submit the years of the loan duration
public int askYears()
{
String starting_years= JOptionPane.showInputDialog("Please write loan duration in years");
int years=Integer.parseInt(starting_years);
//if the user submits a negative value or zero, the program asks the user to type again
if (years<=0)
{
	JOptionPane.showMessageDialog(null,"Mortgage error, years negative or zero!");
	this.askYears();
}
return years;
}

}

