package h1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import l1.c;
import l1.d;

public final class g0 implements d, c {

    /* renamed from: x  reason: collision with root package name */
    public static final TreeMap<Integer, g0> f5710x = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    public volatile String f5711a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f5712b;

    /* renamed from: c  reason: collision with root package name */
    public final double[] f5713c;

    /* renamed from: s  reason: collision with root package name */
    public final String[] f5714s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[][] f5715t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f5716u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5717v;

    /* renamed from: w  reason: collision with root package name */
    public int f5718w;

    public g0(int i) {
        this.f5717v = i;
        int i10 = i + 1;
        this.f5716u = new int[i10];
        this.f5712b = new long[i10];
        this.f5713c = new double[i10];
        this.f5714s = new String[i10];
        this.f5715t = new byte[i10][];
    }

    public static g0 e(String str, int i) {
        TreeMap<Integer, g0> treeMap = f5710x;
        synchronized (treeMap) {
            Map.Entry<Integer, g0> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                g0 value = ceilingEntry.getValue();
                value.f5711a = str;
                value.f5718w = i;
                return value;
            }
            g0 g0Var = new g0(i);
            g0Var.f5711a = str;
            g0Var.f5718w = i;
            return g0Var;
        }
    }

    public final void D(int i) {
        this.f5716u[i] = 1;
    }

    public final void G(int i, double d10) {
        this.f5716u[i] = 3;
        this.f5713c[i] = d10;
    }

    public final void X(int i, long j10) {
        this.f5716u[i] = 2;
        this.f5712b[i] = j10;
    }

    public final String a() {
        return this.f5711a;
    }

    public final void c(c cVar) {
        for (int i = 1; i <= this.f5718w; i++) {
            int i10 = this.f5716u[i];
            if (i10 == 1) {
                cVar.D(i);
            } else if (i10 == 2) {
                cVar.X(i, this.f5712b[i]);
            } else if (i10 == 3) {
                cVar.G(i, this.f5713c[i]);
            } else if (i10 == 4) {
                cVar.r(i, this.f5714s[i]);
            } else if (i10 == 5) {
                cVar.g0(i, this.f5715t[i]);
            }
        }
    }

    public final void close() {
    }

    public final void g0(int i, byte[] bArr) {
        this.f5716u[i] = 5;
        this.f5715t[i] = bArr;
    }

    public final void r(int i, String str) {
        this.f5716u[i] = 4;
        this.f5714s[i] = str;
    }

    public final void release() {
        TreeMap<Integer, g0> treeMap = f5710x;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f5717v), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
