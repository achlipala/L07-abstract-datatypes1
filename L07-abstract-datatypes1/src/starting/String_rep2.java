package starting;

/** String represents an immutable sequence of characters. */
public class String_rep2 {
    private char[] a;
    private int offset;
    private int count;

    /** Get the character at a particular position.
     * @param i character position
     * @return character at position i
     * @throws IndexOutOfBoundsException if i is larger than the string length */
    public char charAt(int i) throws IndexOutOfBoundsException {
    	if (i >= count)
    		throw new IndexOutOfBoundsException();
    	
    	return a[offset + i];
    }

    /** Get the substring between start and end, exclusive.
     * @param start starting index
     * @param end ending index; requires start <= end
     * @return string consisting of charAt(start)...charAt(end-1)
     */
    public String_rep2 substring (int start, int end) {
        String_rep2 s = new String_rep2();
        s.a = this.a;
        s.offset = this.offset + start;
        s.count = end - start;
        return s;
    }
    
    // Private constructor for the use of producer methods like substring()
    private String_rep2() {}

}
