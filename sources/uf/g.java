package uf;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface g extends z, WritableByteChannel {
    g A(int i) throws IOException;

    g K(int i) throws IOException;

    g Q(byte[] bArr) throws IOException;

    e b();

    g e0(i iVar) throws IOException;

    void flush() throws IOException;

    g g(byte[] bArr, int i, int i10) throws IOException;

    g j0(String str) throws IOException;

    g l0(long j10) throws IOException;

    g n(long j10) throws IOException;

    g u(int i) throws IOException;
}
