package c3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import p002if.v;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f3122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3123b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3124c = "7e9ce4d0e81a8ad05172642ae6f169df";

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f3125s = null;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ e f3126t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f3127u;

    public class a implements n {
        public a() {
        }

        public final void a(SQLiteDatabase sQLiteDatabase) {
            c cVar = c.this;
            cVar.f3127u.f3132c.w0(sQLiteDatabase, "store", "device_id", cVar.f3126t.g);
            c cVar2 = c.this;
            cVar2.f3127u.f3132c.w0(sQLiteDatabase, "store", "user_id", cVar2.f3126t.f3135f);
            c cVar3 = c.this;
            cVar3.f3127u.f3132c.w0(sQLiteDatabase, "long_store", "opt_out", Long.valueOf(cVar3.f3126t.i ? 1 : 0));
            c cVar4 = c.this;
            cVar4.f3127u.f3132c.w0(sQLiteDatabase, "long_store", "previous_session_id", Long.valueOf(cVar4.f3126t.f3139l));
            c cVar5 = c.this;
            cVar5.f3127u.f3132c.w0(sQLiteDatabase, "long_store", "last_event_time", Long.valueOf(cVar5.f3126t.f3143p));
        }
    }

    public c(e eVar, Context context, e eVar2) {
        this.f3127u = eVar;
        this.f3122a = context;
        this.f3126t = eVar2;
    }

    public final void run() {
        e eVar = this.f3127u;
        if (!eVar.f3136h) {
            try {
                if (eVar.f3134e.equals("$default_instance")) {
                    e.v(this.f3122a);
                    e.w(this.f3122a);
                }
                this.f3127u.f3131b = new v();
                e eVar2 = this.f3127u;
                eVar2.f3145r = new o(this.f3122a);
                eVar2.g = e.a(eVar2);
                if (this.f3123b) {
                    p a10 = p.a();
                    e eVar3 = this.f3127u;
                    v vVar = eVar3.f3131b;
                    String str = this.f3124c;
                    String str2 = eVar3.g;
                    a10.f3204a = true;
                    a10.f3205b = str;
                    a10.f3206c = vVar;
                    a10.f3207d = str2;
                }
                this.f3127u.f3145r.b();
                String str3 = this.f3125s;
                if (str3 != null) {
                    this.f3126t.f3135f = str3;
                    this.f3127u.f3132c.v0("user_id", str3);
                } else {
                    this.f3126t.f3135f = this.f3127u.f3132c.T("user_id");
                }
                Long E = this.f3127u.f3132c.E("opt_out");
                this.f3127u.i = E != null && E.longValue() == 1;
                e eVar4 = this.f3127u;
                eVar4.f3144q = e.b(eVar4, "previous_session_id", -1);
                e eVar5 = this.f3127u;
                long j10 = eVar5.f3144q;
                if (j10 >= 0) {
                    eVar5.f3139l = j10;
                }
                eVar5.f3140m = e.b(eVar5, "sequence_number", 0);
                e eVar6 = this.f3127u;
                eVar6.f3141n = e.b(eVar6, "last_event_id", -1);
                e eVar7 = this.f3127u;
                eVar7.f3142o = e.b(eVar7, "last_identify_id", -1);
                e eVar8 = this.f3127u;
                eVar8.f3143p = e.b(eVar8, "last_event_time", -1);
                e eVar9 = this.f3127u;
                eVar9.f3132c.f3189c = new a();
                eVar9.f3136h = true;
            } catch (l e10) {
                Log.e("com.amplitude.api.AmplitudeClient", String.format("Failed to initialize Amplitude SDK due to: %s", new Object[]{e10.getMessage()}));
                p.a().b("Failed to initialize Amplitude SDK", e10);
                this.f3126t.f3133d = null;
            }
        }
    }
}
