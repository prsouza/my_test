package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import io.nodle.cash.R;
import java.util.HashSet;
import java.util.Objects;
import n1.a;
import n1.b;
import n1.c;

public final class InitializationProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<java.lang.Class<? extends n1.b<?>>>] */
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            a b10 = a.b(context);
            Objects.requireNonNull(b10);
            try {
                Trace.beginSection("Startup");
                Bundle bundle = b10.f8867c.getPackageManager().getProviderInfo(new ComponentName(b10.f8867c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = b10.f8867c.getString(R.string.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String next : bundle.keySet()) {
                        if (string.equals(bundle.getString(next, (String) null))) {
                            Class<?> cls = Class.forName(next);
                            if (b.class.isAssignableFrom(cls)) {
                                b10.f8866b.add(cls);
                                b10.a(cls, hashSet);
                            }
                        }
                    }
                }
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e10) {
                throw new c(e10);
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            throw new c("Context cannot be null");
        }
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
