package androidx.appcompat.widget;

import net.jpountz.lz4.LZ4FrameOutputStream;

public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1406a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1407b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1408c = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

    /* renamed from: d  reason: collision with root package name */
    public int f1409d = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

    /* renamed from: e  reason: collision with root package name */
    public int f1410e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1411f = 0;
    public boolean g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1412h = false;

    public final void a(int i, int i10) {
        this.f1408c = i;
        this.f1409d = i10;
        this.f1412h = true;
        if (this.g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f1406a = i10;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1407b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1406a = i;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1407b = i10;
        }
    }
}
