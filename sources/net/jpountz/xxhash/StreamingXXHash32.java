package net.jpountz.xxhash;

import androidx.activity.result.d;
import java.io.Closeable;
import java.util.zip.Checksum;

public abstract class StreamingXXHash32 implements Closeable {
    public final int seed;

    public interface Factory {
        StreamingXXHash32 newStreamingHash(int i);
    }

    public StreamingXXHash32(int i) {
        this.seed = i;
    }

    public final Checksum asChecksum() {
        return new Checksum() {
            public long getValue() {
                return ((long) StreamingXXHash32.this.getValue()) & 268435455;
            }

            public void reset() {
                StreamingXXHash32.this.reset();
            }

            public String toString() {
                return StreamingXXHash32.this.toString();
            }

            public void update(int i) {
                StreamingXXHash32.this.update(new byte[]{(byte) i}, 0, 1);
            }

            public void update(byte[] bArr, int i, int i10) {
                StreamingXXHash32.this.update(bArr, i, i10);
            }
        };
    }

    public void close() {
    }

    public abstract int getValue();

    public abstract void reset();

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(seed=");
        return d.c(sb2, this.seed, ")");
    }

    public abstract void update(byte[] bArr, int i, int i10);
}
