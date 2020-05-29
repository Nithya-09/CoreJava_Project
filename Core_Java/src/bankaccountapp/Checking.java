package bankaccountapp;

public class Checking extends Account{
	//List properties specific to checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	
	
	//Constructor to initialize checking account properties
	public Checking (String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		acountNumber="1"+acountNumber;
		setDebitCard();
		}
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random()*Math.pow(10, 12));
		debitCardPin = (int) (Math.random()* Math.pow(10, 4));
	}
	
	//List any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Expenses"
				+ "\n Debit Card Number: "+debitCardNumber+
				"\n Debit Card Pin: "+debitCardPin);
	}
	@Override
	public void setRate() {
		rate= getBaseRate() *15;
		
	}
}
