package finished;

import static org.junit.Assert.*;

import org.junit.Test;

public class String_Test {

	private static void equalsString(String_ s_, String s) {
		assertEquals(s.length(), s_.length());
		
		for (int i = 0; i < s.length(); ++i) {
			assertEquals(s.charAt(i), s_.charAt(i));
		}
	}
	
	@Test
	public void basics() {
		String_ s = String_.valueOf(17);
		equalsString(s, "17");
		
		String_ t = String_.valueOf(246);
		String_ u = s.concat(t);
		equalsString(u, "17246");
		
		equalsString(u.substring(1, 3), "72");
	}
	
	@Test
	public void maxChar() {
		String_ s = String_.valueOf(1723);
		assertEquals(s.maxChar(), '7');
		assertEquals(s.maxCharFast(), '7');
		assertEquals(s.maxCharFast(), '7');
	}

}
