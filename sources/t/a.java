package t;

import com.github.mikephil.charting.BuildConfig;
import java.util.Arrays;
import t.b;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f11152a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f11153b;

    /* renamed from: c  reason: collision with root package name */
    public final c f11154c;

    /* renamed from: d  reason: collision with root package name */
    public int f11155d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f11156e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f11157f = new int[8];
    public float[] g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f11158h = -1;
    public int i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11159j = false;

    public a(b bVar, c cVar) {
        this.f11153b = bVar;
        this.f11154c = cVar;
    }

    public final float a(int i10) {
        int i11 = this.f11158h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f11152a) {
            if (i12 == i10) {
                return this.g[i11];
            }
            i11 = this.f11157f[i11];
            i12++;
        }
        return 0.0f;
    }

    public final float b(b bVar, boolean z) {
        float e10 = e(bVar.f11160a);
        c(bVar.f11160a, z);
        b.a aVar = bVar.f11163d;
        int f10 = aVar.f();
        for (int i10 = 0; i10 < f10; i10++) {
            g h10 = aVar.h(i10);
            j(h10, aVar.e(h10) * e10, z);
        }
        return e10;
    }

    public final float c(g gVar, boolean z) {
        int i10 = this.f11158h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f11152a) {
            if (this.f11156e[i10] == gVar.f11191b) {
                if (i10 == this.f11158h) {
                    this.f11158h = this.f11157f[i10];
                } else {
                    int[] iArr = this.f11157f;
                    iArr[i12] = iArr[i10];
                }
                if (z) {
                    gVar.e(this.f11153b);
                }
                gVar.A--;
                this.f11152a--;
                this.f11156e[i10] = -1;
                if (this.f11159j) {
                    this.i = i10;
                }
                return this.g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f11157f[i10];
        }
        return 0.0f;
    }

    public final void clear() {
        int i10 = this.f11158h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11152a) {
            g gVar = ((g[]) this.f11154c.f11168d)[this.f11156e[i10]];
            if (gVar != null) {
                gVar.e(this.f11153b);
            }
            i10 = this.f11157f[i10];
            i11++;
        }
        this.f11158h = -1;
        this.i = -1;
        this.f11159j = false;
        this.f11152a = 0;
    }

    public final void d(g gVar, float f10) {
        if (f10 == 0.0f) {
            c(gVar, true);
            return;
        }
        int i10 = this.f11158h;
        if (i10 == -1) {
            this.f11158h = 0;
            this.g[0] = f10;
            this.f11156e[0] = gVar.f11191b;
            this.f11157f[0] = -1;
            gVar.A++;
            gVar.d(this.f11153b);
            this.f11152a++;
            if (!this.f11159j) {
                int i11 = this.i + 1;
                this.i = i11;
                int[] iArr = this.f11156e;
                if (i11 >= iArr.length) {
                    this.f11159j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f11152a) {
            int[] iArr2 = this.f11156e;
            int i14 = iArr2[i10];
            int i15 = gVar.f11191b;
            if (i14 == i15) {
                this.g[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i13 = i10;
            }
            i10 = this.f11157f[i10];
            i12++;
        }
        int i16 = this.i;
        int i17 = i16 + 1;
        if (this.f11159j) {
            int[] iArr3 = this.f11156e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f11156e;
        if (i16 >= iArr4.length && this.f11152a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f11156e;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f11156e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f11155d * 2;
            this.f11155d = i19;
            this.f11159j = false;
            this.i = i16 - 1;
            this.g = Arrays.copyOf(this.g, i19);
            this.f11156e = Arrays.copyOf(this.f11156e, this.f11155d);
            this.f11157f = Arrays.copyOf(this.f11157f, this.f11155d);
        }
        this.f11156e[i16] = gVar.f11191b;
        this.g[i16] = f10;
        if (i13 != -1) {
            int[] iArr7 = this.f11157f;
            iArr7[i16] = iArr7[i13];
            iArr7[i13] = i16;
        } else {
            this.f11157f[i16] = this.f11158h;
            this.f11158h = i16;
        }
        gVar.A++;
        gVar.d(this.f11153b);
        int i20 = this.f11152a + 1;
        this.f11152a = i20;
        if (!this.f11159j) {
            this.i++;
        }
        int[] iArr8 = this.f11156e;
        if (i20 >= iArr8.length) {
            this.f11159j = true;
        }
        if (this.i >= iArr8.length) {
            this.f11159j = true;
            this.i = iArr8.length - 1;
        }
    }

    public final float e(g gVar) {
        int i10 = this.f11158h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11152a) {
            if (this.f11156e[i10] == gVar.f11191b) {
                return this.g[i10];
            }
            i10 = this.f11157f[i10];
            i11++;
        }
        return 0.0f;
    }

    public final int f() {
        return this.f11152a;
    }

    public final boolean g(g gVar) {
        int i10 = this.f11158h;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11152a) {
            if (this.f11156e[i10] == gVar.f11191b) {
                return true;
            }
            i10 = this.f11157f[i10];
            i11++;
        }
        return false;
    }

    public final g h(int i10) {
        int i11 = this.f11158h;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f11152a) {
            if (i12 == i10) {
                return ((g[]) this.f11154c.f11168d)[this.f11156e[i11]];
            }
            i11 = this.f11157f[i11];
            i12++;
        }
        return null;
    }

    public final void i(float f10) {
        int i10 = this.f11158h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11152a) {
            float[] fArr = this.g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f11157f[i10];
            i11++;
        }
    }

    public final void j(g gVar, float f10, boolean z) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i10 = this.f11158h;
            if (i10 == -1) {
                this.f11158h = 0;
                this.g[0] = f10;
                this.f11156e[0] = gVar.f11191b;
                this.f11157f[0] = -1;
                gVar.A++;
                gVar.d(this.f11153b);
                this.f11152a++;
                if (!this.f11159j) {
                    int i11 = this.i + 1;
                    this.i = i11;
                    int[] iArr = this.f11156e;
                    if (i11 >= iArr.length) {
                        this.f11159j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f11152a) {
                int[] iArr2 = this.f11156e;
                int i14 = iArr2[i10];
                int i15 = gVar.f11191b;
                if (i14 == i15) {
                    float[] fArr = this.g;
                    float f11 = fArr[i10] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i10] = f11;
                    if (f11 == 0.0f) {
                        if (i10 == this.f11158h) {
                            this.f11158h = this.f11157f[i10];
                        } else {
                            int[] iArr3 = this.f11157f;
                            iArr3[i13] = iArr3[i10];
                        }
                        if (z) {
                            gVar.e(this.f11153b);
                        }
                        if (this.f11159j) {
                            this.i = i10;
                        }
                        gVar.A--;
                        this.f11152a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i10] < i15) {
                    i13 = i10;
                }
                i10 = this.f11157f[i10];
                i12++;
            }
            int i16 = this.i;
            int i17 = i16 + 1;
            if (this.f11159j) {
                int[] iArr4 = this.f11156e;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f11156e;
            if (i16 >= iArr5.length && this.f11152a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f11156e;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f11156e;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f11155d * 2;
                this.f11155d = i19;
                this.f11159j = false;
                this.i = i16 - 1;
                this.g = Arrays.copyOf(this.g, i19);
                this.f11156e = Arrays.copyOf(this.f11156e, this.f11155d);
                this.f11157f = Arrays.copyOf(this.f11157f, this.f11155d);
            }
            this.f11156e[i16] = gVar.f11191b;
            this.g[i16] = f10;
            if (i13 != -1) {
                int[] iArr8 = this.f11157f;
                iArr8[i16] = iArr8[i13];
                iArr8[i13] = i16;
            } else {
                this.f11157f[i16] = this.f11158h;
                this.f11158h = i16;
            }
            gVar.A++;
            gVar.d(this.f11153b);
            this.f11152a++;
            if (!this.f11159j) {
                this.i++;
            }
            int i20 = this.i;
            int[] iArr9 = this.f11156e;
            if (i20 >= iArr9.length) {
                this.f11159j = true;
                this.i = iArr9.length - 1;
            }
        }
    }

    public final void k() {
        int i10 = this.f11158h;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11152a) {
            float[] fArr = this.g;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f11157f[i10];
            i11++;
        }
    }

    public final String toString() {
        int i10 = this.f11158h;
        String str = BuildConfig.FLAVOR;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f11152a) {
            StringBuilder d10 = a.a.d(a8.a.c(str, " -> "));
            d10.append(this.g[i10]);
            d10.append(" : ");
            StringBuilder d11 = a.a.d(d10.toString());
            d11.append(((g[]) this.f11154c.f11168d)[this.f11156e[i10]]);
            str = d11.toString();
            i10 = this.f11157f[i10];
            i11++;
        }
        return str;
    }
}
