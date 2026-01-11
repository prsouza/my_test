package t;

import com.github.mikephil.charting.BuildConfig;
import java.util.Arrays;

public final class g implements Comparable<g> {
    public int A = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11190a;

    /* renamed from: b  reason: collision with root package name */
    public int f11191b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f11192c = -1;

    /* renamed from: s  reason: collision with root package name */
    public int f11193s = 0;

    /* renamed from: t  reason: collision with root package name */
    public float f11194t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11195u = false;

    /* renamed from: v  reason: collision with root package name */
    public float[] f11196v = new float[9];

    /* renamed from: w  reason: collision with root package name */
    public float[] f11197w = new float[9];

    /* renamed from: x  reason: collision with root package name */
    public a f11198x;

    /* renamed from: y  reason: collision with root package name */
    public b[] f11199y = new b[16];
    public int z = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.f11198x = aVar;
    }

    public final int compareTo(Object obj) {
        return this.f11191b - ((g) obj).f11191b;
    }

    public final void d(b bVar) {
        int i = 0;
        while (true) {
            int i10 = this.z;
            if (i >= i10) {
                b[] bVarArr = this.f11199y;
                if (i10 >= bVarArr.length) {
                    this.f11199y = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f11199y;
                int i11 = this.z;
                bVarArr2[i11] = bVar;
                this.z = i11 + 1;
                return;
            } else if (this.f11199y[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void e(b bVar) {
        int i = this.z;
        int i10 = 0;
        while (i10 < i) {
            if (this.f11199y[i10] == bVar) {
                while (i10 < i - 1) {
                    b[] bVarArr = this.f11199y;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.z--;
                return;
            }
            i10++;
        }
    }

    public final void h() {
        this.f11198x = a.UNKNOWN;
        this.f11193s = 0;
        this.f11191b = -1;
        this.f11192c = -1;
        this.f11194t = 0.0f;
        this.f11195u = false;
        int i = this.z;
        for (int i10 = 0; i10 < i; i10++) {
            this.f11199y[i10] = null;
        }
        this.z = 0;
        this.A = 0;
        this.f11190a = false;
        Arrays.fill(this.f11197w, 0.0f);
    }

    public final void i(d dVar, float f10) {
        this.f11194t = f10;
        this.f11195u = true;
        int i = this.z;
        this.f11192c = -1;
        for (int i10 = 0; i10 < i; i10++) {
            this.f11199y[i10].j(dVar, this, false);
        }
        this.z = 0;
    }

    public final void k(d dVar, b bVar) {
        int i = this.z;
        for (int i10 = 0; i10 < i; i10++) {
            this.f11199y[i10].k(dVar, bVar, false);
        }
        this.z = 0;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d(BuildConfig.FLAVOR);
        d10.append(this.f11191b);
        return d10.toString();
    }
}
