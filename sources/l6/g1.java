package l6;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import m3.u;
import o6.w;

public final class g1 {
    public static final u g = new u("ExtractorSessionStoreView");

    /* renamed from: a  reason: collision with root package name */
    public final a0 f7864a;

    /* renamed from: b  reason: collision with root package name */
    public final w f7865b;

    /* renamed from: c  reason: collision with root package name */
    public final x0 f7866c;

    /* renamed from: d  reason: collision with root package name */
    public final w f7867d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f7868e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final ReentrantLock f7869f = new ReentrantLock();

    public g1(a0 a0Var, w wVar, x0 x0Var, w wVar2) {
        this.f7864a = a0Var;
        this.f7865b = wVar;
        this.f7866c = x0Var;
        this.f7867d = wVar2;
    }

    public static String d(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new t0("Session without pack received.");
    }

    public final void a() {
        this.f7869f.unlock();
    }

    public final d1 b(int i) {
        HashMap hashMap = this.f7868e;
        Integer valueOf = Integer.valueOf(i);
        d1 d1Var = (d1) hashMap.get(valueOf);
        if (d1Var != null) {
            return d1Var;
        }
        throw new t0(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    public final Object c(f1 f1Var) {
        try {
            this.f7869f.lock();
            return f1Var.zza();
        } finally {
            this.f7869f.unlock();
        }
    }
}
