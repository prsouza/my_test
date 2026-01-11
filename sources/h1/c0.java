package h1;

import a5.a0;
import ab.i;
import ah.v;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.lifecycle.k0;
import bb.g;
import e6.e;
import io.nodle.cash.ui.view.activity.EstimateActivity;
import io.nodle.cash.ui.viewmodel.HistoryDetailViewModel;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import pb.o;
import q.a;
import q4.b;
import r8.a;
import sb.j;
import u7.c;

public final /* synthetic */ class c0 implements a, a0.a, a.C0207a, k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5666b;

    public /* synthetic */ c0(Object obj, int i) {
        this.f5665a = i;
        this.f5666b = obj;
    }

    public final Object apply(Object obj) {
        Map map = (Map) this.f5666b;
        Cursor cursor = (Cursor) obj;
        b bVar = a0.f63u;
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new a0.b(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public final void b(r8.b bVar) {
        c cVar = (c) this.f5666b;
        Objects.requireNonNull(cVar);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", (Throwable) null);
        }
        cVar.f11723b.set((u7.a) bVar.get());
    }

    public final void d(Object obj) {
        int i;
        Context context;
        String str;
        String str2;
        switch (this.f5665a) {
            case 3:
                EstimateActivity estimateActivity = (EstimateActivity) this.f5666b;
                i iVar = (i) obj;
                int i10 = EstimateActivity.B;
                e.D(estimateActivity, "this$0");
                if (iVar != null) {
                    o.a aVar = o.f9867c;
                    o oVar = new o();
                    estimateActivity.z = oVar;
                    androidx.fragment.app.a0 supportFragmentManager = estimateActivity.getSupportFragmentManager();
                    o.a aVar2 = o.f9867c;
                    oVar.show(supportFragmentManager, o.f9868s);
                    return;
                }
                o oVar2 = estimateActivity.z;
                if (oVar2 != null) {
                    oVar2.dismiss();
                    return;
                }
                return;
            default:
                j jVar = (j) this.f5666b;
                HistoryDetailViewModel.a aVar3 = (HistoryDetailViewModel.a) obj;
                j.a aVar4 = j.f11071s;
                e.D(jVar, "this$0");
                String str3 = j.f11072t;
                Log.d(str3, "Activity Action: " + aVar3);
                if (aVar3 == null) {
                    i = -1;
                } else {
                    i = j.b.f11076a[aVar3.ordinal()];
                }
                String str4 = null;
                if (i == 1) {
                    HistoryDetailViewModel.b bVar = HistoryDetailViewModel.C;
                    HistoryDetailViewModel.D = null;
                    jVar.dismiss();
                    return;
                } else if (i == 2 && (context = jVar.getContext()) != null) {
                    HistoryDetailViewModel.b bVar2 = HistoryDetailViewModel.C;
                    sa.b bVar3 = HistoryDetailViewModel.D;
                    if ((bVar3 != null ? bVar3.f11041u : null) == null) {
                        if (!(bVar3 == null || (str2 = bVar3.f11044x) == null)) {
                            str4 = a8.a.c(v.K("subscan_explorer_url"), str2);
                        }
                        Log.d(str3, "SUBSCAN EXP URL: " + str4);
                        e.S(context, str4);
                        return;
                    }
                    if ((bVar3 != null ? bVar3.z : null) == g.REWARD) {
                        sa.b bVar4 = HistoryDetailViewModel.D;
                        if (bVar4 != null) {
                            str4 = bVar4.f11041u;
                        }
                        str = a8.a.c("https://explorer.nodle.com/block/", str4);
                    } else {
                        sa.b bVar5 = HistoryDetailViewModel.D;
                        Long valueOf = bVar5 != null ? Long.valueOf(bVar5.f11042v) : null;
                        sa.b bVar6 = HistoryDetailViewModel.D;
                        if (bVar6 != null) {
                            str4 = bVar6.f11043w;
                        }
                        str = "https://explorer.nodle.com/transfer/" + valueOf + "-" + str4;
                    }
                    Log.d(str3, "BLOCK EXP URL: " + str);
                    e.S(context, str);
                    return;
                } else {
                    return;
                }
        }
    }
}
