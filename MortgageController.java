import javax.swing.JOptionPane;
public class MortgageController {
// executes all the classes
public static void main(String[] args)
{  
	MortgageReader reader= new MortgageReader();
    Mortgage model= new Mortgage(reader.askPrincipal(),reader.askInteres(),reader.askYears());
    MortgageWriter writer= new MortgageWriter(model);
    // keeps the confirmDialog open for the user to submit payments
    while(true)
    {
    	int vlera= JOptionPane.showConfirmDialog(null, "Do you want to submit this months payment? ");
    	if (vlera==0)
    	{
    		model.makeMonthlyPayment();
    		writer.repaintMethod();55553432323413413
    	}
    	else
    	{
    		System.exit(0);
    	}
    }
	}
}