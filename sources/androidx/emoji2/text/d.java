package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.h;
import c3.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class d {
    public static final Object i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile d f1699j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f1700a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<e> f1701b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1702c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1703d;

    /* renamed from: e  reason: collision with root package name */
    public final a f1704e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1705f;
    public final int g;

    /* renamed from: h  reason: collision with root package name */
    public final h.a f1706h;

    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile h f1707b;

        /* renamed from: c  reason: collision with root package name */
        public volatile o f1708c;

        /* renamed from: androidx.emoji2.text.d$a$a  reason: collision with other inner class name */
        public class C0013a extends h {
            public C0013a() {
            }

            public final void a(Throwable th2) {
                a.this.f1710a.f(th2);
            }

            public final void b(o oVar) {
                a aVar = a.this;
                aVar.f1708c = oVar;
                aVar.f1707b = new h(aVar.f1708c, new i(), aVar.f1710a.f1706h);
                aVar.f1710a.g();
            }
        }

        public a(d dVar) {
            super(dVar);
        }

        public final void a() {
            try {
                this.f1710a.f1705f.a(new C0013a());
            } catch (Throwable th2) {
                this.f1710a.f(th2);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final d f1710a;

        public b(d dVar) {
            this.f1710a = dVar;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f1711a;

        /* renamed from: b  reason: collision with root package name */
        public int f1712b = 0;

        /* renamed from: c  reason: collision with root package name */
        public h.a f1713c = new h.a();

        public c(g gVar) {
            this.f1711a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    public interface C0014d {
    }

    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }

    public static class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final List<e> f1714a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f1715b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1716c;

        public f(Collection<e> collection, int i, Throwable th2) {
            k.S(collection, "initCallbacks cannot be null");
            this.f1714a = new ArrayList(collection);
            this.f1716c = i;
            this.f1715b = th2;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<androidx.emoji2.text.d$e>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<androidx.emoji2.text.d$e>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List<androidx.emoji2.text.d$e>, java.util.ArrayList] */
        public final void run() {
            int size = this.f1714a.size();
            int i = 0;
            if (this.f1716c != 1) {
                while (i < size) {
                    ((e) this.f1714a.get(i)).a();
                    i++;
                }
                return;
            }
            while (i < size) {
                ((e) this.f1714a.get(i)).b();
                i++;
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(o oVar);
    }

    public static class i {
    }

    public d(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1700a = reentrantReadWriteLock;
        this.f1705f = cVar.f1711a;
        int i10 = cVar.f1712b;
        this.g = i10;
        this.f1706h = cVar.f1713c;
        this.f1703d = new Handler(Looper.getMainLooper());
        this.f1701b = new s.c(0);
        a aVar = new a(this);
        this.f1704e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1702c = 0;
            } catch (Throwable th2) {
                this.f1700a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.a();
        }
    }

    public static d a() {
        d dVar;
        synchronized (i) {
            dVar = f1699j;
            k.U(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean c() {
        return f1699j != null;
    }

    public final int b() {
        this.f1700a.readLock().lock();
        try {
            return this.f1702c;
        } finally {
            this.f1700a.readLock().unlock();
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public final void e() {
        boolean z = true;
        if (this.g != 1) {
            z = false;
        }
        k.U(z, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!d()) {
            this.f1700a.writeLock().lock();
            try {
                if (this.f1702c != 0) {
                    this.f1702c = 0;
                    this.f1700a.writeLock().unlock();
                    a aVar = this.f1704e;
                    Objects.requireNonNull(aVar);
                    try {
                        aVar.f1710a.f1705f.a(new a.C0013a());
                    } catch (Throwable th2) {
                        aVar.f1710a.f(th2);
                    }
                }
            } finally {
                this.f1700a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.Set<androidx.emoji2.text.d$e>, s.c] */
    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f1700a.writeLock().lock();
        try {
            this.f1702c = 2;
            arrayList.addAll(this.f1701b);
            this.f1701b.clear();
            this.f1700a.writeLock().unlock();
            this.f1703d.post(new f(arrayList, this.f1702c, th2));
        } catch (Throwable th3) {
            this.f1700a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.Set<androidx.emoji2.text.d$e>, s.c] */
    public final void g() {
        ArrayList arrayList = new ArrayList();
        this.f1700a.writeLock().lock();
        try {
            this.f1702c = 1;
            arrayList.addAll(this.f1701b);
            this.f1701b.clear();
            this.f1700a.writeLock().unlock();
            this.f1703d.post(new f(arrayList, this.f1702c, (Throwable) null));
        } catch (Throwable th2) {
            this.f1700a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: android.text.Spannable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: android.text.SpannableString} */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x010a, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ee, code lost:
        if (r8.b(r1, r11, r0, r10.f1734d.f1759b) != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f0, code lost:
        if (r6 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f2, code lost:
        r6 = new android.text.SpannableString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f7, code lost:
        r4 = r10.f1734d.f1759b;
        java.util.Objects.requireNonNull(r8.f1726a);
        r6.setSpan(new androidx.emoji2.text.q(r4), r11, r0, 33);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb A[Catch:{ all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence i(java.lang.CharSequence r17, int r18, int r19) {
        /*
            r16 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r16.d()
            java.lang.String r4 = "Not initialized yet"
            c3.k.U(r3, r4)
            java.lang.String r3 = "start cannot be negative"
            c3.k.Q(r0, r3)
            java.lang.String r3 = "end cannot be negative"
            c3.k.Q(r2, r3)
            r3 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r4 = "maxEmojiCount cannot be negative"
            c3.k.Q(r3, r4)
            r5 = 1
            if (r0 > r2) goto L_0x0026
            r6 = r5
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            java.lang.String r7 = "start should be <= than end"
            c3.k.O(r6, r7)
            r6 = 0
            if (r1 != 0) goto L_0x0030
            return r6
        L_0x0030:
            int r7 = r17.length()
            if (r0 > r7) goto L_0x0038
            r7 = r5
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            java.lang.String r8 = "start should be < than charSequence length"
            c3.k.O(r7, r8)
            int r7 = r17.length()
            if (r2 > r7) goto L_0x0046
            r7 = r5
            goto L_0x0047
        L_0x0046:
            r7 = 0
        L_0x0047:
            java.lang.String r8 = "end should be < than charSequence length"
            c3.k.O(r7, r8)
            int r7 = r17.length()
            if (r7 == 0) goto L_0x0185
            if (r0 != r2) goto L_0x0056
            goto L_0x0185
        L_0x0056:
            r7 = r16
            androidx.emoji2.text.d$a r8 = r7.f1704e
            androidx.emoji2.text.h r8 = r8.f1707b
            java.util.Objects.requireNonNull(r8)
            boolean r9 = r1 instanceof androidx.emoji2.text.p
            if (r9 == 0) goto L_0x0069
            r10 = r1
            androidx.emoji2.text.p r10 = (androidx.emoji2.text.p) r10
            r10.a()
        L_0x0069:
            if (r9 != 0) goto L_0x0089
            boolean r10 = r1 instanceof android.text.Spannable     // Catch:{ all -> 0x017c }
            if (r10 == 0) goto L_0x0070
            goto L_0x0089
        L_0x0070:
            boolean r10 = r1 instanceof android.text.Spanned     // Catch:{ all -> 0x017c }
            if (r10 == 0) goto L_0x008c
            r10 = r1
            android.text.Spanned r10 = (android.text.Spanned) r10     // Catch:{ all -> 0x017c }
            int r11 = r0 + -1
            int r12 = r2 + 1
            java.lang.Class<androidx.emoji2.text.i> r13 = androidx.emoji2.text.i.class
            int r10 = r10.nextSpanTransition(r11, r12, r13)     // Catch:{ all -> 0x017c }
            if (r10 > r2) goto L_0x008c
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x017c }
            r6.<init>(r1)     // Catch:{ all -> 0x017c }
            goto L_0x008c
        L_0x0089:
            r6 = r1
            android.text.Spannable r6 = (android.text.Spannable) r6     // Catch:{ all -> 0x017c }
        L_0x008c:
            if (r6 == 0) goto L_0x00b9
            java.lang.Class<androidx.emoji2.text.i> r10 = androidx.emoji2.text.i.class
            java.lang.Object[] r10 = r6.getSpans(r0, r2, r10)     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.i[] r10 = (androidx.emoji2.text.i[]) r10     // Catch:{ all -> 0x017c }
            if (r10 == 0) goto L_0x00b9
            int r11 = r10.length     // Catch:{ all -> 0x017c }
            if (r11 <= 0) goto L_0x00b9
            int r11 = r10.length     // Catch:{ all -> 0x017c }
            r12 = 0
        L_0x009d:
            if (r12 >= r11) goto L_0x00b9
            r13 = r10[r12]     // Catch:{ all -> 0x017c }
            int r14 = r6.getSpanStart(r13)     // Catch:{ all -> 0x017c }
            int r15 = r6.getSpanEnd(r13)     // Catch:{ all -> 0x017c }
            if (r14 == r2) goto L_0x00ae
            r6.removeSpan(r13)     // Catch:{ all -> 0x017c }
        L_0x00ae:
            int r0 = java.lang.Math.min(r14, r0)     // Catch:{ all -> 0x017c }
            int r2 = java.lang.Math.max(r15, r2)     // Catch:{ all -> 0x017c }
            int r12 = r12 + 1
            goto L_0x009d
        L_0x00b9:
            if (r0 == r2) goto L_0x0173
            int r10 = r17.length()     // Catch:{ all -> 0x017c }
            if (r0 < r10) goto L_0x00c3
            goto L_0x0173
        L_0x00c3:
            androidx.emoji2.text.h$b r10 = new androidx.emoji2.text.h$b     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.o r11 = r8.f1727b     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.o$a r11 = r11.f1756c     // Catch:{ all -> 0x017c }
            r10.<init>(r11)     // Catch:{ all -> 0x017c }
            int r11 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x017c }
            r12 = 0
        L_0x00d1:
            r13 = r11
        L_0x00d2:
            r11 = r0
        L_0x00d3:
            r14 = 2
            r15 = 33
            if (r0 >= r2) goto L_0x0128
            if (r12 >= r3) goto L_0x0128
            int r4 = r10.a(r13)     // Catch:{ all -> 0x017c }
            if (r4 == r5) goto L_0x0118
            if (r4 == r14) goto L_0x010c
            r14 = 3
            if (r4 == r14) goto L_0x00e6
            goto L_0x00d3
        L_0x00e6:
            androidx.emoji2.text.o$a r4 = r10.f1734d     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.g r4 = r4.f1759b     // Catch:{ all -> 0x017c }
            boolean r4 = r8.b(r1, r11, r0, r4)     // Catch:{ all -> 0x017c }
            if (r4 != 0) goto L_0x010a
            if (r6 != 0) goto L_0x00f7
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch:{ all -> 0x017c }
            r6.<init>(r1)     // Catch:{ all -> 0x017c }
        L_0x00f7:
            androidx.emoji2.text.o$a r4 = r10.f1734d     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.g r4 = r4.f1759b     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.d$i r14 = r8.f1726a     // Catch:{ all -> 0x017c }
            java.util.Objects.requireNonNull(r14)     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.q r14 = new androidx.emoji2.text.q     // Catch:{ all -> 0x017c }
            r14.<init>(r4)     // Catch:{ all -> 0x017c }
            r6.setSpan(r14, r11, r0, r15)     // Catch:{ all -> 0x017c }
            int r12 = r12 + 1
        L_0x010a:
            r11 = r13
            goto L_0x00d1
        L_0x010c:
            int r4 = java.lang.Character.charCount(r13)     // Catch:{ all -> 0x017c }
            int r0 = r0 + r4
            if (r0 >= r2) goto L_0x00d3
            int r13 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x017c }
            goto L_0x00d3
        L_0x0118:
            int r0 = java.lang.Character.codePointAt(r1, r11)     // Catch:{ all -> 0x017c }
            int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x017c }
            int r0 = r0 + r11
            if (r0 >= r2) goto L_0x00d2
            int r13 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x017c }
            goto L_0x00d2
        L_0x0128:
            int r2 = r10.f1731a     // Catch:{ all -> 0x017c }
            if (r2 != r14) goto L_0x013e
            androidx.emoji2.text.o$a r2 = r10.f1733c     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.g r2 = r2.f1759b     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x013e
            int r2 = r10.f1736f     // Catch:{ all -> 0x017c }
            if (r2 > r5) goto L_0x013c
            boolean r2 = r10.c()     // Catch:{ all -> 0x017c }
            if (r2 == 0) goto L_0x013e
        L_0x013c:
            r4 = r5
            goto L_0x013f
        L_0x013e:
            r4 = 0
        L_0x013f:
            if (r4 == 0) goto L_0x0166
            if (r12 >= r3) goto L_0x0166
            androidx.emoji2.text.o$a r2 = r10.f1733c     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.g r2 = r2.f1759b     // Catch:{ all -> 0x017c }
            boolean r2 = r8.b(r1, r11, r0, r2)     // Catch:{ all -> 0x017c }
            if (r2 != 0) goto L_0x0166
            if (r6 != 0) goto L_0x0155
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch:{ all -> 0x017c }
            r2.<init>(r1)     // Catch:{ all -> 0x017c }
            r6 = r2
        L_0x0155:
            androidx.emoji2.text.o$a r2 = r10.f1733c     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.g r2 = r2.f1759b     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.d$i r3 = r8.f1726a     // Catch:{ all -> 0x017c }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x017c }
            androidx.emoji2.text.q r3 = new androidx.emoji2.text.q     // Catch:{ all -> 0x017c }
            r3.<init>(r2)     // Catch:{ all -> 0x017c }
            r6.setSpan(r3, r11, r0, r15)     // Catch:{ all -> 0x017c }
        L_0x0166:
            if (r6 != 0) goto L_0x0169
            r6 = r1
        L_0x0169:
            if (r9 == 0) goto L_0x0171
            r0 = r1
            androidx.emoji2.text.p r0 = (androidx.emoji2.text.p) r0
            r0.b()
        L_0x0171:
            r1 = r6
            goto L_0x017b
        L_0x0173:
            if (r9 == 0) goto L_0x017b
            r0 = r1
            androidx.emoji2.text.p r0 = (androidx.emoji2.text.p) r0
            r0.b()
        L_0x017b:
            return r1
        L_0x017c:
            r0 = move-exception
            if (r9 == 0) goto L_0x0184
            androidx.emoji2.text.p r1 = (androidx.emoji2.text.p) r1
            r1.b()
        L_0x0184:
            throw r0
        L_0x0185:
            r7 = r16
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.i(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.Set<androidx.emoji2.text.d$e>, s.c] */
    public final void j(e eVar) {
        k.S(eVar, "initCallback cannot be null");
        this.f1700a.writeLock().lock();
        try {
            if (this.f1702c != 1) {
                if (this.f1702c != 2) {
                    this.f1701b.add(eVar);
                }
            }
            this.f1703d.post(new f(Arrays.asList(new e[]{eVar}), this.f1702c, (Throwable) null));
        } finally {
            this.f1700a.writeLock().unlock();
        }
    }
}
