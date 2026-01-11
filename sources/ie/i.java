package ie;

import java.util.NoSuchElementException;

public final class i extends NoSuchElementException {
    public i() {
        super("Channel was closed");
    }
}
