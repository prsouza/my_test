package o6;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

public abstract class u implements Closeable {
    public abstract long a();

    public abstract InputStream c(long j10, long j11) throws IOException;
}
