package i4;

import android.support.v4.media.b;
import h4.e;

public abstract class a extends e {

    /* renamed from: c  reason: collision with root package name */
    public static final int f6178c = ((e.a.WRITE_NUMBERS_AS_STRINGS.getMask() | e.a.ESCAPE_NON_ASCII.getMask()) | e.a.STRICT_DUPLICATE_DETECTION.getMask());

    /* renamed from: a  reason: collision with root package name */
    public b f6179a;

    /* renamed from: b  reason: collision with root package name */
    public int f6180b;

    public a(int i, b bVar) {
        this.f6180b = i;
        this.f6179a = bVar;
        e.a.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    public final boolean s(e.a aVar) {
        return (aVar.getMask() & this.f6180b) != 0;
    }
}
