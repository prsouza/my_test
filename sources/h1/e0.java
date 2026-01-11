package h1;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l1.b;
import o.a;

public abstract class e0 {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public volatile l1.a f5675a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f5676b;

    /* renamed from: c  reason: collision with root package name */
    public k0 f5677c;

    /* renamed from: d  reason: collision with root package name */
    public l1.b f5678d;

    /* renamed from: e  reason: collision with root package name */
    public final u f5679e = e();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5680f;
    @Deprecated
    public List<b> g;

    /* renamed from: h  reason: collision with root package name */
    public Map<Class<? extends i1.a>, i1.a> f5681h = new HashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    public a f5682j;

    /* renamed from: k  reason: collision with root package name */
    public final ThreadLocal<Integer> f5683k = new ThreadLocal<>();

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, Object> f5684l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final Map<Class<?>, Object> f5685m = new HashMap();

    public static class a<T extends e0> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f5686a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5687b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f5688c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f5689d;

        /* renamed from: e  reason: collision with root package name */
        public Executor f5690e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f5691f;
        public b.c g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5692h;
        public c i = c.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5693j = true;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5694k;

        /* renamed from: l  reason: collision with root package name */
        public final d f5695l = new d();

        /* renamed from: m  reason: collision with root package name */
        public Set<Integer> f5696m;

        public a(Context context, Class<T> cls, String str) {
            this.f5688c = context;
            this.f5686a = cls;
            this.f5687b = str;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
        public final a<T> a(i1.b... bVarArr) {
            if (this.f5696m == null) {
                this.f5696m = new HashSet();
            }
            for (i1.b bVar : bVarArr) {
                this.f5696m.add(Integer.valueOf(bVar.f5974a));
                this.f5696m.add(Integer.valueOf(bVar.f5975b));
            }
            this.f5695l.a(bVarArr);
            return this;
        }

        /* JADX WARNING: type inference failed for: r9v1, types: [java.util.Map<java.lang.Class<?>, java.lang.Object>, java.util.HashMap] */
        /* JADX WARNING: type inference failed for: r6v13, types: [java.util.Map<java.lang.Class<? extends i1.a>, i1.a>, java.util.HashMap] */
        public final T b() {
            String str;
            boolean z;
            Executor executor;
            Context context = this.f5688c;
            if (context == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f5686a != null) {
                Executor executor2 = this.f5690e;
                if (executor2 == null && this.f5691f == null) {
                    a.C0174a aVar = o.a.f9162y;
                    this.f5691f = aVar;
                    this.f5690e = aVar;
                } else if (executor2 != null && this.f5691f == null) {
                    this.f5691f = executor2;
                } else if (executor2 == null && (executor = this.f5691f) != null) {
                    this.f5690e = executor;
                }
                b.c cVar = this.g;
                if (cVar == null) {
                    cVar = new m1.c();
                }
                m mVar = new m(context, this.f5687b, cVar, this.f5695l, this.f5689d, this.f5692h, this.i.resolve(context), this.f5690e, this.f5691f, this.f5693j, this.f5694k);
                Class<T> cls = this.f5686a;
                String name = cls.getPackage().getName();
                String canonicalName = cls.getCanonicalName();
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String str2 = canonicalName.replace('.', '_') + "_Impl";
                try {
                    if (name.isEmpty()) {
                        str = str2;
                    } else {
                        str = name + "." + str2;
                    }
                    T t10 = (e0) Class.forName(str, true, cls.getClassLoader()).newInstance();
                    t10.f5678d = t10.f(mVar);
                    Set<Class<? extends i1.a>> h10 = t10.h();
                    BitSet bitSet = new BitSet();
                    Iterator<Class<? extends i1.a>> it = h10.iterator();
                    while (true) {
                        int i10 = -1;
                        if (it.hasNext()) {
                            Class next = it.next();
                            int size = mVar.g.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                } else if (next.isAssignableFrom(mVar.g.get(size).getClass())) {
                                    bitSet.set(size);
                                    i10 = size;
                                    break;
                                } else {
                                    size--;
                                }
                            }
                            if (i10 >= 0) {
                                t10.f5681h.put(next, mVar.g.get(i10));
                            } else {
                                StringBuilder d10 = a.a.d("A required auto migration spec (");
                                d10.append(next.getCanonicalName());
                                d10.append(") is missing in the database configuration.");
                                throw new IllegalArgumentException(d10.toString());
                            }
                        } else {
                            int size2 = mVar.g.size() - 1;
                            while (size2 >= 0) {
                                if (bitSet.get(size2)) {
                                    size2--;
                                } else {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                            }
                            Iterator it2 = t10.g().iterator();
                            while (true) {
                                z = false;
                                if (!it2.hasNext()) {
                                    break;
                                }
                                i1.b bVar = (i1.b) it2.next();
                                if (!Collections.unmodifiableMap(mVar.f5750d.f5697a).containsKey(Integer.valueOf(bVar.f5974a))) {
                                    mVar.f5750d.a(bVar);
                                }
                            }
                            h0 h0Var = (h0) t10.q(h0.class, t10.f5678d);
                            if (h0Var != null) {
                                h0Var.f5727v = mVar;
                            }
                            if (((g) t10.q(g.class, t10.f5678d)) == null) {
                                if (mVar.i == c.WRITE_AHEAD_LOGGING) {
                                    z = true;
                                }
                                t10.f5678d.setWriteAheadLoggingEnabled(z);
                                t10.g = mVar.f5751e;
                                t10.f5676b = mVar.f5754j;
                                t10.f5677c = new k0(mVar.f5755k);
                                t10.f5680f = mVar.f5753h;
                                Map<Class<?>, List<Class<?>>> i11 = t10.i();
                                BitSet bitSet2 = new BitSet();
                                for (Map.Entry next2 : i11.entrySet()) {
                                    Class cls2 = (Class) next2.getKey();
                                    Iterator it3 = ((List) next2.getValue()).iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Class cls3 = (Class) it3.next();
                                            int size3 = mVar.f5752f.size() - 1;
                                            while (true) {
                                                if (size3 < 0) {
                                                    size3 = -1;
                                                    break;
                                                } else if (cls3.isAssignableFrom(mVar.f5752f.get(size3).getClass())) {
                                                    bitSet2.set(size3);
                                                    break;
                                                } else {
                                                    size3--;
                                                }
                                            }
                                            if (size3 >= 0) {
                                                t10.f5685m.put(cls3, mVar.f5752f.get(size3));
                                            } else {
                                                throw new IllegalArgumentException("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.");
                                            }
                                        }
                                    }
                                }
                                int size4 = mVar.f5752f.size() - 1;
                                while (size4 >= 0) {
                                    if (bitSet2.get(size4)) {
                                        size4--;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected type converter " + mVar.f5752f.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                }
                                return t10;
                            }
                            Objects.requireNonNull(t10.f5679e);
                            throw null;
                        }
                    }
                } catch (ClassNotFoundException unused) {
                    StringBuilder d11 = a.a.d("cannot find implementation for ");
                    d11.append(cls.getCanonicalName());
                    d11.append(". ");
                    d11.append(str2);
                    d11.append(" does not exist");
                    throw new RuntimeException(d11.toString());
                } catch (IllegalAccessException unused2) {
                    StringBuilder d12 = a.a.d("Cannot access the constructor");
                    d12.append(cls.getCanonicalName());
                    throw new RuntimeException(d12.toString());
                } catch (InstantiationException unused3) {
                    StringBuilder d13 = a.a.d("Failed to create an instance of ");
                    d13.append(cls.getCanonicalName());
                    throw new RuntimeException(d13.toString());
                }
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public final a<T> c() {
            this.f5693j = false;
            this.f5694k = true;
            return this;
        }
    }

    public static abstract class b {
        public void a(l1.a aVar) {
        }

        public void b(l1.a aVar) {
        }

        public void c(l1.a aVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        public c resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || isLowRamDevice(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public HashMap<Integer, TreeMap<Integer, i1.b>> f5697a = new HashMap<>();

        public final void a(i1.b... bVarArr) {
            for (i1.b bVar : bVarArr) {
                int i = bVar.f5974a;
                int i10 = bVar.f5975b;
                TreeMap treeMap = this.f5697a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    this.f5697a.put(Integer.valueOf(i), treeMap);
                }
                i1.b bVar2 = (i1.b) treeMap.get(Integer.valueOf(i10));
                if (bVar2 != null) {
                    Log.w("ROOM", "Overriding migration " + bVar2 + " with " + bVar);
                }
                treeMap.put(Integer.valueOf(i10), bVar);
            }
        }
    }

    public interface e {
        void a();
    }

    public final void a() {
        if (!this.f5680f) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public final void b() {
        if (!j() && this.f5683k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public final void c() {
        a();
        k();
    }

    public abstract void d();

    public abstract u e();

    public abstract l1.b f(m mVar);

    public List g() {
        return Collections.emptyList();
    }

    public Set<Class<? extends i1.a>> h() {
        return Collections.emptySet();
    }

    public Map<Class<?>, List<Class<?>>> i() {
        return Collections.emptyMap();
    }

    public final boolean j() {
        return this.f5678d.m0().M();
    }

    public final void k() {
        a();
        l1.a m02 = this.f5678d.m0();
        this.f5679e.d(m02);
        if (m02.U()) {
            m02.c0();
        } else {
            m02.i();
        }
    }

    public final void l() {
        this.f5678d.m0().h();
        if (!j()) {
            u uVar = this.f5679e;
            if (uVar.f5770e.compareAndSet(false, true)) {
                uVar.f5769d.f5676b.execute(uVar.f5774k);
            }
        }
    }

    public final void m(l1.a aVar) {
        u uVar = this.f5679e;
        synchronized (uVar) {
            if (uVar.f5771f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            m1.a aVar2 = (m1.a) aVar;
            aVar2.q("PRAGMA temp_store = MEMORY;");
            aVar2.q("PRAGMA recursive_triggers='ON';");
            aVar2.q("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            uVar.d(aVar2);
            uVar.g = aVar2.z("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
            uVar.f5771f = true;
        }
    }

    public final boolean n() {
        a aVar = this.f5682j;
        if (aVar != null) {
            return !aVar.f5650a;
        }
        l1.a aVar2 = this.f5675a;
        if (aVar2 == null || !aVar2.isOpen()) {
            return false;
        }
        return true;
    }

    public final Cursor o(l1.d dVar) {
        a();
        b();
        return this.f5678d.m0().k(dVar);
    }

    @Deprecated
    public final void p() {
        this.f5678d.m0().Y();
    }

    public final <T> T q(Class<T> cls, l1.b bVar) {
        if (cls.isInstance(bVar)) {
            return bVar;
        }
        if (bVar instanceof n) {
            return q(cls, ((n) bVar).a());
        }
        return null;
    }
}
