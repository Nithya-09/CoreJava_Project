package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts = new LinkedList<Account>();
		
		String file ="C:\\Users\\new\\Downloads\\original.csv";
		List<String[]> newAccountHolders=utilities.CSV.read(file);
		
		for (String[] accountHolder:newAccountHolders) {
			String name = accountHolder[0];
			String ssN = accountHolder[1];
			String accountType = accountHolder[2];
			Double initDeposit = Double.parseDouble(accountHolder[3]);
			System.out.println(name+" "+ssN+" "+accountType+" $"+initDeposit);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,ssN,initDeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new Checking(name,ssN,initDeposit));
			}
			else {
				System.out.println("Error Reading account type");
			}
		}
		
		for (Account acc: accounts) {
			System.out.println("***********");
			acc.showInfo();
		}
		

	}

}
