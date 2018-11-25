import java.math.BigDecimal;

public class Transaction {
	
	private double amount;
	private String id;
	
	public Transaction(String id,double amount) {
		this.amount=amount;
		this.id=id;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
