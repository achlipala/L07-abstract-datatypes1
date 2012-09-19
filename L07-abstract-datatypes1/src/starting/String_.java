package starting;

/** String represents an immutable sequence of characters. */
public class String_ {

	private char[] a;
	
    //////////////////////////////////////////////
    // examples of creator methods
    
    /** Make an empty String. */
    public String_ () {
    	a = new char[0];
    }

    /** Make a String representing an integer, e.g. valueOf(35) -> "35". */
    public static String_ valueOf(int x) {
    	String s = Integer.toString(x);
    	String_ s_ = new String_();
    	
    	s_.a = new char[s.length()];
    	for (int i = 0; i < s.length(); ++i) {
    		s_.a[i] = s.charAt(i);
    	}
    	
    	return s_;
    }
    
    //////////////////////////////////////////////
    // examples of observer methods
    
    /** Get length of the string.
     * @return the number of characters in this string */
    public int length() {
    	return a.length;
    }

    /** Get the character at an index.
     * @param i index into the string, starting from 0
     * @return character at the ith position in the string
     * @throws IndexOutOfBoundsException if i not in [0,length) */
    public char charAt(int i) throws IndexOutOfBoundsException {
    	return a[i];
    }
    
    //////////////////////////////////////////////
    // no mutator methods
    //     (because this is an immutable type)
    


    //////////////////////////////////////////////
    // examples of producer methods

    /** Concatenate two strings.
     * @param s string to append to this
     * @return string consisting of this followed by s
     */
    public String_ concat (String_ s) {
    	String_ cat = new String_();
    	cat.a = new char[a.length + s.a.length];

    	System.arraycopy(a, 0, cat.a, 0, a.length);
    	System.arraycopy(s.a, 0, cat.a, a.length, s.a.length);
    	return cat;
    }
    

    /** Get the substring between start and end, exclusive.
     * @param start starting index
     * @param end ending index; requires start <= end
     * @return string consisting of charAt(start)...charAt(end-1)
     */
    public String_ substring (int start, int end) {
        String_ s = new String_();
        s.a = new char[end - start];
        System.arraycopy(this.a, start, s.a, 0, end - start);
        return s;
    }

    /** Return the character in the string with the highest ASCII code.
     * @return that character, or 0 for an empty string
     */
    public char maxChar () {
    	char ch = 0;
	    	
    	for (int i = 0; i < a.length; ++i) {
    		if (a[i] > ch)
    			ch = a[i];
    	}
    	
    	return ch;
    }
    
}
