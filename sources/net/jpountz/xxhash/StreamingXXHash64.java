package net.jpountz.xxhash;

import java.io.Closeable;
import java.util.zip.Checksum;

public abstract class StreamingXXHash64 implements Closeable {
    public final long seed;

    public interface Factory {
        StreamingXXHash64 newStreamingHash(long j10);
    }

    public StreamingXXHash64(long j10) {
        this.seed = j10;
    }

    public final Checksum asChecksum() {
        return new Checksum() {
            public long getValue() {
                return StreamingXXHash64.this.getValue();
            }

            public void reset() {
                StreamingXXHash64.this.reset();
            }

            public String toString() {
                return StreamingXXHash64.this.toString();
            }

            public void update(int i) {
                StreamingXXHash64.this.update(new byte[]{(byte) i}, 0, 1);
            }

            public void update(byte[] bArr, int i, int i10) {
                StreamingXXHash64.this.update(bArr, i, i10);
            }
        };
    }

    public void close() {
    }

    public abstract long getValue();

    public abstract void reset();

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    public abstract void update(byte[] bArr, int i, int i10);
}
