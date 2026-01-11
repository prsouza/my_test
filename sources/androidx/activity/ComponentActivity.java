package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.f;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.q;
import androidx.lifecycle.q0;
import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.savedstate.a;
import c0.g;
import f.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends g implements y0, q, androidx.savedstate.c, e, androidx.activity.result.e {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    /* access modifiers changed from: private */
    public final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final e.a mContextAwareHelper;
    private w0.b mDefaultFactory;
    private final b0 mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final androidx.savedstate.b mSavedStateRegistryController;
    private x0 mViewModelStore;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {
        public b() {
        }

        public final <I, O> void c(int i10, f.a aVar, Object obj) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0073a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new b(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(obj);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                c0.b.b(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                f fVar = (f) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = fVar.f813a;
                    Intent intent = fVar.f814b;
                    int i11 = fVar.f815c;
                    int i12 = fVar.f816s;
                    int i13 = c0.b.f3053c;
                    componentActivity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new c(this, i10, e10));
                }
            } else {
                int i14 = c0.b.f3053c;
                componentActivity.startActivityForResult(a10, i10, bundle2);
            }
        }
    }

    public class c implements a.b {
        public c() {
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARNING: type inference failed for: r3v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        public final Bundle a() {
            Bundle bundle = new Bundle();
            ActivityResultRegistry access$100 = ComponentActivity.this.mActivityResultRegistry;
            Objects.requireNonNull(access$100);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(access$100.f789c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(access$100.f789c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(access$100.f791e));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) access$100.f793h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", access$100.f787a);
            return bundle;
        }
    }

    public class d implements e.b {
        public d() {
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARNING: type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
        /* JADX WARNING: type inference failed for: r3v13, types: [java.util.Map<java.lang.Integer, java.lang.String>, java.util.HashMap] */
        public final void a(Context context) {
            Bundle a10 = ComponentActivity.this.getSavedStateRegistry().a(ComponentActivity.ACTIVITY_RESULT_TAG);
            if (a10 != null) {
                ActivityResultRegistry access$100 = ComponentActivity.this.mActivityResultRegistry;
                Objects.requireNonNull(access$100);
                ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList != null && integerArrayList != null) {
                    access$100.f791e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    access$100.f787a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    access$100.f793h.putAll(a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        String str = stringArrayList.get(i);
                        if (access$100.f789c.containsKey(str)) {
                            Integer num = (Integer) access$100.f789c.remove(str);
                            if (!access$100.f793h.containsKey(str)) {
                                access$100.f788b.remove(num);
                            }
                        }
                        access$100.a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                    }
                }
            }
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f764a;

        /* renamed from: b  reason: collision with root package name */
        public x0 f765b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new e.a();
        this.mLifecycleRegistry = new b0(this);
        this.mSavedStateRegistryController = new androidx.savedstate.b(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().a(new y() {
                public final void c(a0 a0Var, r.b bVar) {
                    if (bVar == r.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new y() {
                public final void c(a0 a0Var, r.b bVar) {
                    if (bVar == r.b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f4513b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new y() {
                public final void c(a0 a0Var, r.b bVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            if (i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new c());
            addOnContextAvailableListener(new d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        a.b.C0(getWindow().getDecorView(), this);
        ad.c.p0(getWindow().getDecorView(), this);
        ad.c.q0(getWindow().getDecorView(), this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Set<e.b>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void addOnContextAvailableListener(e.b bVar) {
        e.a aVar = this.mContextAwareHelper;
        if (aVar.f4513b != null) {
            bVar.a(aVar.f4513b);
        }
        aVar.f4512a.add(bVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f765b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new x0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public w0.b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new s0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f764a;
        }
        return null;
    }

    public r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2612b;
    }

    public x0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public void onActivityResult(int i, int i10, Intent intent) {
        if (!this.mActivityResultRegistry.b(i, i10, intent)) {
            super.onActivityResult(i, i10, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.b();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.Set<e.b>, java.util.concurrent.CopyOnWriteArraySet] */
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.a(bundle);
        e.a aVar = this.mContextAwareHelper;
        aVar.f4513b = this;
        Iterator it = aVar.f4512a.iterator();
        while (it.hasNext()) {
            ((e.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        q0.c(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        x0 x0Var = this.mViewModelStore;
        if (x0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            x0Var = eVar.f765b;
        }
        if (x0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f764a = onRetainCustomNonConfigurationInstance;
        eVar2.f765b = x0Var;
        return eVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        r lifecycle = getLifecycle();
        if (lifecycle instanceof b0) {
            ((b0) lifecycle).k(r.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f4513b;
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        StringBuilder d10 = a.a.d("activity_rq#");
        d10.append(this.mNextLocalRequestCode.getAndIncrement());
        return activityResultRegistry.d(d10.toString(), this, aVar, bVar);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.Set<e.b>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void removeOnContextAvailableListener(e.b bVar) {
        this.mContextAwareHelper.f4512a.remove(bVar);
    }

    public void reportFullyDrawn() {
        try {
            if (o1.a.a()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12, bundle);
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
