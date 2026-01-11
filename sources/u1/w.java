package u1;

import android.os.Build;
import androidx.work.ListenableWorker;
import d2.o;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public UUID f11656a;

    /* renamed from: b  reason: collision with root package name */
    public o f11657b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f11658c;

    public static abstract class a<B extends a<?, ?>, W extends w> {

        /* renamed from: a  reason: collision with root package name */
        public UUID f11659a = UUID.randomUUID();

        /* renamed from: b  reason: collision with root package name */
        public o f11660b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f11661c = new HashSet();

        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
        public a(Class<? extends ListenableWorker> cls) {
            this.f11660b = new o(this.f11659a.toString(), cls.getName());
            this.f11661c.add(cls.getName());
            c();
        }

        public final W a() {
            W b10 = b();
            c cVar = this.f11660b.f4300j;
            boolean z = (Build.VERSION.SDK_INT >= 24 && cVar.a()) || cVar.f11629d || cVar.f11627b || cVar.f11628c;
            o oVar = this.f11660b;
            if (oVar.f4307q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (oVar.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f11659a = UUID.randomUUID();
            o oVar2 = new o(this.f11660b);
            this.f11660b = oVar2;
            oVar2.f4293a = this.f11659a.toString();
            return b10;
        }

        public abstract W b();

        public abstract B c();
    }

    public w(UUID uuid, o oVar, Set<String> set) {
        this.f11656a = uuid;
        this.f11657b = oVar;
        this.f11658c = set;
    }

    public final String a() {
        return this.f11656a.toString();
    }
}
