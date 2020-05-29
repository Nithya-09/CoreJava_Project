package bankaccountapp;

public interface IBaseRate {
	//methods that returns the BaseRate
	default double getBaseRate() {
		return 2.5;
	}
	
}
