package net.jpountz.xxhash;

import net.jpountz.xxhash.StreamingXXHash64;

final class StreamingXXHash64JNI extends StreamingXXHash64 {
    private long state;

    public static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        public StreamingXXHash64 newStreamingHash(long j10) {
            return new StreamingXXHash64JNI(j10);
        }
    }

    public StreamingXXHash64JNI(long j10) {
        super(j10);
        this.state = XXHashJNI.XXH64_init(j10);
    }

    private void checkState() {
        if (this.state == 0) {
            throw new AssertionError("Already finalized");
        }
    }

    public synchronized void close() {
        if (this.state != 0) {
            super.close();
            XXHashJNI.XXH64_free(this.state);
            this.state = 0;
        }
    }

    public synchronized void finalize() throws Throwable {
        super.finalize();
        long j10 = this.state;
        if (j10 != 0) {
            XXHashJNI.XXH64_free(j10);
            this.state = 0;
        }
    }

    public synchronized long getValue() {
        checkState();
        return XXHashJNI.XXH64_digest(this.state);
    }

    public synchronized void reset() {
        checkState();
        XXHashJNI.XXH64_free(this.state);
        this.state = XXHashJNI.XXH64_init(this.seed);
    }

    public synchronized void update(byte[] bArr, int i, int i10) {
        checkState();
        XXHashJNI.XXH64_update(this.state, bArr, i, i10);
    }
}
