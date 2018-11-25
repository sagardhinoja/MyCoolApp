import java.util.HashMap;
import java.util.List;

public class DisbursmentBatch {

	private String id;
	private HashMap<String, DisbursmentDetail> desursementDetail = new HashMap<>();
	private DisbursmentDetail feeDisbursement;
	
	public DisbursmentBatch(MerchantAccount ma,List<Transaction> t) {
		feeDisbursement = new DisbursmentDetail(ma);
		
		
	}
		
}
