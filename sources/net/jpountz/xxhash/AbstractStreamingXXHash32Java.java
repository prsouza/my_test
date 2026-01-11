package net.jpountz.xxhash;

abstract class AbstractStreamingXXHash32Java extends StreamingXXHash32 {
    public int memSize;
    public final byte[] memory = new byte[16];
    public long totalLen;

    /* renamed from: v1  reason: collision with root package name */
    public int f8996v1;

    /* renamed from: v2  reason: collision with root package name */
    public int f8997v2;

    /* renamed from: v3  reason: collision with root package name */
    public int f8998v3;

    /* renamed from: v4  reason: collision with root package name */
    public int f8999v4;

    public AbstractStreamingXXHash32Java(int i) {
        super(i);
        reset();
    }

    public void reset() {
        int i = this.seed;
        this.f8996v1 = i + XXHashConstants.PRIME1 + XXHashConstants.PRIME2;
        this.f8997v2 = XXHashConstants.PRIME2 + i;
        this.f8998v3 = i + 0;
        this.f8999v4 = i - XXHashConstants.PRIME1;
        this.totalLen = 0;
        this.memSize = 0;
    }
}
