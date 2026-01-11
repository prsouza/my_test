package l6;

import ah.v;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m3.u;
import n6.a;
import o6.w;
import t6.q;
import u1.n;

public final class m1 implements v2 {
    public static final u g = new u("FakeAssetPackService");

    /* renamed from: a  reason: collision with root package name */
    public final String f7930a;

    /* renamed from: b  reason: collision with root package name */
    public final x f7931b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f7932c;

    /* renamed from: d  reason: collision with root package name */
    public final z1 f7933d;

    /* renamed from: e  reason: collision with root package name */
    public final w f7934e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f7935f = new Handler(Looper.getMainLooper());

    static {
        new AtomicInteger(1);
    }

    public m1(File file, x xVar, Context context, z1 z1Var, w wVar) {
        this.f7930a = file.getAbsolutePath();
        this.f7931b = xVar;
        this.f7932c = context;
        this.f7933d = z1Var;
        this.f7934e = wVar;
    }

    public final void a(int i, String str, String str2, int i10) {
        g.e("notifyChunkTransferred", new Object[0]);
    }

    public final void b(int i) {
        g.e("notifySessionFailed", new Object[0]);
    }

    public final void c(int i, String str) {
        g.e("notifyModuleCompleted", new Object[0]);
        ((Executor) this.f7934e.zza()).execute(new l1(this, i, str));
    }

    public final q d(Map map) {
        g.e("syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        q qVar = new q();
        qVar.f(arrayList);
        return qVar;
    }

    public final q e(int i, String str, String str2, int i10) {
        g.e("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i10));
        q qVar = new q();
        try {
            for (File file : h(str)) {
                if (v.C0(file).equals(str2)) {
                    qVar.f(ParcelFileDescriptor.open(file, 268435456));
                    return qVar;
                }
            }
            throw new a(String.format("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e10) {
            g.g("getChunkFileDescriptor failed", e10);
            qVar.e(new a("Asset Slice file not found.", e10));
        } catch (a e11) {
            g.g("getChunkFileDescriptor failed", e11);
            qVar.e(e11);
        }
    }

    public final void f(List list) {
        g.e("cancelDownload(%s)", list);
    }

    public final Bundle g(int i, String str) throws a {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f7933d.a());
        bundle.putInt("session_id", i);
        File[] h10 = h(str);
        ArrayList arrayList = new ArrayList();
        int length = h10.length;
        long j10 = 0;
        int i10 = 0;
        while (i10 < length) {
            File file = h10[i10];
            j10 += file.length();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add((Object) null);
            String C0 = v.C0(file);
            bundle.putParcelableArrayList(b1.z("chunk_intents", str, C0), arrayList2);
            try {
                bundle.putString(b1.z("uncompressed_hash_sha256", str, C0), b1.y(Arrays.asList(new File[]{file})));
                bundle.putLong(b1.z("uncompressed_size", str, C0), file.length());
                arrayList.add(C0);
                i10++;
            } catch (NoSuchAlgorithmException e10) {
                throw new a("SHA256 algorithm not supported.", e10);
            } catch (IOException e11) {
                throw new a(String.format("Could not digest file: %s.", new Object[]{file}), e11);
            }
        }
        bundle.putStringArrayList(b1.x("slice_ids", str), arrayList);
        bundle.putLong(b1.x("pack_version", str), (long) this.f7933d.a());
        bundle.putInt(b1.x("status", str), 4);
        bundle.putInt(b1.x("error_code", str), 0);
        bundle.putLong(b1.x("bytes_downloaded", str), j10);
        bundle.putLong(b1.x("total_bytes_to_download", str), j10);
        bundle.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{str})));
        bundle.putLong("bytes_downloaded", j10);
        bundle.putLong("total_bytes_to_download", j10);
        this.f7935f.post(new n(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle), 1));
        return bundle;
    }

    public final File[] h(String str) throws a {
        File file = new File(this.f7930a);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new k1(str));
            if (listFiles != null) {
                if (r1 != 0) {
                    for (File C0 : listFiles) {
                        if (v.C0(C0).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new a(String.format("No main slice available for pack '%s'.", new Object[]{str}));
                }
                throw new a(String.format("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new a(String.format("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new a(String.format("Local testing directory '%s' not found.", new Object[]{file}));
    }

    public final void zzf() {
        g.e("keepAlive", new Object[0]);
    }
}
