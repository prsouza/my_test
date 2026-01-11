package yi;

import b.k;
import e6.e;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public k f13668a;

    /* renamed from: b  reason: collision with root package name */
    public bj.a f13669b;

    /* renamed from: c  reason: collision with root package name */
    public Map<Integer, Long> f13670c;

    /* renamed from: d  reason: collision with root package name */
    public long f13671d;

    /* renamed from: e  reason: collision with root package name */
    public final Stack<Long> f13672e;

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, ? extends c> f13673f;
    public long g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f13674h;
    public final OutputStream i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<String, Object> f13675j;

    public a() {
        this(d.a(), 0, new byte[128000], (OutputStream) null, new HashMap());
    }

    public a(Map<Integer, ? extends c> map, long j10, byte[] bArr, OutputStream outputStream, HashMap<String, Object> hashMap) {
        e.D(map, "opcodes");
        e.D(bArr, "ram");
        e.D(hashMap, "external");
        this.f13673f = map;
        this.g = j10;
        this.f13674h = bArr;
        this.i = outputStream;
        this.f13675j = hashMap;
        this.f13672e = new Stack<>();
    }

    public final bj.a a() {
        bj.a aVar = this.f13669b;
        if (aVar != null) {
            return aVar;
        }
        e.c0("page");
        throw null;
    }

    public final k b() {
        k kVar = this.f13668a;
        if (kVar != null) {
            return kVar;
        }
        e.c0("permissions");
        throw null;
    }
}
