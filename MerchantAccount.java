
public class MerchantAccount {

	public String feeId;
	public String trasnactionMerchantId;
	
	public MerchantAccount(String feeId,String trasnactionMerchantId) {
		this.feeId=feeId;
		this.trasnactionMerchantId=trasnactionMerchantId;
	}

	public String getFeeId() {
		return feeId;
	}

	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}

	public String getTrasnactionMerchantId() {
		return trasnactionMerchantId;
	}

	public void setTrasnactionMerchantId(String trasnactionMerchantId) {
		this.trasnactionMerchantId = trasnactionMerchantId;
	}
	
	
}
