abstract class Company
{
	private double baseSalary;

	Company(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary()
	{ 
		return baseSalary ;
	}
	public void setBaseSalary(double baseSalary)
	{ 
		this.baseSalary = baseSalary ;
	}

	public abstract double calculateSalary();// abstract method

}

class Employee extends Company 
{
	int noOfHrsWorked;

	Employee(double baseSalary,int noOfHrsWorked)
	{
		super(baseSalary);
		this.noOfHrsWorked = noOfHrsWorked;
	}

	@Override
	public double calculateSalary()
	{
		double oneDaySalary = getBaseSalary()/28;
		double oneHrSalary = oneDaySalary/9;
		double totalSalary = oneHrSalary * noOfHrsWorked;

		return totalSalary;
	}
}

class Manager extends Company
{
	double bonus;

	Manager(double baseSalary,double bonus)
	{
		super(baseSalary);
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary()
	{
		return bonus + getBaseSalary();
	}


}

class CompnayMain
{
	public static void main(String[] args) 
	{
		Employee e = new Employee(19000d,210);
		System.out.println("Employee salary :"+e.calculateSalary());
		System.out.println("------------");
		Manager m = new Manager(250000d,120000d);
		System.out.println("Manager salary is :"+m.calculateSalary());	
	}
}