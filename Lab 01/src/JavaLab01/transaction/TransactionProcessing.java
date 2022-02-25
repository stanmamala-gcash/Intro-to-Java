package JavaLab01.transaction;

import JavaLab01.transaction.type.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransactionProcessing {
    final private static Logger logger = Logger.getLogger(TransactionProcessing.class.getName());

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
        TransactionProcessing tPInit = TransactionProcessing.init();
        TransactionProcessing.showTransactions(tPInit);
        TransactionProcessing.showTransactionType(tPInit, TransactionType.MONEY_TRANSFER);
        TransactionProcessing.duplicateChecker(tPInit);
    }

    public static TransactionProcessing init() {
        TransactionProcessing tPInit = new TransactionProcessing();

        // Add 5 Money Transfer Objects
        MoneyTransfer moneyTransfer1 = new MoneyTransfer(1012, 11, 21422, 50.00, "Hayley Williams");
        tPInit.transactions.add(moneyTransfer1);

        MoneyTransfer moneyTransfer2 = new MoneyTransfer(1012, 11, 21422, 100.00, "Josh Farro");
        tPInit.transactions.add(moneyTransfer2);

        MoneyTransfer moneyTransfer3 = new MoneyTransfer(10123, 14, 21422, 150.00, "Zac Farro");
        tPInit.transactions.add(moneyTransfer3);

        MoneyTransfer moneyTransfer4 = new MoneyTransfer(1012, 14, 21422, 200.00, "Taylor York");
        tPInit.transactions.add(moneyTransfer4);

        MoneyTransfer moneyTransfer5 = new MoneyTransfer(1012, 15, 21422, 250.00, "Jeremy Davis");
        tPInit.transactions.add(moneyTransfer5);

        // Add 3 Bills Payment Objects
        Bills bills1 = new Bills(1012, 21, 21422, 1899.00, "Globe At Home", 1899.00);
        tPInit.transactions.add(bills1);

        Bills bills2 = new Bills(1012, 22, 21422, 2500.00, "Meralco", 2500.00);
        tPInit.transactions.add(bills2);

        Bills bills3 = new Bills(1012, 23, 21422, 1000.00, "Maynilad", 1000.00);
        tPInit.transactions.add(bills3);

        // Add 5 Buy Load Objects
        BuyLoad buyLoad1 = new BuyLoad(1012, 31, 21422, 100.00, "09xx xxx xxxx");
        tPInit.transactions.add(buyLoad1);

        BuyLoad buyLoad2 = new BuyLoad(1012, 32, 21422, 100.00, "09xx xxx xxxx");
        tPInit.transactions.add(buyLoad2);

        BuyLoad buyLoad3 = new BuyLoad(1012, 33, 21422, 100.00, "09xx xxx xxxx");
        tPInit.transactions.add(buyLoad3);

        BuyLoad buyLoad4 = new BuyLoad(1012, 34, 21422, 100.00, "09xx xxx xxxx");
        tPInit.transactions.add(buyLoad4);

        BuyLoad buyLoad5 = new BuyLoad(1012, 35, 21422, 100.00, "09xx xxx xxxx");
        tPInit.transactions.add(buyLoad5);

        // Add 2 Account Credits Objects
        AddAccountCredit addAccountCredit1 = new AddAccountCredit(1012, 41, 21422, 50.00, "09xx xxx xxxx");
        tPInit.transactions.add(addAccountCredit1);

        AddAccountCredit addAccountCredit2 = new AddAccountCredit(1012, 42, 21422, 25.00, "09xx xxx xxxx");
        tPInit.transactions.add(addAccountCredit2);

        // Add 5 Add Game Credits
        AddGameCredit addGameCredit1 = new AddGameCredit(1012, 51, 21422, 250.00, "Mobile Legends");
        tPInit.transactions.add(addGameCredit1);

        AddGameCredit addGameCredit2 = new AddGameCredit(1012, 52, 21422, 250.00, "Mobile Legends");
        tPInit.transactions.add(addGameCredit2);

        AddGameCredit addGameCredit3 = new AddGameCredit(1012, 53, 21422, 250.00, "Mobile Legends");
        tPInit.transactions.add(addGameCredit3);

        AddGameCredit addGameCredit4 = new AddGameCredit(1012, 54, 21422, 250.00, "Mobile Legends");
        tPInit.transactions.add(addGameCredit4);

        AddGameCredit addGameCredit5 = new AddGameCredit(1012, 55, 21422, 250.00, "Mobile Legends");
        tPInit.transactions.add(addGameCredit5);

        return tPInit;
    }

    public static void showTransactions(TransactionProcessing tPInit) {
        logger.log(Level.INFO, "SUMMARY OF TRANSACTIONS");
        for (int i = 0; i < tPInit.transactions.size(); i++) {
            logger.log(Level.INFO, tPInit.transactions.get(i)+ "");
        }
        logger.log(Level.INFO, " ");

    }

    public static void showTransactionType(TransactionProcessing tPInit, TransactionType transactionType) {
        logger.log(Level.INFO, "SUMMARY OF TRANSACTIONS OF TYPE " + transactionType);
        for (int i = 0; i < tPInit.transactions.size(); i++) {
            if (tPInit.transactions.get(i).getType() == transactionType)
                logger.log(Level.INFO, tPInit.transactions.get(i) + "");
        }
        logger.log(Level.INFO, "\n");
    }

    public static void duplicateChecker(TransactionProcessing tPInit) {
        ArrayList<Integer>  map = new ArrayList<>();
        ArrayList<Integer>  unique = new ArrayList<>();
        ArrayList<Integer>  duplicate = new ArrayList<>();

        for (int i = 0; i < tPInit.transactions.size(); i++) {
            if (!map.contains(tPInit.transactions.get(i).getTransaction_id()))
                map.add(tPInit.transactions.get(i).getTransaction_id());
            else if (!duplicate.contains(tPInit.transactions.get(i).getTransaction_id()))
                duplicate.add(tPInit.transactions.get(i).getTransaction_id());
        }
        for (int j = 0; j < tPInit.transactions.size(); j++) {
            if (!duplicate.contains(tPInit.transactions.get(j).getTransaction_id()))
                unique.add(tPInit.transactions.get(j).getTransaction_id());
        }


        logger.log(Level.INFO, "-----UNIQUE TRANSACTIONS-----");
        for (Integer integer : unique) {
            logger.log(Level.INFO, integer + "");
        }
        logger.log(Level.INFO, "\n");

        logger.log(Level.INFO, "-----DUPLICATE TRANSACTIONS-----");
        for (Integer integer : duplicate) {
            logger.log(Level.INFO, integer + "");
        }
        logger.log(Level.INFO, "\n");
    }
}
