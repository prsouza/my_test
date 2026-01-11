package p0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import n0.c;
import n0.x;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f9483a;

    public d(View view) {
        this.f9483a = view;
    }

    public final boolean a(f fVar, int i, Bundle bundle) {
        c.b bVar;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                fVar.f9484a.c();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.f9484a.a();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(fVar.f9484a.getDescription(), new ClipData.Item(fVar.f9484a.b()));
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new c.a(clipData, 2);
        } else {
            bVar = new c.C0162c(clipData, 2);
        }
        bVar.b(fVar.f9484a.d());
        bVar.setExtras(bundle);
        if (x.l(this.f9483a, bVar.a()) == null) {
            return true;
        }
        return false;
    }
}
