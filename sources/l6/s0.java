package l6;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;
import m3.u;
import o6.c0;
import o6.j0;

public final class s0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final u f8015a = new u("ExtractionForegroundServiceConnection");

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8016b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Context f8017c;

    /* renamed from: d  reason: collision with root package name */
    public ExtractionForegroundService f8018d;

    /* renamed from: e  reason: collision with root package name */
    public Notification f8019e;

    public s0(Context context) {
        this.f8017c = context;
    }

    public final void a() {
        ArrayList arrayList;
        synchronized (this.f8016b) {
            arrayList = new ArrayList(this.f8016b);
            this.f8016b.clear();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j0 j0Var = (j0) arrayList.get(i);
            try {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                Parcel m10 = j0Var.m();
                int i10 = c0.f9319a;
                m10.writeInt(1);
                bundle.writeToParcel(m10, 0);
                m10.writeInt(1);
                bundle2.writeToParcel(m10, 0);
                j0Var.n(2, m10);
            } catch (RemoteException unused) {
                this.f8015a.c("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8015a.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((r0) iBinder).f8007a;
        this.f8018d = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.f8019e);
        a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
