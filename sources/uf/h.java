package uf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface h extends b0, ReadableByteChannel {
    long C(z zVar) throws IOException;

    String F() throws IOException;

    boolean J() throws IOException;

    byte[] L(long j10) throws IOException;

    String W(long j10) throws IOException;

    e b();

    long d0(i iVar) throws IOException;

    void i0(long j10) throws IOException;

    int l(r rVar) throws IOException;

    i p(long j10) throws IOException;

    long q0() throws IOException;

    String r0(Charset charset) throws IOException;

    byte readByte() throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    InputStream s0();

    void skip(long j10) throws IOException;

    boolean v(long j10) throws IOException;
}
