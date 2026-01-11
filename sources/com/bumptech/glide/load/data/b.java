package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.a;
import java.io.IOException;

public abstract class b<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f3556a;

    /* renamed from: b  reason: collision with root package name */
    public final AssetManager f3557b;

    /* renamed from: c  reason: collision with root package name */
    public T f3558c;

    public b(AssetManager assetManager, String str) {
        this.f3557b = assetManager;
        this.f3556a = str;
    }

    public final void b() {
        T t10 = this.f3558c;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10) throws IOException;

    public final void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str) throws IOException;

    public final a e() {
        return a.LOCAL;
    }

    public final void f(g gVar, d.a<? super T> aVar) {
        try {
            T d10 = d(this.f3557b, this.f3556a);
            this.f3558c = d10;
            aVar.d(d10);
        } catch (IOException e10) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
            }
            aVar.c(e10);
        }
    }
}
