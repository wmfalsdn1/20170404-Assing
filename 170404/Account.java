package remind;

public class Account {
	private String owner;
	private long balance;
	private long ammount;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getBalance() {
		return this.balance;
	}
	
	public Account() {	
		
	}
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
		public long deposit(long amount){
		return balance = balance + amount;
	}
		
	public long withdraw(long amount){
		return balance = balance - amount;
	}
	
	public static void main(String[] args){
		Account a1 = new Account("김김김",5000);
		a1.deposit(70000);
		a1.deposit(50000);
		a1.withdraw(13000);
		a1.withdraw(21000);
		System.out.println(a1.getBalance());
	}


