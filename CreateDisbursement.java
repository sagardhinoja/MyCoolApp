import java.util.ArrayList;
import java.util.List;

public class CreateDisbursement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Transaction> transaction = new ArrayList<>();
		transaction.add(new Transaction("1296cab5-59ac-412a-879a-5f9d725f4a7a ",50.55));
		transaction.add(new Transaction("e71f0552-f143-4883-966e-fe7eb6f2827b",50.55));
		transaction.add(new Transaction("8825bbb2-266c-4afa-b3b0-00949ca5a918",50.55));
		transaction.add(new Transaction("99d50c2a-5dee-48f9-adcb-1fe4dd113dcc",50.55));
		transaction.add(new Transaction("3142e4f6-804e-4667-a9c7-a6e4baeb40c2",50.55));
		transaction.add(new Transaction("b2dc31ac-73f2-4d20-a010-5af6485da4b5",50.55));
		transaction.add(new Transaction("86153d84-ba82-42d5-8942-43daf822e08f",50.55));
		transaction.add(new Transaction("d57f5160-f7aa-4178-96c9-d0236ff34eb9",50.55));
		transaction.add(new Transaction("ab11a4fa-6b95-4fd3-b038-9df17c0d0a83",50.55));
		transaction.add(new Transaction("f7af1d7a-2759-4b24-a0f6-563a4886077a",50.55));
		
		MerchantAccount feeAccount = new MerchantAccount("feeId","merchantId");
		
		DisbursmentBatch batch=new DisbursmentBatch(feeAccount,transaction);
	}

}
