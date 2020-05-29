package bankaccountapp;

public class Savings extends Account {
	//List properties specific to Savings account
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
		//Constructor to initialize Saving account properties
		public Savings(String name,String sSN,double initDeposit) {
			super(name,sSN,initDeposit);
			acountNumber="2"+acountNumber;
			setSafetyDepositBox();
		}
		
		private void setSafetyDepositBox() {
			safetyDepositBoxId =(int) (Math.random() * Math.pow(10, 3));
			safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		}
		@Override
		public void setRate() {
			rate = getBaseRate() - .25;
		}
		//List any methods specific to Saving account
		public void showInfo() {
			super.showInfo();
			System.out.println("Your Saving Account Expenses"
					+ "\n Safety Deposit Box ID: "+safetyDepositBoxId+
					"\n Safety Deposit Box Key: "+safetyDepositBoxKey);
		}

		
}
