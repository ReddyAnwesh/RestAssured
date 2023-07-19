
public class Bank {
	
	static int currentbalance =1000;
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.greetings();
		deposit(3000);
		
		bank.withdraw(1000);
		bank.getCurrentbalance();
		
		int i = 9;
		int k = --i;
		int j = i++;
		
		System.out.println(k);
		String str = "gh";
		
	
		
		
	}
	
	
	
	
	public void greetings() {
		System.out.println("welcome to the bank");
	}
	
	public static void deposit(int depositedAmount) {
		currentbalance = currentbalance + depositedAmount;
		System.out.println(currentbalance);
		
	}
	
	public void withdraw(int withDrawnAmount) {
		
		currentbalance = currentbalance - withDrawnAmount;
		System.out.println(currentbalance);
		
	}
	
	
	public int getCurrentbalance() {
		
		
		System.out.println(currentbalance);
		return currentbalance;
		
	}
	
	
	

}
