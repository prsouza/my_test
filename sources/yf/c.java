package yf;

import android.support.v4.media.a;
import java.io.IOException;
import java.io.Writer;

public abstract class c extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13634b;

    public /* synthetic */ c(int i) {
        this.f13634b = i;
    }

    public final int a(CharSequence charSequence, int i, Writer writer) {
        switch (this.f13634b) {
            case 0:
                return c(Character.codePointAt(charSequence, i), writer) ? 1 : 0;
            default:
                if (i != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    Class<?> cls = getClass();
                    throw new IllegalArgumentException(a.e(sb2, cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName(), ".translate(final CharSequence input, final int index, final Writer out) can not handle a non-zero index."));
                }
                d(charSequence, writer);
                return Character.codePointCount(charSequence, i, charSequence.length());
        }
    }

    public abstract boolean c(int i, Writer writer) throws IOException;

    public abstract void d(CharSequence charSequence, Writer writer) throws IOException;
}
