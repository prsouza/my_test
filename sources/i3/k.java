package i3;

import android.util.Log;
import com.bumptech.glide.load.data.e;
import g3.h;
import g3.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.helpers.MessageFormatter;
import u3.c;

public final class k<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<DataType> f6079a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<DataType, ResourceType>> f6080b;

    /* renamed from: c  reason: collision with root package name */
    public final c<ResourceType, Transcode> f6081c;

    /* renamed from: d  reason: collision with root package name */
    public final m0.c<List<Throwable>> f6082d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6083e;

    public interface a<ResourceType> {
    }

    public k(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends j<DataType, ResourceType>> list, c<ResourceType, Transcode> cVar, m0.c<List<Throwable>> cVar2) {
        this.f6079a = cls;
        this.f6080b = list;
        this.f6081c = cVar;
        this.f6082d = cVar2;
        StringBuilder d10 = a.a.d("Failed DecodePath{");
        d10.append(cls.getSimpleName());
        d10.append("->");
        d10.append(cls2.getSimpleName());
        d10.append("->");
        d10.append(cls3.getSimpleName());
        d10.append("}");
        this.f6083e = d10.toString();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.bumptech.glide.load.data.e<DataType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: i3.w<ResourceType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: i3.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: i3.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: i3.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: i3.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: i3.w<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: i3.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: i3.v<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: i3.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: i3.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i3.w<Transcode> a(com.bumptech.glide.load.data.e<DataType> r11, int r12, int r13, g3.h r14, i3.k.a<ResourceType> r15) throws i3.r {
        /*
            r10 = this;
            m0.c<java.util.List<java.lang.Throwable>> r0 = r10.f6082d
            java.lang.Object r0 = r0.b()
            java.lang.String r1 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            i3.w r11 = r2.b(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0125 }
            m0.c<java.util.List<java.lang.Throwable>> r12 = r10.f6082d
            r12.a(r0)
            i3.j$c r15 = (i3.j.c) r15
            i3.j r12 = i3.j.this
            g3.a r13 = r15.f6071a
            java.util.Objects.requireNonNull(r12)
            java.lang.Object r15 = r11.get()
            java.lang.Class r7 = r15.getClass()
            g3.a r15 = g3.a.RESOURCE_DISK_CACHE
            r0 = 0
            if (r13 == r15) goto L_0x0045
            i3.i<R> r15 = r12.f6058a
            g3.l r15 = r15.f(r7)
            com.bumptech.glide.d r1 = r12.f6065w
            int r2 = r12.A
            int r3 = r12.B
            i3.w r1 = r15.a(r1, r11, r2, r3)
            r6 = r15
            r15 = r1
            goto L_0x0047
        L_0x0045:
            r15 = r11
            r6 = r0
        L_0x0047:
            boolean r1 = r11.equals(r15)
            if (r1 != 0) goto L_0x0050
            r11.d()
        L_0x0050:
            i3.i<R> r11 = r12.f6058a
            com.bumptech.glide.d r11 = r11.f6044c
            com.bumptech.glide.h r11 = r11.f3517b
            x3.f r11 = r11.f3529d
            java.lang.Class r1 = r15.c()
            g3.k r11 = r11.a(r1)
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0066
            r11 = r2
            goto L_0x0067
        L_0x0066:
            r11 = r1
        L_0x0067:
            if (r11 == 0) goto L_0x008c
            i3.i<R> r11 = r12.f6058a
            com.bumptech.glide.d r11 = r11.f6044c
            com.bumptech.glide.h r11 = r11.f3517b
            x3.f r11 = r11.f3529d
            java.lang.Class r0 = r15.c()
            g3.k r0 = r11.a(r0)
            if (r0 == 0) goto L_0x0082
            g3.h r11 = r12.D
            g3.c r11 = r0.h(r11)
            goto L_0x008e
        L_0x0082:
            com.bumptech.glide.h$d r11 = new com.bumptech.glide.h$d
            java.lang.Class r12 = r15.c()
            r11.<init>(r12)
            throw r11
        L_0x008c:
            g3.c r11 = g3.c.NONE
        L_0x008e:
            r9 = r0
            i3.i<R> r0 = r12.f6058a
            g3.f r3 = r12.M
            java.util.List r0 = r0.c()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r0.size()
            r5 = r1
        L_0x009e:
            if (r5 >= r4) goto L_0x00b3
            java.lang.Object r8 = r0.get(r5)
            m3.o$a r8 = (m3.o.a) r8
            g3.f r8 = r8.f8426a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x00b0
            r1 = r2
            goto L_0x00b3
        L_0x00b0:
            int r5 = r5 + 1
            goto L_0x009e
        L_0x00b3:
            r0 = r1 ^ 1
            i3.l r1 = r12.C
            boolean r13 = r1.d(r0, r13, r11)
            if (r13 == 0) goto L_0x011e
            if (r9 == 0) goto L_0x0110
            int[] r13 = i3.j.a.f6070c
            int r0 = r11.ordinal()
            r13 = r13[r0]
            if (r13 == r2) goto L_0x00fa
            r0 = 2
            if (r13 != r0) goto L_0x00e3
            i3.y r11 = new i3.y
            i3.i<R> r13 = r12.f6058a
            com.bumptech.glide.d r13 = r13.f6044c
            j3.b r1 = r13.f3516a
            g3.f r2 = r12.M
            g3.f r3 = r12.f6066x
            int r4 = r12.A
            int r5 = r12.B
            g3.h r8 = r12.D
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0103
        L_0x00e3:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown strategy: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L_0x00fa:
            i3.f r11 = new i3.f
            g3.f r13 = r12.M
            g3.f r0 = r12.f6066x
            r11.<init>(r13, r0)
        L_0x0103:
            i3.v r15 = i3.v.a(r15)
            i3.j$d<?> r12 = r12.f6063u
            r12.f6073a = r11
            r12.f6074b = r9
            r12.f6075c = r15
            goto L_0x011e
        L_0x0110:
            com.bumptech.glide.h$d r11 = new com.bumptech.glide.h$d
            java.lang.Object r12 = r15.get()
            java.lang.Class r12 = r12.getClass()
            r11.<init>(r12)
            throw r11
        L_0x011e:
            u3.c<ResourceType, Transcode> r11 = r10.f6081c
            i3.w r11 = r11.b(r15, r14)
            return r11
        L_0x0125:
            r11 = move-exception
            m0.c<java.util.List<java.lang.Throwable>> r12 = r10.f6082d
            r12.a(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.k.a(com.bumptech.glide.load.data.e, int, int, g3.h, i3.k$a):i3.w");
    }

    public final w<ResourceType> b(e<DataType> eVar, int i, int i10, h hVar, List<Throwable> list) throws r {
        int size = this.f6080b.size();
        w<ResourceType> wVar = null;
        for (int i11 = 0; i11 < size; i11++) {
            j jVar = (j) this.f6080b.get(i11);
            try {
                if (jVar.a(eVar.a(), hVar)) {
                    wVar = jVar.b(eVar.a(), i, i10, hVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + jVar, e10);
                }
                list.add(e10);
            }
            if (wVar != null) {
                break;
            }
        }
        if (wVar != null) {
            return wVar;
        }
        throw new r(this.f6083e, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("DecodePath{ dataClass=");
        d10.append(this.f6079a);
        d10.append(", decoders=");
        d10.append(this.f6080b);
        d10.append(", transcoder=");
        d10.append(this.f6081c);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
