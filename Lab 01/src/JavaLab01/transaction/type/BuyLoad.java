package JavaLab01.transaction.type;

import JavaLab01.transaction.Transaction;
import JavaLab01.transaction.TransactionType;

public class BuyLoad extends Transaction {
    private String msisdn;

    public BuyLoad(int store_id, int transaction_id, int account_id, Double amount, String msisdn) {
        super(store_id, transaction_id, account_id, amount);
        this.msisdn = msisdn;
        setType(TransactionType.BUY_LOAD);
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
