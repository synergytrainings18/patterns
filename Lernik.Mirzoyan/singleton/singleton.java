public class Account {
	
	private Account(){}

	private static class AccountHolder {
		private static final Account account = new Account();
	}

	public static Account getInstance(){
		return AccountHolder.account;
	}

	private long amount = 0;
	
	public long getAmount(){
		return amount;
	}

	public void addAmount(long amount){
		this.amount += amount;
	}

	public void subtractAmount(long amount){
		this.amount -= amount;
	}
	
}
