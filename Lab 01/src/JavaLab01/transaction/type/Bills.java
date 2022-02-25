package JavaLab01.transaction.type;

import JavaLab01.transaction.Transaction;
import JavaLab01.transaction.TransactionType;

public class Bills extends Transaction {
    private String company_name;
    private Double bills_charge;

    public Bills(int store_id, int transaction_id, int account_id, Double amount, String company_name, Double bills_charge) {
        super(store_id, transaction_id, account_id, amount);
        this.company_name = company_name;
        this.bills_charge = bills_charge;
        setType(TransactionType.BILLS_PAYMENT);
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Double getBills_charge() {
        return bills_charge;
    }

    public void setBills_charge(Double bills_charge) {
        this.bills_charge = bills_charge;
    }
}
