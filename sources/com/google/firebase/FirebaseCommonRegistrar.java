package com.google.firebase;

import a5.z;
import a9.d;
import a9.g;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.github.mikephil.charting.BuildConfig;
import h1.c;
import h1.e;
import java.util.ArrayList;
import java.util.List;
import p8.h;
import p8.i;
import p8.j;
import s7.b;
import s7.f;
import s7.n;
import x8.s;

public class FirebaseCommonRegistrar implements f {
    public static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? BuildConfig.FLAVOR : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List<b<?>> getComponents() {
        Class<g> cls = g.class;
        ArrayList arrayList = new ArrayList();
        b.C0214b<g> a10 = b.a(cls);
        a10.a(new n(d.class, 2, 0));
        a10.f10945e = s.f13128c;
        arrayList.add(a10.b());
        int i = p8.g.f9719f;
        String str = null;
        b.C0214b bVar = new b.C0214b(p8.g.class, new Class[]{i.class, j.class}, (b.a) null);
        bVar.a(new n(Context.class, 1, 0));
        bVar.a(new n(k7.d.class, 1, 0));
        bVar.a(new n(h.class, 2, 0));
        bVar.a(new n(cls, 1, 1));
        bVar.f10945e = p8.f.f9718a;
        arrayList.add(bVar.b());
        arrayList.add(a9.f.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(a9.f.a("fire-core", "20.1.1"));
        arrayList.add(a9.f.a("device-name", b(Build.PRODUCT)));
        arrayList.add(a9.f.a("device-model", b(Build.DEVICE)));
        arrayList.add(a9.f.a("device-brand", b(Build.BRAND)));
        arrayList.add(a9.f.b("android-target-sdk", z.f133b));
        arrayList.add(a9.f.b("android-min-sdk", h1.b.f5655t));
        arrayList.add(a9.f.b("android-platform", e.f5673b));
        arrayList.add(a9.f.b("android-installer", c.f5661s));
        try {
            str = md.d.f8536t.toString();
        } catch (NoClassDefFoundError unused) {
        }
        if (str != null) {
            arrayList.add(a9.f.a("kotlin", str));
        }
        return arrayList;
    }
}
