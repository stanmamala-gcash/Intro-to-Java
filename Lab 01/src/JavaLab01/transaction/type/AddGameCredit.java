package JavaLab01.transaction.type;

import JavaLab01.transaction.Transaction;
import JavaLab01.transaction.TransactionType;

public class AddGameCredit extends Transaction {
    private String company_name;

    public AddGameCredit(int store_id, int transaction_id, int account_id, Double amount, String company_name) {
        super(store_id, transaction_id, account_id, amount);
        this.company_name = company_name;
        setType(TransactionType.ADD_GAME_CREDITS);
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}
