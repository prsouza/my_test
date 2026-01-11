package e8;

import a.a;
import android.content.Context;
import android.util.Log;
import c3.k;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import u2.e;
import x7.d0;

public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4767a;

    /* renamed from: b  reason: collision with root package name */
    public final j f4768b;

    /* renamed from: c  reason: collision with root package name */
    public final g f4769c;

    /* renamed from: d  reason: collision with root package name */
    public final k f4770d;

    /* renamed from: e  reason: collision with root package name */
    public final e f4771e;

    /* renamed from: f  reason: collision with root package name */
    public final b f4772f;
    public final d0 g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<c> f4773h;
    public final AtomicReference<TaskCompletionSource<c>> i = new AtomicReference<>(new TaskCompletionSource());

    public f(Context context, j jVar, k kVar, g gVar, e eVar, b bVar, d0 d0Var) {
        AtomicReference<c> atomicReference = new AtomicReference<>();
        this.f4773h = atomicReference;
        this.f4767a = context;
        this.f4768b = jVar;
        this.f4770d = kVar;
        this.f4769c = gVar;
        this.f4771e = eVar;
        this.f4772f = bVar;
        this.g = d0Var;
        atomicReference.set(a.b(kVar));
    }

    public final c a(d dVar) {
        c cVar = null;
        try {
            try {
                if (d.SKIP_CACHE_LOOKUP.equals(dVar)) {
                    return null;
                }
                try {
                    try {
                        JSONObject d10 = this.f4771e.d();
                        boolean z = false;
                        if (d10 != null) {
                            try {
                                try {
                                    c a10 = this.f4769c.a(d10);
                                    if (a10 != null) {
                                        try {
                                            c(d10, "Loaded cached settings: ");
                                        } catch (Exception e10) {
                                            e = e10;
                                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                            return cVar;
                                        }
                                        try {
                                            try {
                                                Objects.requireNonNull(this.f4770d);
                                                try {
                                                    long currentTimeMillis = System.currentTimeMillis();
                                                    try {
                                                        try {
                                                            if (!d.IGNORE_CACHE_EXPIRATION.equals(dVar)) {
                                                                try {
                                                                    if (a10.f4759c < currentTimeMillis) {
                                                                        try {
                                                                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                                                                z = true;
                                                                            }
                                                                            if (!z) {
                                                                                return null;
                                                                            }
                                                                            try {
                                                                                Log.v("FirebaseCrashlytics", "Cached settings have expired.", (Throwable) null);
                                                                                return null;
                                                                            } catch (Exception e11) {
                                                                                e = e11;
                                                                            }
                                                                        } catch (Exception e12) {
                                                                            e = e12;
                                                                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                                                            return cVar;
                                                                        }
                                                                    }
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                                                    return cVar;
                                                                }
                                                            }
                                                            try {
                                                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                                                    z = true;
                                                                }
                                                                if (z) {
                                                                    try {
                                                                        Log.v("FirebaseCrashlytics", "Returning cached settings.", (Throwable) null);
                                                                    } catch (Exception e14) {
                                                                        e = e14;
                                                                    }
                                                                }
                                                                return a10;
                                                            } catch (Exception e15) {
                                                                e = e15;
                                                                cVar = a10;
                                                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                                                return cVar;
                                                            }
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                                            return cVar;
                                                        }
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                                        return cVar;
                                                    }
                                                } catch (Exception e18) {
                                                    e = e18;
                                                    Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                                    return cVar;
                                                }
                                            } catch (Exception e19) {
                                                e = e19;
                                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                                return cVar;
                                            }
                                        } catch (Exception e20) {
                                            e = e20;
                                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                            return cVar;
                                        }
                                    } else {
                                        try {
                                            Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", (Throwable) null);
                                            return null;
                                        } catch (Exception e21) {
                                            e = e21;
                                        }
                                    }
                                } catch (Exception e22) {
                                    e = e22;
                                    Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                    return cVar;
                                }
                            } catch (Exception e23) {
                                e = e23;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                return cVar;
                            }
                        } else {
                            try {
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    z = true;
                                }
                                if (!z) {
                                    return null;
                                }
                                try {
                                    Log.d("FirebaseCrashlytics", "No cached settings data found.", (Throwable) null);
                                    return null;
                                } catch (Exception e24) {
                                    e = e24;
                                }
                            } catch (Exception e25) {
                                e = e25;
                                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                                return cVar;
                            }
                        }
                    } catch (Exception e26) {
                        e = e26;
                        Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                        return cVar;
                    }
                } catch (Exception e27) {
                    e = e27;
                    Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                    return cVar;
                }
            } catch (Exception e28) {
                e = e28;
                Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                return cVar;
            }
        } catch (Exception e29) {
            e = e29;
            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
            return cVar;
        }
    }

    public final c b() {
        return this.f4773h.get();
    }

    public final void c(JSONObject jSONObject, String str) throws JSONException {
        StringBuilder d10 = a.d(str);
        d10.append(jSONObject.toString());
        String sb2 = d10.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", sb2, (Throwable) null);
        }
    }
}
