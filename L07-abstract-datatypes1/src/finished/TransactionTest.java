package finished;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class TransactionTest {

	@Test
	public void observerCopies() {
		Transaction t = new Transaction(18, new GregorianCalendar());
		Calendar original = t.getDate();
		String originalString = original.toString();
		original.add(Calendar.MONTH, 1);
		Calendar another = t.getDate();
		String anotherString = another.toString();
		assertEquals(originalString, anotherString);
	}
	
	@Test
	public void creatorCopies() {
		Calendar c = new GregorianCalendar();
		Transaction t = new Transaction(18, c);
		String originalString = t.getDate().toString();
		c.add(Calendar.MONTH, 1);
		String anotherString = t.getDate().toString();
		assertEquals(originalString, anotherString);
	}

}
