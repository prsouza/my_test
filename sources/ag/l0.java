package ag;

import a.a;
import java.io.IOException;
import java.io.InputStream;

public final class l0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final x f419a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f420b = true;

    /* renamed from: c  reason: collision with root package name */
    public InputStream f421c;

    public l0(x xVar) {
        this.f419a = xVar;
    }

    public final p a() throws IOException {
        d a10 = this.f419a.a();
        if (a10 == null) {
            return null;
        }
        if (a10 instanceof p) {
            return (p) a10;
        }
        StringBuilder d10 = a.d("unknown object encountered: ");
        d10.append(a10.getClass());
        throw new IOException(d10.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() throws java.io.IOException {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f421c
            r1 = -1
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3.f420b
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            ag.p r0 = r3.a()
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            r2 = 0
            r3.f420b = r2
            goto L_0x0028
        L_0x0015:
            java.io.InputStream r0 = r3.f421c
            int r0 = r0.read()
            if (r0 < 0) goto L_0x001e
            return r0
        L_0x001e:
            ag.p r0 = r3.a()
            if (r0 != 0) goto L_0x0028
            r0 = 0
            r3.f421c = r0
            return r1
        L_0x0028:
            java.io.InputStream r0 = r0.b()
            r3.f421c = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.l0.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a A[EDGE_INSN: B:20:0x002a->B:15:0x002a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0029 A[SYNTHETIC] */
    public final int read(byte[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f421c
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.f420b
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            ag.p r0 = r5.a()
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x0012:
            r5.f420b = r1
        L_0x0014:
            java.io.InputStream r0 = r0.b()
            r5.f421c = r0
        L_0x001a:
            java.io.InputStream r0 = r5.f421c
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002a
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001a
            return r1
        L_0x002a:
            ag.p r0 = r5.a()
            if (r0 != 0) goto L_0x0014
            r6 = 0
            r5.f421c = r6
            r6 = 1
            if (r1 >= r6) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.l0.read(byte[], int, int):int");
    }
}
