package e6;

import aa.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public b f4684a;

    /* renamed from: b  reason: collision with root package name */
    public b f4685b;

    /* renamed from: c  reason: collision with root package name */
    public b f4686c;

    /* renamed from: d  reason: collision with root package name */
    public b f4687d;

    /* renamed from: e  reason: collision with root package name */
    public c f4688e;

    /* renamed from: f  reason: collision with root package name */
    public c f4689f;
    public c g;

    /* renamed from: h  reason: collision with root package name */
    public c f4690h;
    public e i;

    /* renamed from: j  reason: collision with root package name */
    public e f4691j;

    /* renamed from: k  reason: collision with root package name */
    public e f4692k;

    /* renamed from: l  reason: collision with root package name */
    public e f4693l;

    public i(a aVar) {
        this.f4684a = aVar.f4694a;
        this.f4685b = aVar.f4695b;
        this.f4686c = aVar.f4696c;
        this.f4687d = aVar.f4697d;
        this.f4688e = aVar.f4698e;
        this.f4689f = aVar.f4699f;
        this.g = aVar.g;
        this.f4690h = aVar.f4700h;
        this.i = aVar.i;
        this.f4691j = aVar.f4701j;
        this.f4692k = aVar.f4702k;
        this.f4693l = aVar.f4703l;
    }

    public static a a(Context context, int i10, int i11, c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, e5.a.A);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c10 = c(obtainStyledAttributes, 5, cVar);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            a aVar = new a();
            b Q = a.b.Q(i13);
            aVar.f4694a = Q;
            a.b(Q);
            aVar.f4698e = c11;
            b Q2 = a.b.Q(i14);
            aVar.f4695b = Q2;
            a.b(Q2);
            aVar.f4699f = c12;
            b Q3 = a.b.Q(i15);
            aVar.f4696c = Q3;
            a.b(Q3);
            aVar.g = c13;
            b Q4 = a.b.Q(i16);
            aVar.f4697d = Q4;
            a.b(Q4);
            aVar.f4700h = c14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5.a.f4634t, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i11 == 6 ? new g(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        Class<e> cls = e.class;
        boolean z = this.f4693l.getClass().equals(cls) && this.f4691j.getClass().equals(cls) && this.i.getClass().equals(cls) && this.f4692k.getClass().equals(cls);
        float a10 = this.f4688e.a(rectF);
        boolean z10 = this.f4689f.a(rectF) == a10 && this.f4690h.a(rectF) == a10 && this.g.a(rectF) == a10;
        boolean z11 = (this.f4685b instanceof h) && (this.f4684a instanceof h) && (this.f4686c instanceof h) && (this.f4687d instanceof h);
        if (!z || !z10 || !z11) {
            return false;
        }
        return true;
    }

    public final i e(float f10) {
        a aVar = new a(this);
        aVar.e(f10);
        aVar.f(f10);
        aVar.d(f10);
        aVar.c(f10);
        return aVar.a();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public b f4694a = new h();

        /* renamed from: b  reason: collision with root package name */
        public b f4695b = new h();

        /* renamed from: c  reason: collision with root package name */
        public b f4696c = new h();

        /* renamed from: d  reason: collision with root package name */
        public b f4697d = new h();

        /* renamed from: e  reason: collision with root package name */
        public c f4698e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f4699f = new a(0.0f);
        public c g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f4700h = new a(0.0f);
        public e i = new e();

        /* renamed from: j  reason: collision with root package name */
        public e f4701j = new e();

        /* renamed from: k  reason: collision with root package name */
        public e f4702k = new e();

        /* renamed from: l  reason: collision with root package name */
        public e f4703l = new e();

        public a() {
        }

        public static void b(b bVar) {
            if (bVar instanceof h) {
                h hVar = (h) bVar;
            } else if (bVar instanceof d) {
                d dVar = (d) bVar;
            }
        }

        public final i a() {
            return new i(this);
        }

        public final a c(float f10) {
            this.f4700h = new a(f10);
            return this;
        }

        public final a d(float f10) {
            this.g = new a(f10);
            return this;
        }

        public final a e(float f10) {
            this.f4698e = new a(f10);
            return this;
        }

        public final a f(float f10) {
            this.f4699f = new a(f10);
            return this;
        }

        public a(i iVar) {
            this.f4694a = iVar.f4684a;
            this.f4695b = iVar.f4685b;
            this.f4696c = iVar.f4686c;
            this.f4697d = iVar.f4687d;
            this.f4698e = iVar.f4688e;
            this.f4699f = iVar.f4689f;
            this.g = iVar.g;
            this.f4700h = iVar.f4690h;
            this.i = iVar.i;
            this.f4701j = iVar.f4691j;
            this.f4702k = iVar.f4692k;
            this.f4703l = iVar.f4693l;
        }
    }

    public i() {
        this.f4684a = new h();
        this.f4685b = new h();
        this.f4686c = new h();
        this.f4687d = new h();
        this.f4688e = new a(0.0f);
        this.f4689f = new a(0.0f);
        this.g = new a(0.0f);
        this.f4690h = new a(0.0f);
        this.i = new e();
        this.f4691j = new e();
        this.f4692k = new e();
        this.f4693l = new e();
    }
}
