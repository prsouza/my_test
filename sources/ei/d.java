package ei;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import ei.c;
import fi.a;
import fi.b;
import java.util.Arrays;

public final class d implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Object f4848a;

    /* renamed from: b  reason: collision with root package name */
    public e f4849b;

    /* renamed from: c  reason: collision with root package name */
    public c.a f4850c;

    /* renamed from: s  reason: collision with root package name */
    public c.b f4851s;

    public d(g gVar, e eVar, c.a aVar, c.b bVar) {
        Object obj;
        if (gVar.getParentFragment() != null) {
            obj = gVar.getParentFragment();
        } else {
            obj = gVar.getActivity();
        }
        this.f4848a = obj;
        this.f4849b = eVar;
        this.f4850c = aVar;
        this.f4851s = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        fi.d dVar;
        e eVar = this.f4849b;
        int i10 = eVar.f4855d;
        if (i == -1) {
            String[] strArr = eVar.f4857f;
            c.b bVar = this.f4851s;
            if (bVar != null) {
                bVar.a();
            }
            Object obj = this.f4848a;
            if (obj instanceof Fragment) {
                ((Fragment) obj).requestPermissions(strArr, i10);
            } else if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.appcompat.app.c) {
                    dVar = new b((androidx.appcompat.app.c) activity);
                } else {
                    dVar = new a(activity);
                }
                dVar.a(i10, strArr);
            } else {
                throw new RuntimeException("Host must be an Activity or Fragment!");
            }
        } else {
            c.b bVar2 = this.f4851s;
            if (bVar2 != null) {
                bVar2.b();
            }
            c.a aVar = this.f4850c;
            if (aVar != null) {
                e eVar2 = this.f4849b;
                int i11 = eVar2.f4855d;
                Arrays.asList(eVar2.f4857f);
                aVar.a();
            }
        }
    }

    public d(f fVar, e eVar, c.a aVar, c.b bVar) {
        this.f4848a = fVar.getActivity();
        this.f4849b = eVar;
        this.f4850c = aVar;
        this.f4851s = bVar;
    }
}
