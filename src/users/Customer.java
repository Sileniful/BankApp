package users;

public class Customer extends Person {

	private int withdraw;
	private int deposit;
	
	public Customer(){
		
	}

	public Customer(String name, String surname, Address address, int ID,
			String dateOfBirth, int withdraw, int deposit) {
		super(name, surname, address, ID, dateOfBirth);
		this.withdraw = withdraw;
		this.deposit = deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	
	
}