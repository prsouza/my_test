package h1;

import a5.a0;
import a9.f;
import ah.v;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseCommonRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import q.a;
import q4.e;

public final /* synthetic */ class b implements a, a0.a, f.a, e, OnCompleteListener {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ b f5652b = new b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ b f5653c = new b(1);

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ b f5654s = new b(2);

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ b f5655t = new b(3);

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ b f5656u = new b(4);

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ b f5657v = new b(5);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5658a;

    public /* synthetic */ b(int i) {
        this.f5658a = i;
    }

    public final Object apply(Object obj) {
        switch (this.f5658a) {
            case 0:
                return Boolean.valueOf(((l1.a) obj).U());
            case 1:
                q4.b bVar = a0.f63u;
                throw new b5.a("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 2:
                Cursor cursor = (Cursor) obj;
                q4.b bVar2 = a0.f63u;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (cursor.moveToNext()) {
                    byte[] blob = cursor.getBlob(0);
                    arrayList.add(blob);
                    i += blob.length;
                }
                byte[] bArr = new byte[i];
                int i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i11);
                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                    i10 += bArr2.length;
                }
                return bArr;
            default:
                return d8.a.f4354b.h((z7.a0) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    public final String c(Object obj) {
        return FirebaseCommonRegistrar.a((Context) obj);
    }

    public final void onComplete(Task task) {
        int i = v.H;
        e6.e.D(task, "it");
        if (task.isSuccessful()) {
            Log.d("v", "Remote config fetched!");
        } else {
            Log.e("v", "Failed to fetch Remote config.");
        }
    }
}
