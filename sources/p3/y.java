package p3;

import android.graphics.Bitmap;
import c4.d;
import g3.h;
import g3.j;
import i3.w;
import j3.b;
import j3.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p3.m;
import p3.s;

public final class y implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f9646a;

    /* renamed from: b  reason: collision with root package name */
    public final b f9647b;

    public static class a implements m.b {

        /* renamed from: a  reason: collision with root package name */
        public final w f9648a;

        /* renamed from: b  reason: collision with root package name */
        public final d f9649b;

        public a(w wVar, d dVar) {
            this.f9648a = wVar;
            this.f9649b = dVar;
        }

        public final void a(c cVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.f9649b.f3230b;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.e(bitmap);
                }
                throw iOException;
            }
        }

        public final void b() {
            w wVar = this.f9648a;
            synchronized (wVar) {
                wVar.f9640c = wVar.f9638a.length;
            }
        }
    }

    public y(m mVar, b bVar) {
        this.f9646a = mVar;
        this.f9647b = bVar;
    }

    public final boolean a(Object obj, h hVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        Objects.requireNonNull(this.f9646a);
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.ArrayDeque, java.util.Queue<c4.d>] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.ArrayDeque, java.util.Queue<c4.d>] */
    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        boolean z;
        w wVar;
        d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof w) {
            z = false;
            wVar = (w) inputStream;
        } else {
            wVar = new w(inputStream, this.f9647b);
            z = true;
        }
        ? r42 = d.f3228c;
        synchronized (r42) {
            dVar = (d) r42.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        d dVar2 = dVar;
        dVar2.f3229a = wVar;
        c4.h hVar2 = new c4.h(dVar2);
        a aVar = new a(wVar, dVar2);
        try {
            m mVar = this.f9646a;
            w<Bitmap> a10 = mVar.a(new s.a(hVar2, mVar.f9613d, mVar.f9612c), i, i10, hVar, aVar);
            dVar2.f3230b = null;
            dVar2.f3229a = null;
            synchronized (r42) {
                r42.offer(dVar2);
            }
            if (z) {
                wVar.release();
            }
            return a10;
        } catch (Throwable th2) {
            dVar2.f3230b = null;
            dVar2.f3229a = null;
            ? r62 = d.f3228c;
            synchronized (r62) {
                r62.offer(dVar2);
                if (z) {
                    wVar.release();
                }
                throw th2;
            }
        }
    }
}
