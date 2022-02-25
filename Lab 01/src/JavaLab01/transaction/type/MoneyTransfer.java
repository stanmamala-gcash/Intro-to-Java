package JavaLab01.transaction.type;

import JavaLab01.transaction.Transaction;
import JavaLab01.transaction.TransactionType;

public class MoneyTransfer extends Transaction {
    private String recipient;
    private String transType = "MONEY_TRANSFER";

    public MoneyTransfer(int store_id, int transaction_id, int account_id, Double amount, String recepient) {
        super(store_id, transaction_id, account_id, amount);
        this.recipient = recepient;
        setType(TransactionType.MONEY_TRANSFER);
    }

    public String getRecepient() {
        return recipient;
    }

    public void setRecepient(String recepient) {
        this.recipient = recepient;
    }

    public String getTransType() {
        return transType;
    }
}
