package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import i3.m;
import j3.b;
import java.util.List;
import java.util.Map;
import y3.e;
import z3.f;

public final class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final k<?, ?> f3515k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f3516a;

    /* renamed from: b  reason: collision with root package name */
    public final h f3517b;

    /* renamed from: c  reason: collision with root package name */
    public final f f3518c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f3519d;

    /* renamed from: e  reason: collision with root package name */
    public final List<e<Object>> f3520e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, k<?, ?>> f3521f;
    public final m g;

    /* renamed from: h  reason: collision with root package name */
    public final e f3522h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public y3.f f3523j;

    public d(Context context, j3.b bVar, h hVar, f fVar, b.a aVar, Map<Class<?>, k<?, ?>> map, List<e<Object>> list, m mVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f3516a = bVar;
        this.f3517b = hVar;
        this.f3518c = fVar;
        this.f3519d = aVar;
        this.f3520e = list;
        this.f3521f = map;
        this.g = mVar;
        this.f3522h = eVar;
        this.i = i10;
    }
}
