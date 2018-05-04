package day18_cj_abstract;

abstract class Bank1
{
	String bname,brname;
	
	
	Bank1(String bname, String brname)
	{
		this.bname=bname;
		this.brname=brname;
	}
	
	abstract void rateOfInterest();
}

public class AccHolder extends Bank1
{
	String acchoname,acctype;
	int accnumber;
	double balance,year;
	static float irate=7.5f;
	AccHolder(String acchoname, String acctype, int accnumber, double year, double balance, String bname, String brname)
	{
		super(bname,brname);
		this.acchoname = acchoname;
		this.accnumber=accnumber;
		this.acctype=acctype;
		this.balance=balance;
		this.year=year;
	}
	
	void display()
	{
		System.out.println("Bank name : "+bname);
		System.out.println("Bank branch : "+brname);
		System.out.println("\nAccount holder name : "+acchoname);
		System.out.println("Account type : "+acctype);
		System.out.println("Account number : "+accnumber);
		System.out.println("\nBalance : : "+balance);
		System.out.println("Rate of interest : "+irate);
		System.out.println("Years : "+year);
	}
	
	void rateOfInterest()
	{
		double interest;
		interest=(balance* year* irate)/100;
		balance=balance + interest;
		System.out.println("\nInterst : "+interest);
		System.out.println("\nNet Balance : "+balance);
	}
	
	public static void main(String[] args) 
	{
		AccHolder b=new AccHolder("Sushant","Saving Account",200047885,5.3,500000,"SBI Bank","Mumbai Branch");
		b.display();
		b.rateOfInterest();
		
	}

}
