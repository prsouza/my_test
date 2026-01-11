package net.jpountz.xxhash;

import net.jpountz.xxhash.StreamingXXHash32;

final class StreamingXXHash32JNI extends StreamingXXHash32 {
    private long state;

    public static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JNI(i);
        }
    }

    public StreamingXXHash32JNI(int i) {
        super(i);
        this.state = XXHashJNI.XXH32_init(i);
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    public synchronized void close() {
        if (this.state != 0) {
            super.close();
            XXHashJNI.XXH32_free(this.state);
            this.state = 0;
        }
    }

    public synchronized void finalize() throws Throwable {
        super.finalize();
        long j10 = this.state;
        if (j10 != 0) {
            XXHashJNI.XXH32_free(j10);
            this.state = 0;
        }
    }

    public synchronized int getValue() {
        checkState();
        return XXHashJNI.XXH32_digest(this.state);
    }

    public synchronized void reset() {
        checkState();
        XXHashJNI.XXH32_free(this.state);
        this.state = XXHashJNI.XXH32_init(this.seed);
    }

    public synchronized void update(byte[] bArr, int i, int i10) {
        checkState();
        XXHashJNI.XXH32_update(this.state, bArr, i, i10);
    }
}
