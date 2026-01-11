package io.nodle.cash.ui;

import ah.v;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import b9.c;
import b9.h;
import c3.k;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Tasks;
import d9.f;
import d9.g;
import e9.e;
import fb.h;
import ge.o0;
import h1.i;
import io.nodle.cash.R;
import io.nodle.sdk.android.Nodle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import ya.b;
import yd.t;
import za.d;

public final class CashApp extends h {

    /* renamed from: b  reason: collision with root package name */
    public b f6688b;

    public final void attachBaseContext(Context context) {
        e eVar;
        Class<?> cls;
        Field field;
        if (context != null) {
            g gVar = f.f4377a;
            try {
                Resources resources = context.getResources();
                e6.e.C(resources, "context.resources");
                eVar = new e(resources, f.f4379c);
                cls = context.getClass();
                field = cls.getDeclaredField("mResources");
                e6.e.C(field, "clazz.getDeclaredField(fieldName)");
            } catch (NoSuchFieldException e10) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass != null) {
                    field = jc.b.f(superclass);
                } else {
                    throw e10;
                }
            } catch (Exception unused) {
            }
            field.setAccessible(true);
            field.set(context, eVar);
            field.setAccessible(false);
        } else {
            context = null;
        }
        super.attachBaseContext(context);
    }

    public final void onCreate() {
        boolean z;
        JSONObject jSONObject;
        boolean z10;
        super.onCreate();
        h.a aVar = new h.a();
        aVar.f2923a = 14400;
        c a10 = c.a();
        e6.e.C(a10, "getInstance()");
        boolean z11 = false;
        Tasks.call(a10.f2914c, new b9.b(a10, new b9.h(aVar), 0));
        Context context = a10.f2912a;
        HashMap hashMap = new HashMap();
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
            } else {
                XmlResourceParser xml = resources.getXml(R.xml.remote_config_defaults);
                String str = null;
                String str2 = null;
                String str3 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    if (eventType == 2) {
                        str = xml.getName();
                    } else if (eventType == 3) {
                        if (xml.getName().equals("entry")) {
                            if (str2 == null || str3 == null) {
                                Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                            } else {
                                hashMap.put(str2, str3);
                            }
                            str2 = null;
                            str3 = null;
                        }
                        str = null;
                    } else if (eventType == 4 && str != null) {
                        char c10 = 65535;
                        int hashCode = str.hashCode();
                        if (hashCode != 106079) {
                            if (hashCode == 111972721) {
                                if (str.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                                    c10 = 1;
                                }
                            }
                        } else if (str.equals("key")) {
                            c10 = 0;
                        }
                        if (c10 == 0) {
                            str2 = xml.getText();
                        } else if (c10 != 1) {
                            Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                        } else {
                            str3 = xml.getText();
                        }
                    }
                }
            }
        } catch (IOException | XmlPullParserException e10) {
            Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e10);
        }
        try {
            Date date = c9.f.f3286f;
            new JSONObject();
            a10.f2917f.c(new c9.f(new JSONObject(hashMap), c9.f.f3286f, new JSONArray(), new JSONObject())).onSuccessTask(i.f5731s);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e11);
            Tasks.forResult(null);
        }
        d dVar = d.f14195a;
        Context applicationContext = getApplicationContext();
        e6.e.C(applicationContext, "cxt.applicationContext");
        Nodle.init(applicationContext);
        t tVar = new t();
        tVar.f13621a = Long.parseLong(v.K("detectedDevicesResetCacheInterval")) * ((long) 1000);
        ub.b[] bVarArr = {ub.b.DEBUG};
        int length = bVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (e6.e.r(bVarArr[i].getValue(), BuildConfig.BUILD_TYPE)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            tVar.f13621a = 30000;
        }
        try {
            jSONObject = new JSONObject(v.J(this, qa.e.DEVICE_CACHE));
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        ge.g.b(k.j(o0.f5433a), (pd.f) null, new za.f(this, jSONObject, tVar, (pd.d<? super za.f>) null), 3);
        ub.b[] bVarArr2 = {ub.b.DEBUG};
        int length2 = bVarArr2.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length2) {
                z10 = false;
                break;
            } else if (e6.e.r(bVarArr2[i10].getValue(), BuildConfig.BUILD_TYPE)) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        String str4 = z10 ? "3u6DwO9Pih2RuUcmdT-gbaueDxdY72etMzOir6q3cC4" : "4q5ozfQLN8jmIrNpjEiRG-H-kx_OAgCrUzhbO0jUE3U";
        g gVar = f.f4377a;
        if (str4.length() == 0) {
            z11 = true;
        }
        if (z11) {
            k.E0("Distribution and environment cannot be empty");
        }
        if (f.f4377a != null) {
            k.E0("Phrase has been already initialized");
        } else {
            Context applicationContext2 = getApplicationContext();
            e6.e.C(applicationContext2, "context.applicationContext");
            f.f4377a = new g(applicationContext2, str4);
        }
        g gVar2 = f.f4377a;
        if (gVar2 != null) {
            gVar2.c((d9.k) null);
        } else {
            k.E0("Phrase has not been initialized");
        }
    }
}
