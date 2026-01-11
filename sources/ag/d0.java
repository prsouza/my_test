package ag;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public final class d0 extends o {

    /* renamed from: b  reason: collision with root package name */
    public final int f382b;

    /* renamed from: c  reason: collision with root package name */
    public final o[] f383c;

    public class a implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        public int f384a = 0;

        public a() {
        }

        public final boolean hasMoreElements() {
            return this.f384a < d0.this.f383c.length;
        }

        public final Object nextElement() {
            o[] oVarArr = d0.this.f383c;
            int i = this.f384a;
            this.f384a = i + 1;
            return oVarArr[i];
        }
    }

    public d0(byte[] bArr) {
        super(bArr);
        this.f383c = null;
        this.f382b = 1000;
    }

    public final void k(q qVar, boolean z) throws IOException {
        Enumeration t10 = t();
        if (z) {
            qVar.d(36);
        }
        qVar.d(128);
        qVar.f(t10);
        qVar.d(0);
        qVar.d(0);
    }

    public final int l() throws IOException {
        Enumeration t10 = t();
        int i = 0;
        while (t10.hasMoreElements()) {
            i += ((d) t10.nextElement()).d().l();
        }
        return i + 2 + 2;
    }

    public final boolean o() {
        return true;
    }

    public final Enumeration t() {
        if (this.f383c != null) {
            return new a();
        }
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.f430a;
            if (i >= bArr.length) {
                return vector.elements();
            }
            int min = Math.min(bArr.length, this.f382b + i) - i;
            byte[] bArr2 = new byte[min];
            System.arraycopy(this.f430a, i, bArr2, 0, min);
            vector.addElement(new w0(bArr2));
            i += this.f382b;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d0(ag.o[] r4) {
        /*
            r3 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r4.length
            if (r1 == r2) goto L_0x004e
            r2 = r4[r1]     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            ag.w0 r2 = (ag.w0) r2     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            byte[] r2 = r2.f430a     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            r0.write(r2)     // Catch:{ ClassCastException -> 0x002d, IOException -> 0x0015 }
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0015:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "exception converting octets "
            java.lang.StringBuilder r1 = a.a.d(r1)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x002d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r4 = r4[r1]
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = " found in input should only contain DEROctetString"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r0.<init>(r4)
            throw r0
        L_0x004e:
            byte[] r0 = r0.toByteArray()
            r3.<init>(r0)
            r3.f383c = r4
            r4 = 1000(0x3e8, float:1.401E-42)
            r3.f382b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.d0.<init>(ag.o[]):void");
    }
}
