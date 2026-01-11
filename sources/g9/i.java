package g9;

import java.io.Writer;

public final class i {

    public static final class a extends Writer {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f5307a;

        /* renamed from: b  reason: collision with root package name */
        public final C0087a f5308b = new C0087a();

        /* renamed from: g9.i$a$a  reason: collision with other inner class name */
        public static class C0087a implements CharSequence {

            /* renamed from: a  reason: collision with root package name */
            public char[] f5309a;

            public final char charAt(int i) {
                return this.f5309a[i];
            }

            public final int length() {
                return this.f5309a.length;
            }

            public final CharSequence subSequence(int i, int i10) {
                return new String(this.f5309a, i, i10 - i);
            }
        }

        public a(Appendable appendable) {
            this.f5307a = appendable;
        }

        public final void close() {
        }

        public final void flush() {
        }

        public final void write(int i) {
            this.f5307a.append((char) i);
        }

        public final void write(char[] cArr, int i, int i10) {
            C0087a aVar = this.f5308b;
            aVar.f5309a = cArr;
            this.f5307a.append(aVar, i, i10 + i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [p9.o$b0, i2.z<i2.p>] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        throw new i2.q((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        throw new i2.x((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        return i2.r.f6004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        throw new i2.x((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        throw new i2.x((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001b A[ExcHandler: d (r2v4 'e' aa.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000d A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i2.p a(aa.a r2) {
        /*
            r2.A0()     // Catch:{ EOFException -> 0x0022, d -> 0x001b, IOException -> 0x0014, NumberFormatException -> 0x000d }
            r0 = 0
            i2.z<i2.p> r1 = p9.o.C     // Catch:{ EOFException -> 0x000b, d -> 0x001b, IOException -> 0x0014, NumberFormatException -> 0x000d }
            i2.p r2 = r1.read(r2)     // Catch:{ EOFException -> 0x000b, d -> 0x001b, IOException -> 0x0014, NumberFormatException -> 0x000d }
            return r2
        L_0x000b:
            r2 = move-exception
            goto L_0x0024
        L_0x000d:
            r2 = move-exception
            i2.x r0 = new i2.x
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0014:
            r2 = move-exception
            i2.q r0 = new i2.q
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001b:
            r2 = move-exception
            i2.x r0 = new i2.x
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0022:
            r2 = move-exception
            r0 = 1
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            i2.r r2 = i2.r.f6004a
            return r2
        L_0x0029:
            i2.x r0 = new i2.x
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.i.a(aa.a):i2.p");
    }
}
