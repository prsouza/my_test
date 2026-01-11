package q5;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import e6.e;

public interface d {

    public static class a implements TypeEvaluator<C0199d> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<C0199d> f10304b = new a();

        /* renamed from: a  reason: collision with root package name */
        public final C0199d f10305a = new C0199d();

        public final Object evaluate(float f10, Object obj, Object obj2) {
            C0199d dVar = (C0199d) obj;
            C0199d dVar2 = (C0199d) obj2;
            C0199d dVar3 = this.f10305a;
            float R = e.R(dVar.f10308a, dVar2.f10308a, f10);
            float R2 = e.R(dVar.f10309b, dVar2.f10309b, f10);
            float R3 = e.R(dVar.f10310c, dVar2.f10310c, f10);
            dVar3.f10308a = R;
            dVar3.f10309b = R2;
            dVar3.f10310c = R3;
            return this.f10305a;
        }
    }

    public static class b extends Property<d, C0199d> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, C0199d> f10306a = new b();

        public b() {
            super(C0199d.class, "circularReveal");
        }

        public final Object get(Object obj) {
            return ((d) obj).getRevealInfo();
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setRevealInfo((C0199d) obj2);
        }
    }

    public static class c extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f10307a = new c();

        public c() {
            super(Integer.class, "circularRevealScrimColor");
        }

        public final Object get(Object obj) {
            return Integer.valueOf(((d) obj).getCircularRevealScrimColor());
        }

        public final void set(Object obj, Object obj2) {
            ((d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* renamed from: q5.d$d  reason: collision with other inner class name */
    public static class C0199d {

        /* renamed from: a  reason: collision with root package name */
        public float f10308a;

        /* renamed from: b  reason: collision with root package name */
        public float f10309b;

        /* renamed from: c  reason: collision with root package name */
        public float f10310c;

        public C0199d() {
        }

        public C0199d(float f10, float f11, float f12) {
            this.f10308a = f10;
            this.f10309b = f11;
            this.f10310c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    C0199d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C0199d dVar);
}
