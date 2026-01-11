package t3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import g3.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final f3.a f11304a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11305b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f11306c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final j f11307d;

    /* renamed from: e  reason: collision with root package name */
    public final j3.c f11308e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11309f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public i<Bitmap> f11310h;
    public a i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11311j;

    /* renamed from: k  reason: collision with root package name */
    public a f11312k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f11313l;

    /* renamed from: m  reason: collision with root package name */
    public l<Bitmap> f11314m;

    /* renamed from: n  reason: collision with root package name */
    public a f11315n;

    /* renamed from: o  reason: collision with root package name */
    public int f11316o;

    /* renamed from: p  reason: collision with root package name */
    public int f11317p;

    /* renamed from: q  reason: collision with root package name */
    public int f11318q;

    public static class a extends z3.c<Bitmap> {

        /* renamed from: s  reason: collision with root package name */
        public final Handler f11319s;

        /* renamed from: t  reason: collision with root package name */
        public final int f11320t;

        /* renamed from: u  reason: collision with root package name */
        public final long f11321u;

        /* renamed from: v  reason: collision with root package name */
        public Bitmap f11322v;

        public a(Handler handler, int i, long j10) {
            this.f11319s = handler;
            this.f11320t = i;
            this.f11321u = j10;
        }

        public final void f(Drawable drawable) {
            this.f11322v = null;
        }

        public final void g(Object obj) {
            this.f11322v = (Bitmap) obj;
            this.f11319s.sendMessageAtTime(this.f11319s.obtainMessage(1, this), this.f11321u);
        }
    }

    public interface b {
        void a();
    }

    public class c implements Handler.Callback {
        public c() {
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                f.this.b((a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                f.this.f11307d.h((a) message.obj);
                return false;
            }
        }
    }

    public f(com.bumptech.glide.b bVar, f3.a aVar, int i10, int i11, l<Bitmap> lVar, Bitmap bitmap) {
        j3.c cVar = bVar.f3493a;
        j e10 = com.bumptech.glide.b.e(bVar.f3495c.getBaseContext());
        j e11 = com.bumptech.glide.b.e(bVar.f3495c.getBaseContext());
        Objects.requireNonNull(e11);
        i<Bitmap> w6 = new i(e11.f3537a, e11, Bitmap.class, e11.f3538b).a(j.z).a(((y3.f) ((y3.f) ((y3.f) new y3.f().g(i3.l.f6084a)).u()).o()).j(i10, i11));
        this.f11307d = e10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f11308e = cVar;
        this.f11305b = handler;
        this.f11310h = w6;
        this.f11304a = aVar;
        c(lVar, bitmap);
    }

    public final void a() {
        if (this.f11309f && !this.g) {
            a aVar = this.f11315n;
            if (aVar != null) {
                this.f11315n = null;
                b(aVar);
                return;
            }
            this.g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.f11304a.e());
            this.f11304a.c();
            this.f11312k = new a(this.f11305b, this.f11304a.a(), uptimeMillis);
            i<Bitmap> B = this.f11310h.a((y3.f) new y3.f().n(new b4.b(Double.valueOf(Math.random())))).B(this.f11304a);
            B.A(this.f11312k, B);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<t3.f$b>, java.util.ArrayList] */
    public final void b(a aVar) {
        this.g = false;
        if (this.f11311j) {
            this.f11305b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f11309f) {
            this.f11315n = aVar;
        } else {
            if (aVar.f11322v != null) {
                Bitmap bitmap = this.f11313l;
                if (bitmap != null) {
                    this.f11308e.e(bitmap);
                    this.f11313l = null;
                }
                a aVar2 = this.i;
                this.i = aVar;
                int size = this.f11306c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) this.f11306c.get(size)).a();
                }
                if (aVar2 != null) {
                    this.f11305b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [g3.l, java.lang.Object, g3.l<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(g3.l<android.graphics.Bitmap> r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            r3.f11314m = r4
            java.util.Objects.requireNonNull(r5, r0)
            r3.f11313l = r5
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r3.f11310h
            y3.f r1 = new y3.f
            r1.<init>()
            r2 = 1
            y3.a r4 = r1.q(r4, r2)
            com.bumptech.glide.i r4 = r0.a(r4)
            r3.f11310h = r4
            int r4 = c4.j.d(r5)
            r3.f11316o = r4
            int r4 = r5.getWidth()
            r3.f11317p = r4
            int r4 = r5.getHeight()
            r3.f11318q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.f.c(g3.l, android.graphics.Bitmap):void");
    }
}
