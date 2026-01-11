package n4;

import com.github.mikephil.charting.BuildConfig;
import java.util.ArrayList;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final a f8913a;

    /* renamed from: b  reason: collision with root package name */
    public int f8914b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<char[]> f8915c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8916d;

    /* renamed from: e  reason: collision with root package name */
    public int f8917e;

    /* renamed from: f  reason: collision with root package name */
    public char[] f8918f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public String f8919h;

    public f(a aVar) {
        this.f8913a = aVar;
    }

    public final void a() {
        this.f8916d = false;
        this.f8915c.clear();
        this.f8917e = 0;
        this.g = 0;
    }

    public final String b() {
        if (this.f8919h == null) {
            int i = this.f8914b;
            String str = BuildConfig.FLAVOR;
            if (i >= 0) {
                this.f8919h = str;
                return str;
            }
            int i10 = this.f8917e;
            int i11 = this.g;
            if (i10 == 0) {
                if (i11 != 0) {
                    str = new String(this.f8918f, 0, i11);
                }
                this.f8919h = str;
            } else {
                StringBuilder sb2 = new StringBuilder(i10 + i11);
                ArrayList<char[]> arrayList = this.f8915c;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        char[] cArr = this.f8915c.get(i12);
                        sb2.append(cArr, 0, cArr.length);
                    }
                }
                sb2.append(this.f8918f, 0, this.g);
                this.f8919h = sb2.toString();
            }
        }
        return this.f8919h;
    }

    public final char[] c() {
        char[] cArr;
        this.f8914b = -1;
        this.g = 0;
        this.f8919h = null;
        if (this.f8916d) {
            a();
        }
        char[] cArr2 = this.f8918f;
        if (cArr2 != null) {
            return cArr2;
        }
        a aVar = this.f8913a;
        if (aVar != null) {
            cArr = aVar.b(2);
        } else {
            cArr = new char[Math.max(0, 500)];
        }
        char[] cArr3 = cArr;
        this.f8918f = cArr3;
        return cArr3;
    }

    public final char[] d() {
        if (this.f8915c == null) {
            this.f8915c = new ArrayList<>();
        }
        this.f8916d = true;
        this.f8915c.add(this.f8918f);
        int length = this.f8918f.length;
        this.f8917e += length;
        this.g = 0;
        int i = length + (length >> 1);
        if (i < 500) {
            i = 500;
        } else if (i > 65536) {
            i = 65536;
        }
        char[] cArr = new char[i];
        this.f8918f = cArr;
        return cArr;
    }

    public final void e() {
        this.f8914b = -1;
        this.g = 0;
        this.f8919h = null;
        if (this.f8916d) {
            a();
        }
    }

    public final String f(int i) {
        String str;
        this.g = i;
        if (this.f8917e > 0) {
            return b();
        }
        if (i == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            str = new String(this.f8918f, 0, i);
        }
        this.f8919h = str;
        return str;
    }

    public final String toString() {
        return b();
    }
}
