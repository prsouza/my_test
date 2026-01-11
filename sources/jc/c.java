package jc;

import e6.e;
import net.jpountz.xxhash.XXHash64;
import net.jpountz.xxhash.XXHashFactory;
import tg.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f7143a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final b f7144b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f7145c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final tg.c f7146d = new tg.c();

    /* renamed from: e  reason: collision with root package name */
    public static final XXHash64 f7147e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f7148f;
    public static final d g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f7149h = new c();

    static {
        XXHash64 hash64 = XXHashFactory.safeInstance().hash64();
        f7147e = hash64;
        e.C(hash64, "xxHash64");
        f7148f = new d(128, hash64);
        e.C(hash64, "xxHash64");
        g = new d(256, hash64);
    }

    public final byte[] a(byte[] bArr) {
        byte[] digest;
        e.D(bArr, "$this$blake2b256");
        synchronized (f7143a) {
            digest = f7144b.digest(bArr);
        }
        return digest;
    }
}
