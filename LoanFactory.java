
public class LoanFactory extends AbstractFactory
{
	public Bank getBank(String bank)
	{
		return null;
	}
	public Loan getLoan(String loan)
	{
		if(loan==null)
		{
			return null;
		}
		if(loan.equalsIgnoreCase("Homeloan")||loan.equalsIgnoreCase("Home loan"))
		{
			return new HomeLoan();
		}
		else if(loan.equalsIgnoreCase("BusinessLoan")||loan.equalsIgnoreCase("Business loan"))
		{
			return new BusinessLoan();
		}
		else if(loan.equalsIgnoreCase("EducationLoan")||loan.equalsIgnoreCase("Education loan"))
		{
			return new EducationLoan();
		}
		return null;
	}
	
}	

