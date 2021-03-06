package JavaLab01.transaction;

import java.time.LocalDateTime;

public class Transaction {
    protected int store_id;
    protected int transaction_id;
    protected LocalDateTime timestamp;
    protected int account_id;
    protected Double amount;
    protected TransactionType type;

    public Transaction(int store_id, int transaction_id, int account_id, Double amount) {
        this.store_id = store_id;
        this.transaction_id = transaction_id;
        this.timestamp = LocalDateTime.now();
        this.account_id = account_id;
        this.amount = amount;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
