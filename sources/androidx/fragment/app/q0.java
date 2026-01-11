package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class q0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f1978a = "FragmentManager";

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f1979b = new StringBuilder(128);

    public final void a() {
        if (this.f1979b.length() > 0) {
            Log.d(this.f1978a, this.f1979b.toString());
            StringBuilder sb2 = this.f1979b;
            sb2.delete(0, sb2.length());
        }
    }

    public final void close() {
        a();
    }

    public final void flush() {
        a();
    }

    public final void write(char[] cArr, int i, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c10 = cArr[i + i11];
            if (c10 == 10) {
                a();
            } else {
                this.f1979b.append(c10);
            }
        }
    }
}
