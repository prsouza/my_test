package uf;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface z extends Closeable, Flushable {
    void H(e eVar, long j10) throws IOException;

    void close() throws IOException;

    c0 d();

    void flush() throws IOException;
}
