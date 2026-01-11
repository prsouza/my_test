package j;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import j.b;

public class d extends b {
    public a C;
    public boolean D;

    public static class a extends b.c {
        public int[][] H;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.H = aVar.H;
            } else {
                this.H = new int[this.g.length][];
            }
        }

        public void e() {
            int[][] iArr = this.H;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.H;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.H = iArr2;
        }

        public final int g(int[] iArr) {
            int[][] iArr2 = this.H;
            int i = this.f6959h;
            for (int i10 = 0; i10 < i; i10++) {
                if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                    return i10;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void e(b.c cVar) {
        this.f6941a = cVar;
        int i = this.f6947v;
        if (i >= 0) {
            Drawable d10 = cVar.d(i);
            this.f6943c = d10;
            if (d10 != null) {
                c(d10);
            }
        }
        this.f6944s = null;
        if (cVar instanceof a) {
            this.C = (a) cVar;
        }
    }

    /* renamed from: f */
    public a b() {
        return new a(this.C, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.D) {
            super.mutate();
            this.C.e();
            this.D = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g = this.C.g(iArr);
        if (g < 0) {
            g = this.C.g(StateSet.WILD_CARD);
        }
        return d(g) || onStateChange;
    }

    public d() {
    }
}
