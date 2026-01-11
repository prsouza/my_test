package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import g3.a;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class l<T> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f3578a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentResolver f3579b;

    /* renamed from: c  reason: collision with root package name */
    public T f3580c;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f3579b = contentResolver;
        this.f3578a = uri;
    }

    public final void b() {
        T t10 = this.f3580c;
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

    public abstract T d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public final a e() {
        return a.LOCAL;
    }

    public final void f(g gVar, d.a<? super T> aVar) {
        try {
            T d10 = d(this.f3578a, this.f3579b);
            this.f3580c = d10;
            aVar.d(d10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e10);
            }
            aVar.c(e10);
        }
    }
}
