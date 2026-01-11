package md;

import e6.e;
import net.jpountz.lz4.LZ4FrameOutputStream;

public final class l implements Comparable<l> {

    /* renamed from: a  reason: collision with root package name */
    public final int f8554a;

    public /* synthetic */ l(int i) {
        this.f8554a = i;
    }

    public final int compareTo(Object obj) {
        return e.F(this.f8554a ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK, ((l) obj).f8554a ^ LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
    }

    public final boolean equals(Object obj) {
        int i = this.f8554a;
        if ((obj instanceof l) && i == ((l) obj).f8554a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8554a;
    }

    public final String toString() {
        return String.valueOf(((long) this.f8554a) & 4294967295L);
    }
}
