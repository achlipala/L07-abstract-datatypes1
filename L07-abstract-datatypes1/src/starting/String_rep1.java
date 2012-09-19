package starting;

/** String represents an immutable sequence of characters. */
public class String_rep1 {
    private char[] a;

    
    /** Get the character at a particular position.
     * @param i character position
     * @return character at position i
     * @throws IndexOutOfBoundsException if i is larger than the string length */
    public char charAt(int i) throws IndexOutOfBoundsException {
    	return a[i];
    }

    /** Get the substring between start and end, exclusive.
     * @param start starting index
     * @param end ending index; requires start <= end
     * @return string consisting of charAt(start)...charAt(end-1)
     */
    public String_rep1 substring (int start, int end) {
        String_rep1 s = new String_rep1();
        s.a = new char[end - start];
        System.arraycopy(this.a, start, s.a, 0, end - start);
        return s;
    }
    
    // Private constructor for the use of producer methods like substring()
    private String_rep1() {}

}
