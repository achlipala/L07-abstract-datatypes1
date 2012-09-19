package finished;

/** Ratnum is an immutable type representing rational numbers
 */
public class RatNum {
    private final int numer;
    private final int denom;

    /** Make a new Ratnum == n. */
    public RatNum(int n) {
        numer = n;
        denom = 1;
    }

    /**
     * Make a new RatNum == (n / d).
     * @param n numerator
     * @param d denominator
     * @throws ArithmeticException if d == 0
     */
    public RatNum(int n, int d) throws ArithmeticException {
        // reduce ratio to lowest terms
        int g = gcd(n, d);
        n = n / g;
        d = d / g;

        // make denominator positive
        if (d < 0) {
            numer = -n;
            denom = -d;
        } else {
            numer = n;
            denom = d;
        }
    }
    
    public RatNum multiply(RatNum n) {
    	return new RatNum(numer * n.numer, denom * n.denom);
    }

    /////////////////////////////////////////
    // other methods should go here
    //    producers: add(), subtract(), divide(), etc.
    //    observers: isPositive(), intValue(), etc.
    //    mutators: none

    
    /**
     * @return a string representation of this rational number
     */
    public String toString() {
        return (denom > 1) ? (numer + "/" + denom) : (numer + "");
    }

    // compute greatest common denominator of a and b
    private static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
