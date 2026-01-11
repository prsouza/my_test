package io.nodle.cash.ui.service;

import ah.v;
import android.app.Notification;
import android.content.Context;
import android.util.Log;
import c3.k;
import cb.c;
import com.google.firebase.messaging.FirebaseMessagingService;
import ge.d0;
import ge.g;
import ge.o0;
import io.nodle.cash.R;
import io.nodle.cash.data.remote.api.NotificationApi;
import io.nodle.cash.data.remote.api.NotificationApiKt;
import ja.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ki.z;
import l6.b1;
import md.m;
import p002if.b0;
import pd.d;
import rd.e;
import rd.i;
import ta.b;
import ta.f;
import ta.h;
import x8.b0;
import x8.y;
import xd.l;
import xd.p;

public final class FirebaseMessageService extends FirebaseMessagingService {

    /* renamed from: w  reason: collision with root package name */
    public static final a f6689w = new a();

    public static final class a {

        @e(c = "io.nodle.cash.ui.service.FirebaseMessageService$Companion$sendRegistrationToServer$1", f = "FirebaseMessageService.kt", l = {35}, m = "invokeSuspend")
        /* renamed from: io.nodle.cash.ui.service.FirebaseMessageService$a$a  reason: collision with other inner class name */
        public static final class C0113a extends i implements p<d0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f6690a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Context f6691b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ String f6692c;

            /* renamed from: s  reason: collision with root package name */
            public final /* synthetic */ String f6693s;

            @e(c = "io.nodle.cash.ui.service.FirebaseMessageService$Companion$sendRegistrationToServer$1$result$1", f = "FirebaseMessageService.kt", l = {38}, m = "invokeSuspend")
            /* renamed from: io.nodle.cash.ui.service.FirebaseMessageService$a$a$a  reason: collision with other inner class name */
            public static final class C0114a extends i implements l<d<? super z<b0>>, Object> {

                /* renamed from: a  reason: collision with root package name */
                public int f6694a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ Context f6695b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ String f6696c;

                /* renamed from: s  reason: collision with root package name */
                public final /* synthetic */ String f6697s;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0114a(Context context, String str, String str2, d<? super C0114a> dVar) {
                    super(1, dVar);
                    this.f6695b = context;
                    this.f6696c = str;
                    this.f6697s = str2;
                }

                public final d<m> create(d<?> dVar) {
                    return new C0114a(this.f6695b, this.f6696c, this.f6697s, dVar);
                }

                public final Object invokeSuspend(Object obj) {
                    qd.a aVar = qd.a.COROUTINE_SUSPENDED;
                    int i = this.f6694a;
                    if (i == 0) {
                        b1.w(obj);
                        Object b10 = f.f11451a.a(this.f6695b).b(NotificationApi.class);
                        e6.e.C(b10, "buildRetrofit(context).c…ificationApi::class.java)");
                        String str = this.f6696c;
                        p002if.z fCMTokenRequestBody = NotificationApiKt.getFCMTokenRequestBody(this.f6697s);
                        this.f6694a = 1;
                        obj = ((NotificationApi) b10).registerFCMToken(str, fCMTokenRequestBody, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else if (i == 1) {
                        b1.w(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }

                public final Object k(Object obj) {
                    return ((C0114a) create((d) obj)).invokeSuspend(m.f8555a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0113a(Context context, String str, String str2, d<? super C0113a> dVar) {
                super(2, dVar);
                this.f6691b = context;
                this.f6692c = str;
                this.f6693s = str2;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                return new C0113a(this.f6691b, this.f6692c, this.f6693s, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0113a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
            }

            public final Object invokeSuspend(Object obj) {
                qd.a aVar = qd.a.COROUTINE_SUSPENDED;
                int i = this.f6690a;
                if (i == 0) {
                    b1.w(obj);
                    f fVar = f.f11451a;
                    C0114a aVar2 = new C0114a(this.f6691b, this.f6692c, this.f6693s, (d<? super C0114a>) null);
                    this.f6690a = 1;
                    obj = fVar.c(aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    b1.w(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ta.e eVar = (ta.e) obj;
                if (eVar instanceof h) {
                    a aVar3 = FirebaseMessageService.f6689w;
                    T t10 = ((h) eVar).f11461b;
                    Log.d("FirebaseMessageService", "Success in register fcm token: " + t10);
                } else if (eVar instanceof b) {
                    a aVar4 = FirebaseMessageService.f6689w;
                    androidx.fragment.app.m.g("Failure in register fcm token: ", ((b) eVar).f11449c, "FirebaseMessageService");
                } else if (eVar instanceof ta.a) {
                    a aVar5 = FirebaseMessageService.f6689w;
                    androidx.fragment.app.m.g("Error in register fcm token: ", ((ta.a) eVar).f11446b, "FirebaseMessageService");
                }
                return m.f8555a;
            }
        }

        public final void a(Context context, String str) {
            e6.e.D(context, "cxt");
            a aVar = FirebaseMessageService.f6689w;
            androidx.fragment.app.m.g("FCM sendRegistrationToServer ", str, "FirebaseMessageService");
            String J = v.J(context, qa.e.NODLE_PUBLIC_KEY_5);
            if (J.length() > 0) {
                if (!(str == null || str.length() == 0)) {
                    String format = String.format("https://dev.nodle.io/contacts/request/register/%s", Arrays.copyOf(new Object[]{J}, 1));
                    e6.e.C(format, "format(format, *args)");
                    g.b(k.j(o0.f5434b), (pd.f) null, new C0113a(context, format, str, (d<? super C0113a>) null), 3);
                    return;
                }
            }
            Log.e("FirebaseMessageService", "FATAL ERROR: No nodle public key or firebase token!");
        }
    }

    static {
        Class<FirebaseMessageService> cls = FirebaseMessageService.class;
    }

    public final void d(x8.b0 b0Var) {
        x8.b0 b0Var2 = b0Var;
        String string = b0Var2.f13023a.getString("from");
        e6.e.B(string);
        Log.d("FirebaseMessageService", "From: " + string);
        HashMap hashMap = new HashMap();
        Map<String, String> data = b0Var.getData();
        e6.e.C(data, "remoteMessage.data");
        boolean z = true;
        if (!((s.g) data).isEmpty()) {
            Map<String, String> data2 = b0Var.getData();
            Log.d("FirebaseMessageService", "Message data payload: " + data2);
            hashMap.putAll(b0Var.getData());
            cb.e eVar = cb.e.f3332a;
            Context applicationContext = getApplicationContext();
            e6.e.C(applicationContext, "applicationContext");
            Log.d("e", "data: " + hashMap);
            if (hashMap.containsKey("nodle.v1.custom_notif_url")) {
                String str = (String) hashMap.get("nodle.v1.custom_notif_expiry");
                if (!(str == null || str.length() == 0)) {
                    if (System.currentTimeMillis() > Long.parseLong(str) * ((long) 1000)) {
                        Log.d("e", "Custom notification expired!!");
                    }
                }
                String str2 = (String) hashMap.get("nodle.v1.custom_notif_url");
                if (str2 != null) {
                    a.C0124a aVar = new a.C0124a(new ja.a(applicationContext, new e6.e()), new oa.b(applicationContext));
                    x8.d0 d0Var = new x8.d0(str2, applicationContext);
                    ma.a aVar2 = aVar.f7124b;
                    if (aVar2 != null) {
                        aVar2.a(d0Var, aVar.f7123a, true);
                    } else {
                        throw new RuntimeException("A provider must be initialized");
                    }
                }
            } else {
                CharSequence charSequence = (CharSequence) hashMap.get("nodle.v1.time");
                if (!(charSequence == null || charSequence.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    Object obj = hashMap.get("nodle.v1.time");
                    e6.e.B(obj);
                    hashMap.put("nodle.v1.time", String.valueOf(Long.parseLong((String) obj) * ((long) 1000)));
                }
                String str3 = (String) hashMap.get("nodle.v1.channel");
                if (!e6.e.r(str3, cb.a.NODLE_SCAN.getId())) {
                    cb.a aVar3 = cb.a.TRANSACTION;
                    if (e6.e.r(str3, aVar3.getId())) {
                        int a10 = eVar.a();
                        String str4 = (String) hashMap.get("nodle.v1.transfer.status");
                        String str5 = "0.00";
                        if (e6.e.r(str4, "transfer_credit_success")) {
                            String str6 = (String) hashMap.get("nodle.v1.transfer.nodl");
                            if (str6 == null) {
                                str6 = "0";
                            }
                            BigInteger bigInteger = new BigInteger(str6);
                            DecimalFormat decimalFormat = new DecimalFormat("0");
                            decimalFormat.setMaximumFractionDigits(11);
                            decimalFormat.setMinimumFractionDigits(2);
                            BigDecimal divide = new BigDecimal(bigInteger).divide(BigDecimal.TEN.pow(11));
                            e6.e.C(divide, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
                            String format = decimalFormat.format(divide);
                            if (format != null) {
                                str5 = format;
                            }
                            String string2 = applicationContext.getString(R.string.notifyTransactTitle);
                            e6.e.C(string2, "cxt.getString(R.string.notifyTransactTitle)");
                            String string3 = applicationContext.getString(R.string.notifyTransactCredit);
                            e6.e.C(string3, "cxt.getString(R.string.notifyTransactCredit)");
                            String format2 = String.format(string3, Arrays.copyOf(new Object[]{str5}, 1));
                            e6.e.C(format2, "format(format, *args)");
                            c0.m mVar = new c0.m(applicationContext, aVar3.getId());
                            mVar.f3102t.icon = 2131165406;
                            mVar.f(string2);
                            mVar.e(format2);
                            c0.l lVar = new c0.l();
                            lVar.l(format2);
                            mVar.i(lVar);
                            mVar.f3092j = 0;
                            mVar.g = c.c(applicationContext);
                            mVar.d(true);
                            Notification a11 = mVar.a();
                            e6.e.C(a11, "Builder(cxt, Channel.TRA…\n                .build()");
                            c.d(a11, applicationContext, a10);
                        } else if (e6.e.r(str4, "transfer_debit_success")) {
                            String str7 = (String) hashMap.get("nodle.v1.transfer.nodl");
                            if (str7 == null) {
                                str7 = "0";
                            }
                            BigInteger bigInteger2 = new BigInteger(str7);
                            DecimalFormat decimalFormat2 = new DecimalFormat("0");
                            decimalFormat2.setMaximumFractionDigits(11);
                            decimalFormat2.setMinimumFractionDigits(2);
                            BigDecimal divide2 = new BigDecimal(bigInteger2).divide(BigDecimal.TEN.pow(11));
                            e6.e.C(divide2, "rawNodle.toBigDecimal().…pow(AMOUNT_MAX_DECIMALS))");
                            String format3 = decimalFormat2.format(divide2);
                            if (format3 != null) {
                                str5 = format3;
                            }
                            String string4 = applicationContext.getString(R.string.notifyTransactTitle);
                            e6.e.C(string4, "cxt.getString(R.string.notifyTransactTitle)");
                            String string5 = applicationContext.getString(R.string.notifyTransactDebit);
                            e6.e.C(string5, "cxt.getString(R.string.notifyTransactDebit)");
                            String format4 = String.format(string5, Arrays.copyOf(new Object[]{str5}, 1));
                            e6.e.C(format4, "format(format, *args)");
                            c0.m mVar2 = new c0.m(applicationContext, aVar3.getId());
                            mVar2.f3102t.icon = 2131165407;
                            mVar2.f(string4);
                            mVar2.e(format4);
                            c0.l lVar2 = new c0.l();
                            lVar2.l(format4);
                            mVar2.i(lVar2);
                            mVar2.f3092j = 0;
                            mVar2.g = c.c(applicationContext);
                            mVar2.d(true);
                            Notification a12 = mVar2.a();
                            e6.e.C(a12, "Builder(cxt, Channel.TRA…\n                .build()");
                            c.d(a12, applicationContext, a10);
                        }
                    } else if (e6.e.r(str3, cb.a.GENERAL.getId())) {
                        eVar.c(applicationContext, hashMap);
                    }
                }
            }
        }
        if (b0Var2.f13025c == null && y.l(b0Var2.f13023a)) {
            b0Var2.f13025c = new b0.a(new y(b0Var2.f13023a));
        }
        b0.a aVar4 = b0Var2.f13025c;
        if (aVar4 != null) {
            androidx.fragment.app.m.g("Message Notification Body: ", aVar4.f13026a, "FirebaseMessageService");
        }
    }

    public final void e(String str) {
        e6.e.D(str, "token");
        Log.d("FirebaseMessageService", "Refreshed token: " + str);
        v.f0(this, qa.e.FCM_TOKEN, str);
        f6689w.a(this, str);
    }
}
