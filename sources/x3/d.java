package x3;

import android.content.Intent;
import android.os.Bundle;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l6.a1;
import l6.b1;
import l6.c1;
import l6.d1;
import l6.e1;
import l6.f1;
import l6.g1;
import l6.v2;
import s.a;
import t.e;

public final class d implements f1 {

    /* renamed from: a  reason: collision with root package name */
    public Object f12768a;

    /* renamed from: b  reason: collision with root package name */
    public Object f12769b;

    public d(int i) {
        if (i != 2) {
            this.f12768a = new AtomicReference();
            this.f12769b = new a();
            return;
        }
        this.f12768a = null;
        this.f12769b = null;
    }

    public /* synthetic */ d(g1 g1Var, Bundle bundle) {
        this.f12768a = g1Var;
        this.f12769b = bundle;
    }

    public final Object zza() {
        e1 e1Var;
        g1 g1Var = (g1) this.f12768a;
        Bundle bundle = (Bundle) this.f12769b;
        Objects.requireNonNull(g1Var);
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        HashMap hashMap = g1Var.f7868e;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (hashMap.containsKey(valueOf)) {
            d1 b10 = g1Var.b(i);
            int i10 = bundle.getInt(b1.x("status", b10.f7816c.f7801a));
            c1 c1Var = b10.f7816c;
            int i11 = c1Var.f7804d;
            if (k.g1(i11, i10)) {
                g1.g.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(i11));
                c1 c1Var2 = b10.f7816c;
                String str = c1Var2.f7801a;
                int i12 = c1Var2.f7804d;
                if (i12 == 4) {
                    ((v2) g1Var.f7865b.zza()).c(i, str);
                } else if (i12 == 5) {
                    ((v2) g1Var.f7865b.zza()).b(i);
                } else if (i12 == 6) {
                    ((v2) g1Var.f7865b.zza()).f(Arrays.asList(new String[]{str}));
                }
            } else {
                c1Var.f7804d = i10;
                if (k.h1(i10)) {
                    g1Var.c(new e(g1Var, i));
                    g1Var.f7866c.a(b10.f7816c.f7801a);
                } else {
                    for (e1 e1Var2 : c1Var.f7806f) {
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b1.z("chunk_intents", b10.f7816c.f7801a, e1Var2.f7828a));
                        if (parcelableArrayList != null) {
                            for (int i13 = 0; i13 < parcelableArrayList.size(); i13++) {
                                if (!(parcelableArrayList.get(i13) == null || ((Intent) parcelableArrayList.get(i13)).getData() == null)) {
                                    ((a1) e1Var2.f7831d.get(i13)).f7784a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String d10 = g1.d(bundle);
            long j10 = bundle.getLong(b1.x("pack_version", d10));
            String string = bundle.getString(b1.x("pack_version_tag", d10), BuildConfig.FLAVOR);
            int i14 = bundle.getInt(b1.x("status", d10));
            long j11 = bundle.getLong(b1.x("total_bytes_to_download", d10));
            List<String> stringArrayList = bundle.getStringArrayList(b1.x("slice_ids", d10));
            ArrayList arrayList = new ArrayList();
            if (stringArrayList == null) {
                stringArrayList = Collections.emptyList();
            }
            for (String str2 : stringArrayList) {
                List<Intent> parcelableArrayList2 = bundle.getParcelableArrayList(b1.z("chunk_intents", d10, str2));
                ArrayList arrayList2 = new ArrayList();
                if (parcelableArrayList2 == null) {
                    parcelableArrayList2 = Collections.emptyList();
                }
                for (Intent intent : parcelableArrayList2) {
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new a1(z));
                    z = false;
                }
                String string2 = bundle.getString(b1.z("uncompressed_hash_sha256", d10, str2));
                long j12 = bundle.getLong(b1.z("uncompressed_size", d10, str2));
                int i15 = bundle.getInt(b1.z("patch_format", d10, str2), 0);
                if (i15 != 0) {
                    e1Var = new e1(str2, string2, j12, arrayList2, 0, i15);
                    z = false;
                } else {
                    z = false;
                    e1Var = new e1(str2, string2, j12, arrayList2, bundle.getInt(b1.z("compression_format", d10, str2), 0), 0);
                }
                arrayList.add(e1Var);
            }
            g1Var.f7868e.put(Integer.valueOf(i), new d1(i, bundle.getInt("app_version_code"), new c1(d10, j10, i14, j11, arrayList, string)));
        }
        return Boolean.TRUE;
    }
}
