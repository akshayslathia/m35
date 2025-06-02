abstract class Bank
{
	private double balance;

	public double getBalance(){ return balance ;}
	public void setBalance(double balance){ this.balance = balance ;}

	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);
}

class SBI extends Bank 
{
	@Override
	public void withdraw(double amount)
	{
		if(amount<=0)
			System.out.println("Invalid amount");
		else 
		{
			if(amount<=getBalance())
			{
				double updated = getBalance() - amount;
				setBalance(updated);
				System.out.println(amount+" withdrawn successfully");
			}
			else 
			{
				System.out.println("Insufficient funds");
			}
		}
	}

	@Override
	public void deposit(double amount)
	{
		if(amount<=0)
			System.out.println("Invalid amount");
		else
		{
			double updated = getBalance() + amount;
			setBalance(updated);
			System.out.println(amount+" depsited successfully");
		}

	}
}

class HDFC extends Bank 
{
	@Override
	public void withdraw(double amount)
	{
		if(amount<=0)
			System.out.println("Invalid amount");
		else 
		{
			if(amount<=getBalance())
			{
				double updated = getBalance() - amount;
				setBalance(updated);
				System.out.println(amount+" withdrawn successfully");
			}
			else 
			{
				System.out.println("Insufficient funds");
			}
		}
	}

	@Override
	public void deposit(double amount)
	{
		if(amount<=0)
			System.out.println("Invalid amount");
		else
		{
			double updated = getBalance() + amount;
			setBalance(updated);
			System.out.println(amount+" depsited successfully");
		}

	}
}

class BankMain
{
	public static void main(String[] args) 
	{
		SBI sbi = new SBI();
		sbi.deposit(5000d);
		System.out.println("Current balance: "+sbi.getBalance());
		sbi.withdraw(2000d);
		System.out.println("Current balance: "+sbi.getBalance());
		System.out.println("====================");

		HDFC hdfc = new HDFC();
		hdfc.deposit(9000d);
		System.out.println("Current balance: "+hdfc.getBalance());
		hdfc.withdraw(2000d);
		System.out.println("Current balance: "+hdfc.getBalance());

	}
}