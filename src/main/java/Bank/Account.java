package Bank;



import java.util.Date;

public class Account {
	private double balance;
	private String ownerName;
	private String address;
	private Date createDate;
	private String Status;

	public Account(double balance, String ownerName, String address, Date createDate, String status) {
		super();
		this.balance = balance;
		this.ownerName = ownerName;
		this.address = address;
		this.createDate = createDate;
		this.Status = status;
	}

	public double getbalance() {
		return balance;

	}

	public double setbalance() {
		return balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void getAddress(String address) {
		this.address = address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public void deposit(double depositAmount) {

		if (depositAmount > 0)
			System.out.println(balance = balance + depositAmount);
	}

	public void withdrawal(double withdrawAmount) {

		if (balance >= withdrawAmount) {
			System.out.println(balance = balance - withdrawAmount);
		} else {
			System.out.println("Insufficient Balance.Transaction Failed.");
		}
	}

}
