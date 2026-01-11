package k1;

import a7.f;
import android.content.SharedPreferences;
import android.util.Pair;
import h7.m;
import h7.q;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a implements SharedPreferences {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f7390a;

    /* renamed from: b  reason: collision with root package name */
    public final List<SharedPreferences.OnSharedPreferenceChangeListener> f7391b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7392c = "APP_PREFS";

    /* renamed from: d  reason: collision with root package name */
    public final a7.a f7393d;

    /* renamed from: e  reason: collision with root package name */
    public final a7.c f7394e;

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0129a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7395a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                k1.a$c[] r0 = k1.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7395a = r0
                k1.a$c r1 = k1.a.c.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7395a     // Catch:{ NoSuchFieldError -> 0x001d }
                k1.a$c r1 = k1.a.c.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7395a     // Catch:{ NoSuchFieldError -> 0x0028 }
                k1.a$c r1 = k1.a.c.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7395a     // Catch:{ NoSuchFieldError -> 0x0033 }
                k1.a$c r1 = k1.a.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7395a     // Catch:{ NoSuchFieldError -> 0x003e }
                k1.a$c r1 = k1.a.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7395a     // Catch:{ NoSuchFieldError -> 0x0049 }
                k1.a$c r1 = k1.a.c.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.a.C0129a.<clinit>():void");
        }
    }

    public static final class b implements SharedPreferences.Editor {

        /* renamed from: a  reason: collision with root package name */
        public final a f7396a;

        /* renamed from: b  reason: collision with root package name */
        public final SharedPreferences.Editor f7397b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f7398c;

        /* renamed from: d  reason: collision with root package name */
        public AtomicBoolean f7399d = new AtomicBoolean(false);

        public b(a aVar, SharedPreferences.Editor editor) {
            this.f7396a = aVar;
            this.f7397b = editor;
            this.f7398c = new CopyOnWriteArrayList();
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
        public final void a() {
            if (this.f7399d.getAndSet(false)) {
                for (String str : ((HashMap) this.f7396a.getAll()).keySet()) {
                    if (!this.f7398c.contains(str) && !this.f7396a.d(str)) {
                        this.f7397b.remove(this.f7396a.a(str));
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
        public final void apply() {
            a();
            this.f7397b.apply();
            b();
            this.f7398c.clear();
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<android.content.SharedPreferences$OnSharedPreferenceChangeListener>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
        public final void b() {
            Iterator it = this.f7396a.f7391b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f7398c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f7396a, (String) it2.next());
                }
            }
        }

        /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
        public final void c(String str, byte[] bArr) {
            if (!this.f7396a.d(str)) {
                this.f7398c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> b10 = this.f7396a.b(str, bArr);
                    this.f7397b.putString((String) b10.first, (String) b10.second);
                } catch (GeneralSecurityException e10) {
                    StringBuilder d10 = a.a.d("Could not encrypt data: ");
                    d10.append(e10.getMessage());
                    throw new SecurityException(d10.toString(), e10);
                }
            } else {
                throw new SecurityException(a8.a.c(str, " is a reserved key for the encryption keyset."));
            }
        }

        public final SharedPreferences.Editor clear() {
            this.f7399d.set(true);
            return this;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
        /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
        public final boolean commit() {
            a();
            try {
                return this.f7397b.commit();
            } finally {
                b();
                this.f7398c.clear();
            }
        }

        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : 0);
            c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.getId());
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.getId());
            allocate.putInt(i);
            c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.getId());
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
            /*
                r4 = this;
                if (r6 != 0) goto L_0x000d
                s.c r6 = new s.c
                r0 = 0
                r6.<init>(r0)
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            L_0x000d:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L_0x0020:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0038
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L_0x0020
            L_0x0038:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                k1.a$c r1 = k1.a.c.STRING_SET
                int r1 = r1.getId()
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x004b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x005f
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L_0x004b
            L_0x005f:
                byte[] r6 = r6.array()
                r4.c(r5, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: k1.a.b.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<java.lang.String>, java.util.concurrent.CopyOnWriteArrayList] */
        public final SharedPreferences.Editor remove(String str) {
            if (!this.f7396a.d(str)) {
                this.f7397b.remove(this.f7396a.a(str));
                this.f7398c.remove(str);
                return this;
            }
            throw new SecurityException(a8.a.c(str, " is a reserved key for the encryption keyset."));
        }
    }

    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        private c(int i) {
            this.mId = i;
        }

        public static c fromId(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum d {
        AES256_SIV(f.a("type.googleapis.com/google.crypto.tink.AesSivKey", ((q) r2.k()).g(), r1));
        
        private final f mDeterministicAeadKeyTemplate;

        private d(f fVar) {
            this.mDeterministicAeadKeyTemplate = fVar;
        }

        public f getKeyTemplate() {
            return this.mDeterministicAeadKeyTemplate;
        }
    }

    public enum e {
        AES256_GCM(f.a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((m) r2.k()).g(), r1));
        
        private final f mAeadKeyTemplate;

        private e(f fVar) {
            this.mAeadKeyTemplate = fVar;
        }

        public f getKeyTemplate() {
            return this.mAeadKeyTemplate;
        }
    }

    public a(SharedPreferences sharedPreferences, a7.a aVar, a7.c cVar) {
        this.f7390a = sharedPreferences;
        this.f7393d = aVar;
        this.f7394e = cVar;
        this.f7391b = new ArrayList();
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            byte[] a10 = this.f7394e.a(str.getBytes(StandardCharsets.UTF_8), this.f7392c.getBytes());
            Charset charset = j7.e.f7084a;
            return new String(j7.e.b(a10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        } catch (GeneralSecurityException e11) {
            StringBuilder d10 = a.a.d("Could not encrypt key. ");
            d10.append(e11.getMessage());
            throw new SecurityException(d10.toString(), e11);
        }
    }

    public final Pair<String, String> b(String str, byte[] bArr) throws GeneralSecurityException {
        String a10 = a(str);
        byte[] a11 = this.f7393d.a(bArr, a10.getBytes(StandardCharsets.UTF_8));
        Charset charset = j7.e.f7084a;
        try {
            return new Pair<>(a10, new String(j7.e.b(a11), "US-ASCII"));
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final Object c(String str) {
        if (!d(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String a10 = a(str);
                String string = this.f7390a.getString(a10, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f7393d.b(j7.e.a(string), a10.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (C0129a.f7395a[c.fromId(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        if (wrap.get() != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 6:
                        s.c cVar = new s.c(0);
                        while (wrap.hasRemaining()) {
                            int i10 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i10);
                            wrap.position(wrap.position() + i10);
                            cVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (cVar.f10815c != 1 || !"__NULL__".equals(cVar.f10814b[0])) {
                            return cVar;
                        }
                        return null;
                    default:
                        return null;
                }
            } catch (GeneralSecurityException e10) {
                StringBuilder d10 = a.a.d("Could not decrypt value. ");
                d10.append(e10.getMessage());
                throw new SecurityException(d10.toString(), e10);
            }
        } else {
            throw new SecurityException(a8.a.c(str, " is a reserved key for the encryption keyset."));
        }
    }

    public final boolean contains(String str) {
        if (!d(str)) {
            return this.f7390a.contains(a(str));
        }
        throw new SecurityException(a8.a.c(str, " is a reserved key for the encryption keyset."));
    }

    public final boolean d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public final SharedPreferences.Editor edit() {
        return new b(this, this.f7390a.edit());
    }

    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f7390a.getAll().entrySet()) {
            if (!d((String) next.getKey())) {
                try {
                    String str = new String(this.f7394e.b(j7.e.a((String) next.getKey()), this.f7392c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, c(str));
                } catch (GeneralSecurityException e10) {
                    StringBuilder d10 = a.a.d("Could not decrypt key. ");
                    d10.append(e10.getMessage());
                    throw new SecurityException(d10.toString(), e10);
                }
            }
        }
        return hashMap;
    }

    public final boolean getBoolean(String str, boolean z) {
        Object c10 = c(str);
        return (c10 == null || !(c10 instanceof Boolean)) ? z : ((Boolean) c10).booleanValue();
    }

    public final float getFloat(String str, float f10) {
        Object c10 = c(str);
        return (c10 == null || !(c10 instanceof Float)) ? f10 : ((Float) c10).floatValue();
    }

    public final int getInt(String str, int i) {
        Object c10 = c(str);
        return (c10 == null || !(c10 instanceof Integer)) ? i : ((Integer) c10).intValue();
    }

    public final long getLong(String str, long j10) {
        Object c10 = c(str);
        return (c10 == null || !(c10 instanceof Long)) ? j10 : ((Long) c10).longValue();
    }

    public final String getString(String str, String str2) {
        Object c10 = c(str);
        return (c10 == null || !(c10 instanceof String)) ? str2 : (String) c10;
    }

    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        Object c10 = c(str);
        if (c10 instanceof Set) {
            set2 = (Set) c10;
        } else {
            set2 = new s.c<>(0);
        }
        return set2.size() > 0 ? set2 : set;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<android.content.SharedPreferences$OnSharedPreferenceChangeListener>, java.util.ArrayList] */
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7391b.add(onSharedPreferenceChangeListener);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<android.content.SharedPreferences$OnSharedPreferenceChangeListener>, java.util.ArrayList] */
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f7391b.remove(onSharedPreferenceChangeListener);
    }
}
