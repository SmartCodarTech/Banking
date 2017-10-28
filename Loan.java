
abstract class Loan
{
	protected double rate;
	
	abstract void getInterestRate(double rate);
	
		public void calculateLoanPayment(double LoanAmount, int year)
		{
			double Money;  
			int n;   
			n=year*12;  
			rate=rate/1200;  
			Money=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*LoanAmount; 
			System.out.println(" The Loan Amount:          $"+LoanAmount);
			System.out.println(" Monthly Interest rate     $"+Money);
		}

	}


