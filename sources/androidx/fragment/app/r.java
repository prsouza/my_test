package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.e;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.b0;
import androidx.lifecycle.r;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.savedstate.c;
import c0.b;
import c0.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class r extends ComponentActivity implements b.a {
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final b0 mFragmentLifecycleRegistry = new b0(this);
    public final u mFragments = new u(new a());
    public boolean mResumed;
    public boolean mStopped = true;

    public class a extends w<r> implements y0, e, androidx.activity.result.e, c, e0 {
        public a() {
            super(r.this);
        }

        public final void a(Fragment fragment) {
            r.this.onAttachFragment(fragment);
        }

        public final View b(int i) {
            return r.this.findViewById(i);
        }

        public final boolean c() {
            Window window = r.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public final Object d() {
            return r.this;
        }

        public final LayoutInflater e() {
            return r.this.getLayoutInflater().cloneInContext(r.this);
        }

        public final boolean f(String str) {
            r rVar = r.this;
            int i = b.f3053c;
            return rVar.shouldShowRequestPermissionRationale(str);
        }

        public final void g() {
            r.this.supportInvalidateOptionsMenu();
        }

        public final ActivityResultRegistry getActivityResultRegistry() {
            return r.this.getActivityResultRegistry();
        }

        public final androidx.lifecycle.r getLifecycle() {
            return r.this.mFragmentLifecycleRegistry;
        }

        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return r.this.getOnBackPressedDispatcher();
        }

        public final androidx.savedstate.a getSavedStateRegistry() {
            return r.this.getSavedStateRegistry();
        }

        public final x0 getViewModelStore() {
            return r.this.getViewModelStore();
        }
    }

    public r() {
        init();
    }

    private void init() {
        getSavedStateRegistry().b(LIFECYCLE_TAG, new p(this));
        addOnContextAvailableListener(new q(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(r.b.ON_STOP);
        return new Bundle();
    }

    /* access modifiers changed from: private */
    public void lambda$init$1(Context context) {
        w<?> wVar = this.mFragments.f2007a;
        wVar.f2012s.b(wVar, wVar, (Fragment) null);
    }

    private static boolean markState(a0 a0Var, r.c cVar) {
        boolean z = false;
        for (Fragment fragment : a0Var.f1804c.h()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), cVar);
                }
                p0 p0Var = fragment.mViewLifecycleOwner;
                if (p0Var != null) {
                    p0Var.b();
                    if (p0Var.f1975s.f2084c.isAtLeast(r.c.STARTED)) {
                        fragment.mViewLifecycleOwner.f1975s.k(cVar);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f2084c.isAtLeast(r.c.STARTED)) {
                    fragment.mLifecycleRegistry.k(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f2007a.f2012s.f1807f.onCreateView(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            d1.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.f2007a.f2012s.w(str, fileDescriptor, printWriter, strArr);
    }

    public a0 getSupportFragmentManager() {
        return this.mFragments.f2007a.f2012s;
    }

    @Deprecated
    public d1.a getSupportLoaderManager() {
        return d1.a.b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), r.c.CREATED));
    }

    public void onActivityResult(int i, int i10, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i10, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.a();
        super.onConfigurationChanged(configuration);
        this.mFragments.f2007a.f2012s.h(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(r.b.ON_CREATE);
        this.mFragments.f2007a.f2012s.j();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        u uVar = this.mFragments;
        return onCreatePanelMenu | uVar.f2007a.f2012s.k(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f2007a.f2012s.l();
        this.mFragmentLifecycleRegistry.f(r.b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f2007a.f2012s.m();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.f2007a.f2012s.p(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.f2007a.f2012s.i(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.f2007a.f2012s.n(z);
    }

    public void onNewIntent(Intent intent) {
        this.mFragments.a();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.f2007a.f2012s.q(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f2007a.f2012s.u(5);
        this.mFragmentLifecycleRegistry.f(r.b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.f2007a.f2012s.s(z);
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.f2007a.f2012s.t(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f2007a.f2012s.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(r.b.ON_RESUME);
        b0 b0Var = this.mFragments.f2007a.f2012s;
        b0Var.A = false;
        b0Var.B = false;
        b0Var.H.f1877w = false;
        b0Var.u(7);
    }

    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            b0 b0Var = this.mFragments.f2007a.f2012s;
            b0Var.A = false;
            b0Var.B = false;
            b0Var.H.f1877w = false;
            b0Var.u(4);
        }
        this.mFragments.f2007a.f2012s.A(true);
        this.mFragmentLifecycleRegistry.f(r.b.ON_START);
        b0 b0Var2 = this.mFragments.f2007a.f2012s;
        b0Var2.A = false;
        b0Var2.B = false;
        b0Var2.H.f1877w = false;
        b0Var2.u(5);
    }

    public void onStateNotSaved() {
        this.mFragments.a();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        b0 b0Var = this.mFragments.f2007a.f2012s;
        b0Var.B = true;
        b0Var.H.f1877w = true;
        b0Var.u(4);
        this.mFragmentLifecycleRegistry.f(r.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(t tVar) {
        int i = b.f3053c;
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(t tVar) {
        int i = b.f3053c;
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            int i13 = b.f3053c;
            startIntentSenderForResult(intentSender, i, intent, i10, i11, i12, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12, bundle);
    }

    public void supportFinishAfterTransition() {
        int i = b.f3053c;
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = b.f3053c;
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        int i = b.f3053c;
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            int i10 = b.f3053c;
            startActivityForResult(intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, i, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public r(int i) {
        super(i);
        init();
    }
}
