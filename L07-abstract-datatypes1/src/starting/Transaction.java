package starting;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Transaction is an immutable object representing a bank transaction.
 */
// This class has three different kinds of rep exposure -- what are they,
// and how can they be fixed?
public class Transaction {
    public int amount;
    public Calendar date;

    /**
     * ...
     * @param date Date of transaction.  Caller must never mutate date again!
     */
    public Transaction(int amount, Calendar date) {
        this.amount = amount;
        this.date = date;
    }

}
