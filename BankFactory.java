
  class BankFactory extends AbstractFactory
{
    public  Bank getBank(String bank)
    {
    	if(bank==null)
    	{
    		return null;
    	}
    	if(bank.equalsIgnoreCase("GCB Bank")||bank.equalsIgnoreCase("Ghana Commercial Bank"))
    	{
    		return new GCB();
    	}
    	else if(bank.equalsIgnoreCase("Stanbic bank")||bank.equalsIgnoreCase("StanbicBank"))
    	{
    		return new StanbicBank();
    	}
    	else if(bank.equalsIgnoreCase("ECOBANK")||bank.equalsIgnoreCase("Ecobank"))
    	{
    		return new ECOBANK();
    	}
    	else if(bank.equalsIgnoreCase("EnergyBank")||bank.equalsIgnoreCase(" Energy Bank"))
    	{
    		return new EnergyBank();
    	}
    	else if(bank.equalsIgnoreCase("CALBANK")||bank.equalsIgnoreCase("CAL BANK"))
    	{
    		return new CALBANK();
    	}
    	return null;
    }
    	public Loan getLoan(String loan)
    	{
    		return null;
    	}
    }
