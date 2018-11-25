import java.math.BigDecimal;

public class DisbursmentItem {
	
	private String transactionId;
	private String correctionId;
    private BigDecimal amount;
    private String description;

    public DisbursmentItem() {
    	
    }
    public DisbursmentItem(String transaction, BigDecimal amount) {
        this.transactionId = "";
        this.amount = amount;
    }
    public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCorrectionId() {
		return correctionId;
	}

	public void setCorrectionId(String correctionId) {
		this.correctionId = correctionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}
