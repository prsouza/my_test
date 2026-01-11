package androidx.work;

import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import u1.i;
import u1.y;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    public UUID f2634a;

    /* renamed from: b  reason: collision with root package name */
    public b f2635b;

    /* renamed from: c  reason: collision with root package name */
    public Executor f2636c;

    /* renamed from: d  reason: collision with root package name */
    public g2.a f2637d;

    /* renamed from: e  reason: collision with root package name */
    public y f2638e;

    /* renamed from: f  reason: collision with root package name */
    public i f2639f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f2640a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f2641b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, Executor executor, g2.a aVar, y yVar, i iVar) {
        this.f2634a = uuid;
        this.f2635b = bVar;
        new HashSet(collection);
        this.f2636c = executor;
        this.f2637d = aVar;
        this.f2638e = yVar;
        this.f2639f = iVar;
    }
}
