package va;

import ab.i;
import ab.k;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.m;
import com.bumptech.glide.b;
import com.bumptech.glide.d;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import e6.e;
import eb.a;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.Objects;
import p3.l;
import p3.q;
import y3.f;
import z3.h;

public final class c1 extends b1 implements a.C0072a {
    public final LinearLayout P;
    public final a Q;
    public final a R;
    public final a S;
    public long T = -1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c1(androidx.databinding.e r17, android.view.View r18) {
        /*
            r16 = this;
            r9 = r16
            r10 = r18
            r0 = 8
            r11 = 0
            r1 = r17
            java.lang.Object[] r12 = androidx.databinding.ViewDataBinding.l(r1, r10, r0, r11, r11)
            r0 = 5
            r0 = r12[r0]
            r3 = r0
            android.widget.Button r3 = (android.widget.Button) r3
            r0 = 6
            r0 = r12[r0]
            r4 = r0
            android.widget.Button r4 = (android.widget.Button) r4
            r0 = 7
            r0 = r12[r0]
            r5 = r0
            android.widget.ImageButton r5 = (android.widget.ImageButton) r5
            r13 = 1
            r0 = r12[r13]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r14 = 3
            r0 = r12[r14]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r15 = 2
            r0 = r12[r15]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = r16
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r9.T = r0
            android.widget.Button r0 = r9.I
            r0.setTag(r11)
            java.lang.Object r0 = r9.O
            android.widget.Button r0 = (android.widget.Button) r0
            r0.setTag(r11)
            android.widget.ImageButton r0 = r9.J
            r0.setTag(r11)
            android.widget.ImageView r0 = r9.K
            r0.setTag(r11)
            r0 = 0
            r0 = r12[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r11)
            r0 = 4
            r0 = r12[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r9.P = r0
            r0.setTag(r11)
            android.widget.TextView r0 = r9.L
            r0.setTag(r11)
            android.widget.TextView r0 = r9.M
            r0.setTag(r11)
            r0 = 2131230909(0x7f0800bd, float:1.8077884E38)
            r10.setTag(r0, r9)
            eb.a r0 = new eb.a
            r0.<init>(r9, r15)
            r9.Q = r0
            eb.a r0 = new eb.a
            r0.<init>(r9, r14)
            r9.R = r0
            eb.a r0 = new eb.a
            r0.<init>(r9, r13)
            r9.S = r0
            r16.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: va.c1.<init>(androidx.databinding.e, android.view.View):void");
    }

    public final void a(int i, View view) {
        String str;
        boolean z = false;
        if (i == 1) {
            HomeViewModelV2 homeViewModelV2 = this.N;
            if (homeViewModelV2 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV2.l();
            }
        } else if (i == 2) {
            HomeViewModelV2 homeViewModelV22 = this.N;
            if (homeViewModelV22 != null) {
                z = true;
            }
            if (z) {
                String str2 = homeViewModelV22.f6767u;
                k kVar = k.f279a;
                i iVar = k.f282d;
                m.g("onClickAnnounceLearnMore ", iVar != null ? iVar.f278h : null, str2);
                i iVar2 = k.f282d;
                if (!(iVar2 == null || (str = iVar2.f278h) == null)) {
                    homeViewModelV22.Q = str;
                    homeViewModelV22.m(HomeViewModelV2.a.GOTO_BROWSER);
                }
                homeViewModelV22.l();
            }
        } else if (i == 3) {
            HomeViewModelV2 homeViewModelV23 = this.N;
            if (homeViewModelV23 != null) {
                z = true;
            }
            if (z) {
                homeViewModelV23.l();
            }
        }
    }

    public final void c() {
        long j10;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        int i11;
        int i12;
        y3.a aVar;
        h hVar;
        String str5;
        String str6;
        long j11;
        long j12;
        synchronized (this) {
            j10 = this.T;
            this.T = 0;
        }
        int i13 = ((j10 & 2) > 0 ? 1 : ((j10 & 2) == 0 ? 0 : -1));
        String str7 = null;
        if (i13 != 0) {
            k kVar = k.f279a;
            i iVar = k.f282d;
            if (iVar != null) {
                String str8 = iVar.f274c;
                String str9 = iVar.f276e;
                str2 = iVar.f272a;
                str = iVar.f273b;
                str6 = iVar.g;
                String str10 = str9;
                str5 = str8;
                str7 = str10;
            } else {
                str6 = null;
                str5 = null;
                str2 = null;
                str = null;
            }
            boolean z = str7 == null;
            boolean z10 = str == null;
            boolean z11 = str6 == null;
            if (i13 != 0) {
                if (z) {
                    j12 = j10 | 32;
                    j11 = 512;
                } else {
                    j12 = j10 | 16;
                    j11 = 256;
                }
                j10 = j12 | j11;
            }
            if ((j10 & 2) != 0) {
                j10 |= z10 ? 8 : 4;
            }
            if ((j10 & 2) != 0) {
                j10 |= z11 ? 128 : 64;
            }
            i12 = z ? 1 : 2;
            i10 = z ? 8 : 0;
            i = z10 ? 8 : 0;
            i11 = z11 ? 8 : 0;
            String str11 = str6;
            str4 = str7;
            str7 = str5;
            str3 = str11;
        } else {
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            i = 0;
        }
        if ((j10 & 2) != 0) {
            this.I.setOnClickListener(this.S);
            u0.a.a(this.I, str7);
            ((Button) this.O).setOnClickListener(this.Q);
            u0.a.a((Button) this.O, str4);
            ((Button) this.O).setVisibility(i10);
            this.J.setOnClickListener(this.R);
            this.K.setVisibility(i11);
            ImageView imageView = this.K;
            e.D(imageView, "imageView");
            e.D(str3, "imageUrl");
            if (str3.length() == 0) {
                imageView.setVisibility(8);
            } else {
                j e10 = b.e(imageView.getContext());
                Objects.requireNonNull(e10);
                com.bumptech.glide.i B = new com.bumptech.glide.i(e10.f3537a, e10, Drawable.class, e10.f3538b).B(str3);
                Objects.requireNonNull(B);
                l.c cVar = l.f9599a;
                y3.a p10 = B.p(new q());
                p10.N = true;
                com.bumptech.glide.i w6 = ((com.bumptech.glide.i) p10).a((f) new f().j((int) imageView.getX(), (int) imageView.getY()));
                if (f.P == null) {
                    y3.a p11 = new f().p(new q());
                    p11.N = true;
                    f fVar = (f) p11;
                    fVar.b();
                    f.P = fVar;
                }
                com.bumptech.glide.i w10 = w6.a(f.P);
                Objects.requireNonNull(w10);
                c4.j.a();
                if (!y3.a.h(w10.f13425a, 2048) && w10.C && imageView.getScaleType() != null) {
                    switch (i.a.f3535a[imageView.getScaleType().ordinal()]) {
                        case 1:
                            aVar = w10.clone().i(l.f9601c, new p3.i());
                            break;
                        case 2:
                            aVar = w10.clone().i(l.f9600b, new p3.j());
                            aVar.N = true;
                            break;
                        case 3:
                        case 4:
                        case 5:
                            aVar = w10.clone().i(cVar, new q());
                            aVar.N = true;
                            break;
                        case 6:
                            aVar = w10.clone().i(l.f9600b, new p3.j());
                            aVar.N = true;
                            break;
                    }
                }
                aVar = w10;
                d dVar = w10.S;
                Class<TranscodeType> cls = w10.R;
                Objects.requireNonNull(dVar.f3518c);
                if (Bitmap.class.equals(cls)) {
                    hVar = new z3.b(imageView);
                } else if (Drawable.class.isAssignableFrom(cls)) {
                    hVar = new z3.d(imageView);
                } else {
                    throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                }
                w10.A(hVar, aVar);
            }
            this.P.setWeightSum((float) i12);
            u0.a.a(this.L, str);
            this.L.setVisibility(i);
            u0.a.a(this.M, str2);
        }
    }

    public final boolean g() {
        synchronized (this) {
            if (this.T != 0) {
                return true;
            }
            return false;
        }
    }

    public final void i() {
        synchronized (this) {
            this.T = 2;
        }
        o();
    }

    public final boolean m(int i, Object obj, int i10) {
        return false;
    }

    public final boolean s(int i, Object obj) {
        if (3 != i) {
            return false;
        }
        this.N = (HomeViewModelV2) obj;
        synchronized (this) {
            this.T |= 1;
        }
        b(3);
        o();
        return true;
    }
}
