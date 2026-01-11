package net.jpountz.xxhash;

abstract class AbstractStreamingXXHash64Java extends StreamingXXHash64 {
    public int memSize;
    public final byte[] memory = new byte[32];
    public long totalLen;

    /* renamed from: v1  reason: collision with root package name */
    public long f9000v1;

    /* renamed from: v2  reason: collision with root package name */
    public long f9001v2;

    /* renamed from: v3  reason: collision with root package name */
    public long f9002v3;

    /* renamed from: v4  reason: collision with root package name */
    public long f9003v4;

    public AbstractStreamingXXHash64Java(long j10) {
        super(j10);
        reset();
    }

    public void reset() {
        long j10 = this.seed;
        this.f9000v1 = j10 + XXHashConstants.PRIME64_1 + XXHashConstants.PRIME64_2;
        this.f9001v2 = XXHashConstants.PRIME64_2 + j10;
        this.f9002v3 = j10 + 0;
        this.f9003v4 = j10 - XXHashConstants.PRIME64_1;
        this.totalLen = 0;
        this.memSize = 0;
    }
}
