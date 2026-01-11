package fe;

import e6.e;
import java.util.NoSuchElementException;

public class p extends o {
    public static final char E1(CharSequence charSequence) {
        e.D(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        } else if (length == 1) {
            return charSequence.charAt(0);
        } else {
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
    }
}
