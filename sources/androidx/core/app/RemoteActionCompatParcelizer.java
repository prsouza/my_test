package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import r1.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1636a;
        if (aVar.i(1)) {
            obj = aVar.o();
        }
        remoteActionCompat.f1636a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1637b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.f1637b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1638c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f1638c = charSequence2;
        remoteActionCompat.f1639d = (PendingIntent) aVar.m(remoteActionCompat.f1639d, 4);
        boolean z = remoteActionCompat.f1640e;
        if (aVar.i(5)) {
            z = aVar.f();
        }
        remoteActionCompat.f1640e = z;
        boolean z10 = remoteActionCompat.f1641f;
        if (aVar.i(6)) {
            z10 = aVar.f();
        }
        remoteActionCompat.f1641f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f1636a;
        aVar.p(1);
        aVar.y(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1637b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1638c;
        aVar.p(3);
        aVar.s(charSequence2);
        aVar.w(remoteActionCompat.f1639d, 4);
        boolean z = remoteActionCompat.f1640e;
        aVar.p(5);
        aVar.q(z);
        boolean z10 = remoteActionCompat.f1641f;
        aVar.p(6);
        aVar.q(z10);
    }
}
