/**MortgageView is the output view. 
  */
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class MortgageWriter extends JPanel
{
	
	private static final long serialVersionUID = 1L;
	private int WIDTH=400;
	private int HEIGHT=300;
	private int xPosition=60;
	private int yPosition=50;
	private int distance=20;
	private Mortgage model;
public MortgageWriter(Mortgage m) 
    {
	//Creates a frame to display the values
	model=m;
	JFrame frame= new JFrame();
	frame.getContentPane().add(this);
	frame.setSize(WIDTH,HEIGHT);
	frame.setTitle("Mortgage monitoration!");
	frame.setBackground(Color.white);
	frame.setVisible(true);
	}
//Displays the values in the panel
public void paintComponent(Graphics g)
{
	
drawMonthlyPayment(g);
drawTotalPaid(g);
drawRemainingPrincipal(g);
}
//Draws MonthlyPayment
public void drawMonthlyPayment(Graphics pen)
{
	pen.setColor(Color.black);
	
	pen.drawString("The monthlyPayment "+formatting(model.monthlyPayment()),xPosition,yPosition);
	
}
//Draws the TotalPaid
public void drawTotalPaid(Graphics pen)
{
	pen.setColor(Color.black);
	
	pen.drawString("The Total Paid "+formatting(model.totalPaid()),xPosition,yPosition+distance);
	
}
//Draws the Remaining Principal
public void drawRemainingPrincipal(Graphics pen)
{
	pen.setColor(Color.black);
	
	pen.drawString("The Remaining Principal "+formatting(model.remainingPrincipal()),xPosition,yPosition+2*distance);
	
}
//Formats the values using the DecimalFormat class
private String formatting(double d)
{
	return new DecimalFormat("0.00").format(d);
}

public void repaintMethod()
{
this.repaint();	
}
}
