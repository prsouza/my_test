package h4;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public abstract class e implements Closeable, Flushable {

    public enum a {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private a(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
        }

        public static int collectDefaults() {
            int i = 0;
            for (a aVar : values()) {
                if (aVar.enabledByDefault()) {
                    i |= aVar.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public final void a(String str) throws d {
        throw new d(str, this);
    }

    public final void c(int i, int i10) {
        if (i10 + 0 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", new Object[]{0, Integer.valueOf(i10), Integer.valueOf(i)}));
        }
    }

    public final void e(byte[] bArr) throws IOException {
        a aVar = b.f5814a;
        f(bArr, 0, bArr.length);
    }

    public abstract void f(byte[] bArr, int i, int i10) throws IOException;
}
