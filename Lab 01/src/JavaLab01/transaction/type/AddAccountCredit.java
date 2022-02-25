package JavaLab01.transaction.type;

import JavaLab01.transaction.Transaction;
import JavaLab01.transaction.TransactionType;

public class AddAccountCredit extends Transaction {
    private String msisdn;


    public AddAccountCredit(int store_id, int transaction_id, int account_id, Double amount, String msisdn) {
        super(store_id, transaction_id, account_id, amount);
        this.msisdn =  msisdn;
        setType(TransactionType.ADD_ACCOUNT_CREDITS);
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
