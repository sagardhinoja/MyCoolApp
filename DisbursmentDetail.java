import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DisbursmentDetail {
	
	private MerchantAccount merchantAccount;
	private String eftId;
	private List<DisbursmentItem> details = new ArrayList<>();
	
	public DisbursmentDetail(MerchantAccount merchantAccount) {
		this.merchantAccount=merchantAccount;
	}
	
	 public BigDecimal getTotal() {
	        BigDecimal total = BigDecimal.ZERO;
	        for (DisbursmentItem item : details) {
	            total = total.add(item.getAmount());
	        }

	        return total;
	    }

}
