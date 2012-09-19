package finished;

import java.util.Calendar;

/**
 * Transaction is an immutable object representing a bank transaction.
 */
public class Transaction {
    private final int amount;
    private final Calendar date;

    /**
     * @param amount Amount of money
     * @param date Date of transaction.
     */
    public Transaction(int amount, Calendar date) {
        this.amount = amount;
        this.date = (Calendar)date.clone();
    }
    
    public int getAmount() {
        return amount;
    }
    
    public Calendar getDate() {
        return (Calendar)date.clone();
    }

}
