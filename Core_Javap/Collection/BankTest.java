package collection;

import java.util.ArrayList;
import java.util.Scanner;

class Bank
{
	private int accNo;
	private String accHolderName,accType,branch,bankName;
	private double balance,deposit,withdraw;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}
	public Bank(int accNo, String accHolderName, String accType, String branch, String bankName) 
	{
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.branch = branch;
		this.bankName = bankName;
		
	}
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", accHolderName=" + accHolderName + ", accType=" + accType + ", branch="
				+ branch + ", bankName=" + bankName + ", balance=" + balance + ", deposit=" + deposit + ", withdraw="
				+ withdraw + "]";
	}
	
	
}

public class BankTest
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		
		ArrayList<Bank> al=new ArrayList<>();
		int accNo,choice=0,count=0;
		String accHolderName,accType,branch,bankName;
		Scanner scn=new Scanner(System.in);
		
		do{
			System.out.println(" 1.Add Account \n 2.Update Account \n 3.Delete Account \n 4.Search Account "
								+ "\n 5.Display all Accounts \n 6.Depositing money \n 7.Withdrawing Money \n 8.Exit");
			System.out.println("Enter your choice : ");
			choice=scn.nextInt();
			
			switch (choice) {
			case 1:System.out.println("----- Add your bank Details -----");
					System.out.println("Enter your account no. : ");
					accNo=scn.nextInt();
					System.out.println("Enter account holder name : ");
					accHolderName=scn.next();
					System.out.println("Enter your account type : ");
					accType=scn.next();
					System.out.println("Enter your bank name : ");
					bankName=scn.next();
					System.out.println("Enter bank branch name : ");
					branch=scn.next();
					
					Bank b=new Bank(accNo, accHolderName, accType, branch, bankName);
					b.setAccNo(accNo);
					b.setAccHolderName(accHolderName);
					b.setAccType(accType);
					b.setBankName(bankName);
					b.setBranch(branch);
					
					al.add(b);
					System.out.println("Account Details added successfully\n");
					break;
					
			case 2:System.out.println("Enter account no. want to be update : ");
					accNo=scn.nextInt();
					
					for(Bank i : al)
					{
						if((i.getAccNo())==accNo)
						{
							System.out.println("Enter account holder name : ");
							accHolderName=scn.next();
							i.setAccHolderName(accHolderName);
							System.out.println("Enter your account type : ");
							accType=scn.next();
							i.setAccType(accType);
							System.out.println("Enter your bank name : ");
							bankName=scn.next();
							i.setBankName(bankName);
							System.out.println("Enter bank branch name : ");
							branch=scn.next();
							i.setBranch(branch);
						}
					}
				
					System.out.println("Details updated successfully\n");
					break;
					
			case 3:System.out.println("Enter account no. want to be delete : ");
					accNo=scn.nextInt();
			
					for(Bank i : al)
					{
						if((i.getAccNo())==accNo)
						{							
							al.remove(i);
						}
					}
					System.out.println("Account details deleted successfully\n");
					break;
					
			case 4:System.out.println("Enter account no. want to be search : ");
					accNo=scn.nextInt();
			
					for(Bank i : al)
					{
						if((i.getAccNo())==accNo)
						{
							System.out.println(i);
						}
					}
					System.out.println();
					break;
					
			case 5:System.out.println("----- All Account Details -----");
			
					for(Bank i : al)
					{
							System.out.println(i);
					}
					System.out.println();
					break;
					
			case 6:System.out.println("Enter account no. want to deposite money : ");
					accNo=scn.nextInt();
					for(Bank i : al)
					{
						if((i.getAccNo())==accNo)
						{
							System.out.println("Enter the amount want to deposit into your account : ");
							double deposit=scn.nextDouble();
							double d=i.getBalance()+deposit;
							i.setDeposit(deposit);
							i.setBalance(d);
						}
					}
					System.out.println("Money successfully deposited into account\n");
					break;
					
			case 7:System.out.println("Enter account no. want to withdraw money : ");
					accNo=scn.nextInt();
			
					for(Bank i : al)
					{
						if((i.getAccNo())==accNo)
						{
							System.out.println("Enter the amount want to withdraw from your account : ");
							double withdraw=scn.nextDouble();
							double d=i.getBalance()-withdraw;
							i.setWithdraw(withdraw);
							i.setBalance(d);
						}
					}
					System.out.println("Money successfully withdrawed from account\n");
					break;
			
			case 8:System.out.println("Exited Successfully");
					System.exit(0);
					
			
			default:System.out.println("Invalid choice");
				break;
			}
			
		}while(choice!=8);
		scn.close();

	}

}
