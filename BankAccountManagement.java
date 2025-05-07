class BankAccount
{
	private long accountNumber; // r,w
	private String accountHolderName; // r,w
	private double balance; // r,w


	public long getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName()
	{
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	public void deposit(double amount)
	{

		if(amount<=0)
			System.out.println("Invalid amount");
		else 
		{
			balance = balance + amount;// updating the balance
			System.out.println(amount+" deposited successfully");
		}
	}

	public void withdraw(double amount)
	{
		if(amount<=0)
			System.out.println("Invalid amount to withdraw");
		else if(amount>balance)
			System.out.println("Insufficient balance");
		else 
		{
			balance = balance - amount;
			System.out.println(amount+" withdrawn successfully");
		}

	}
}

class BankAccountManagement
{
	public static void main(String[] args) 
	{
		BankAccount ba = new BankAccount();
		ba.setBalance(2);
		ba.setAccountNumber(468484873573l);
		ba.setAccountHolderName("mala");
		System.out.println("Account holder name "+ba.getAccountHolderName());
		System.out.println("Account Balance "+ba.getBalance());
		System.out.println("Account number "+ba.getAccountNumber());
		System.out.println("-------------");

		ba.deposit(9000d);
		System.out.println("Updated balance "+ba.getBalance());
		System.out.println("------------------");

		ba.withdraw(6000d);
		System.out.println("Updated balance "+ba.getBalance());
		System.out.println("------------------");
		System.out.println("Account holder name "+ba.getAccountHolderName());
		System.out.println("Account Balance "+ba.getBalance());
		System.out.println("Account number "+ba.getAccountNumber());




	}
}