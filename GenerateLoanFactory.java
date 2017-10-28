import java.io.*;
import java.text.*;
import java.util.*;
public class GenerateLoanFactory
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println(" Please enter full name: ");
		String name=br.readLine();
		
		System.out.println(" Please enter account number ");
		String acc_number=br.readLine();
		
		System.out.println(" Please enter bank where you want take the loan");
		String bank_name=br.readLine();
		
		System.out.println(" Please enter the type of loan you want");
		String loan_type=br.readLine();
		
		AbstractFactory factory = FactoryCreator.getFactory("Bank");
		Bank bank_loan=factory.getBank(bank_name);
		System.out.println(" Please enter interest rate "+bank_loan.getBankName()+": ");
		double rate=Double.parseDouble(br.readLine());
		
		System.out.println(" Please enter loan amount");
		double loan_amount=Double.parseDouble(br.readLine());
		
		System.out.println(" Please enter the period of your entire loan");
		int years =Integer.parseInt(br.readLine());
		System.out.println(" Customer full name:       "+name);
		System.out.println(" Customer account number:  "+acc_number);
		System.out.println(" You taking loan from:     "+bank_loan.getBankName());
		
		AbstractFactory loan_factory = FactoryCreator.getFactory("loan");
		Loan loan_done = loan_factory.getLoan(loan_type);
		//loan_factory.getLoan(loan_type);
		loan_done.getInterestRate(rate);
		loan_done.calculateLoanPayment(loan_amount, years);
		System.out.println(" Day of transcation:       "+cal.getTime());
		
		//loan_factory.get
		}

}
