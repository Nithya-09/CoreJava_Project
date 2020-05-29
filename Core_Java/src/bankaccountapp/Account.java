package bankaccountapp;

public abstract class Account implements IBaseRate{
	//List common properties to both Account and Savings
	private String name;
	private String sSN;
	private double balance;
	private static int index=1000;
	protected String acountNumber;
	protected double rate;
	//Constructor to set base properties and initialize account
	public Account(String name,String sSN,double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		index ++;
		this.acountNumber = setAccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber =(int) (Math.random()* Math.pow(10, 3));
				return lastTwoSSN+uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance *(rate/100);
		balance = accruedInterest + balance;
		System.out.println("Accrued Interest is $"+accruedInterest);
		printBalance();
	}
	
	//List common methods
	public void deposit(double amount) {
		balance = balance +amount;
		System.out.println("Depositing $ "+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $ "+amount);
		printBalance();
	}
	
	public void transfer (double amount, String toWhere) {
		balance = balance - amount;
		System.out.println("Transfering $ "+amount+" to "+toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your Balance is now $"+balance);
	}
	
	public void showInfo() {
		System.out.println(
				"Name: "+name+"\nACCOUNT NUMBER: "+acountNumber+"\nBALANCE: "+balance+
				"\nRATE: "+rate+ "%"
				);
	}
	
}
