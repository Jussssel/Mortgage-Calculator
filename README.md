Constructor	
Mortgage(double p, double i, int y)	Construct a new object based on the starting principal, p, the loan’s interest rate, i, and the number of years, y, needed to repay the loan. (Note: interest, i, is expressed as a fraction, e.g., 10% is 0.10.)
Attributes	
private double monthly payment	the loan’s monthly payment, as calculated from the starting principal, interest rate, and duration. (See the formula following this Table.)
private double remaining principal	how much is left to repay of the loan
private double total paid	the total amount of monthly payments paid so far
Methods	
makeMonthlyPayment()	make one monthly payment towards the loan, increasing the total paid and reducing the remaining principal. (See the formula following the Table.)
