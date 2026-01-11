package androidx.fragment.app;

import a1.d;
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.a0;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.j0;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import c0.t;
import d0.a;
import d1.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, a0, y0, q, androidx.savedstate.c {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public a0 mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public w0.b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public a0 mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public w<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public b0 mLifecycleRegistry;
    public r.c mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public androidx.savedstate.b mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public p0 mViewLifecycleOwner;
    public j0<a0> mViewLifecycleOwnerLiveData;
    public String mWho;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r0 f1767a;

        public c(r0 r0Var) {
            this.f1767a = r0Var;
        }

        public final void run() {
            this.f1767a.c();
        }
    }

    public class d extends t {
        public d() {
        }

        public final View b(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder d10 = a.a.d("Fragment ");
            d10.append(Fragment.this);
            d10.append(" does not have a view");
            throw new IllegalStateException(d10.toString());
        }

        public final boolean c() {
            return Fragment.this.mView != null;
        }
    }

    public class e implements q.a<Void, ActivityResultRegistry> {
        public e() {
        }

        public final Object apply(Object obj) {
            Void voidR = (Void) obj;
            Fragment fragment = Fragment.this;
            w<?> wVar = fragment.mHost;
            if (wVar instanceof androidx.activity.result.e) {
                return ((androidx.activity.result.e) wVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class f implements q.a<Void, ActivityResultRegistry> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f1770a;

        public f(ActivityResultRegistry activityResultRegistry) {
            this.f1770a = activityResultRegistry;
        }

        public final Object apply(Object obj) {
            Void voidR = (Void) obj;
            return this.f1770a;
        }
    }

    public class g extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q.a f1771a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f1772b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f.a f1773c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.b f1774d;

        public g(q.a aVar, AtomicReference atomicReference, f.a aVar2, androidx.activity.result.b bVar) {
            this.f1771a = aVar;
            this.f1772b = atomicReference;
            this.f1773c = aVar2;
            this.f1774d = bVar;
        }

        public final void a() {
            this.f1772b.set(((ActivityResultRegistry) this.f1771a.apply(null)).d(Fragment.this.generateActivityResultKey(), Fragment.this, this.f1773c, this.f1774d));
        }
    }

    public class h extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f1776a;

        public h(AtomicReference atomicReference) {
            this.f1776a = atomicReference;
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1777a;

        /* renamed from: b  reason: collision with root package name */
        public int f1778b;

        /* renamed from: c  reason: collision with root package name */
        public int f1779c;

        /* renamed from: d  reason: collision with root package name */
        public int f1780d;

        /* renamed from: e  reason: collision with root package name */
        public int f1781e;

        /* renamed from: f  reason: collision with root package name */
        public int f1782f;
        public ArrayList<String> g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f1783h;
        public Object i = null;

        /* renamed from: j  reason: collision with root package name */
        public Object f1784j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1785k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1786l;

        /* renamed from: m  reason: collision with root package name */
        public Object f1787m;

        /* renamed from: n  reason: collision with root package name */
        public Object f1788n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f1789o;

        /* renamed from: p  reason: collision with root package name */
        public Boolean f1790p;

        /* renamed from: q  reason: collision with root package name */
        public float f1791q;

        /* renamed from: r  reason: collision with root package name */
        public View f1792r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f1793s;

        public i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f1784j = obj;
            this.f1785k = null;
            this.f1786l = obj;
            this.f1787m = null;
            this.f1788n = obj;
            this.f1791q = 1.0f;
            this.f1792r = null;
        }
    }

    public static class j extends RuntimeException {
        public j(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class k {
        public abstract void a();
    }

    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f1794a;

        public class a implements Parcelable.ClassLoaderCreator<l> {
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i) {
                return new l[i];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }
        }

        public l(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1794a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f1794a);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new b0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = r.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new j0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        r.c cVar = this.mMaxState;
        if (cVar == r.c.INITIALIZED || this.mParentFragment == null) {
            return cVar.ordinal();
        }
        return Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new b0(this);
        this.mSavedStateRegistryController = new androidx.savedstate.b(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private <I, O> androidx.activity.result.c<I> prepareCallInternal(f.a<I, O> aVar, q.a<Void, ActivityResultRegistry> aVar2, androidx.activity.result.b<O> bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new g(aVar2, atomicReference, aVar, bVar));
            return new h(atomicReference);
        }
        throw new IllegalStateException(o.b("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(k kVar) {
        if (this.mState >= 0) {
            kVar.a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        a0 a0Var;
        i iVar = this.mAnimationInfo;
        if (iVar != null) {
            iVar.f1793s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (a0Var = this.mFragmentManager) != null) {
            r0 g8 = r0.g(viewGroup, a0Var.I());
            g8.h();
            if (z) {
                this.mHost.f2011c.post(new c(g8));
            } else {
                g8.c();
            }
        }
    }

    public t createFragmentContainer() {
        return new d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            d1.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(a8.a.c(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f1804c.d(str);
    }

    public String generateActivityResultKey() {
        StringBuilder d10 = a.a.d("fragment_");
        d10.append(this.mWho);
        d10.append("_rq#");
        d10.append(this.mNextLocalRequestCode.getAndIncrement());
        return d10.toString();
    }

    public final r getActivity() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return (r) wVar.f2009a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f1790p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f1789o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final a0 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return wVar.f2010b;
    }

    public w0.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && a0.K(3)) {
                    StringBuilder d10 = a.a.d("Could not find Application instance from Context ");
                    d10.append(requireContext().getApplicationContext());
                    d10.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                    Log.d("FragmentManager", d10.toString());
                }
                this.mDefaultFactory = new s0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1778b;
    }

    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.i;
    }

    public t getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1779c;
    }

    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1785k;
    }

    public t getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Objects.requireNonNull(iVar);
        return null;
    }

    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1792r;
    }

    @Deprecated
    public final a0 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        w<?> wVar = this.mHost;
        if (wVar == null) {
            return null;
        }
        return wVar.d();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public d1.a getLoaderManager() {
        return d1.a.b(this);
    }

    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1782f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final a0 getParentFragmentManager() {
        a0 a0Var = this.mFragmentManager;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f1777a;
    }

    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1780d;
    }

    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f1781e;
    }

    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f1791q;
    }

    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f1786l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        a1.d dVar = a1.d.f23a;
        a1.f fVar = new a1.f(this);
        a1.d dVar2 = a1.d.f23a;
        a1.d.c(fVar);
        d.c a10 = a1.d.a(this);
        if (a10.f26a.contains(d.a.DETECT_RETAIN_INSTANCE_USAGE) && a1.d.f(a10, getClass(), a1.f.class)) {
            a1.d.b(a10, fVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f1784j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f2612b;
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f1787m;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f1788n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (arrayList = iVar.g) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (arrayList = iVar.f1783h) == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        a1.d dVar = a1.d.f23a;
        a1.g gVar = new a1.g(this);
        a1.d dVar2 = a1.d.f23a;
        a1.d.c(gVar);
        d.c a10 = a1.d.a(this);
        if (a10.f26a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && a1.d.f(a10, getClass(), a1.g.class)) {
            a1.d.b(a10, gVar);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public a0 getViewLifecycleOwner() {
        p0 p0Var = this.mViewLifecycleOwner;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<a0> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public x0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != r.c.INITIALIZED.ordinal()) {
            d0 d0Var = this.mFragmentManager.H;
            x0 x0Var = d0Var.f1874t.get(this.mWho);
            if (x0Var != null) {
                return x0Var;
            }
            x0 x0Var2 = new x0();
            d0Var.f1874t.put(this.mWho, x0Var2);
            return x0Var2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new b0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean z;
        if (!this.mHidden) {
            a0 a0Var = this.mFragmentManager;
            if (a0Var == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            Objects.requireNonNull(a0Var);
            if (fragment == null) {
                z = false;
            } else {
                z = fragment.isHidden();
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mFragmentManager;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMenuVisible() {
        /*
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.a0 r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.M(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isMenuVisible():boolean");
    }

    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f1793s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        a0 a0Var = this.mFragmentManager;
        if (a0Var == null) {
            return false;
        }
        return a0Var.O();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.Q();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (a0.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        w<?> wVar = this.mHost;
        if (wVar == null) {
            activity = null;
        } else {
            activity = wVar.f2009a;
        }
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        a0 a0Var = this.mChildFragmentManager;
        if (a0Var.f1814o < 1) {
            z = false;
        }
        if (!z) {
            a0Var.j();
        }
    }

    public Animation onCreateAnimation(int i10, boolean z, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z, int i11) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        w<?> wVar = this.mHost;
        if (wVar == null) {
            activity = null;
        } else {
            activity = wVar.f2009a;
        }
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            a0 a0Var = this.mChildFragmentManager;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f1877w = false;
            a0Var.u(4);
            return;
        }
        throw new t0(o.b("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f2010b);
        if (this.mCalled) {
            Iterator<e0> it2 = this.mFragmentManager.f1813n.iterator();
            while (it2.hasNext()) {
                it2.next().a(this);
            }
            a0 a0Var = this.mChildFragmentManager;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f1877w = false;
            a0Var.u(0);
            return;
        }
        throw new t0(o.b("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.h(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new y() {
            public final void c(a0 a0Var, r.b bVar) {
                View view;
                if (bVar == r.b.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.f(r.b.ON_CREATE);
            return;
        }
        throw new t0(o.b("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.k(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.Q();
        boolean z = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new p0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            a.b.C0(this.mView, this.mViewLifecycleOwner);
            ad.c.p0(this.mView, this.mViewLifecycleOwner);
            ad.c.q0(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f1975s == null) {
            z = false;
        }
        if (!z) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.f(r.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new t0(o.b("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            p0 p0Var = this.mViewLifecycleOwner;
            p0Var.b();
            if (p0Var.f1975s.f2084c.isAtLeast(r.c.CREATED)) {
                this.mViewLifecycleOwner.a(r.b.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            b.c cVar = ((d1.b) d1.a.b(this)).f4259b;
            int h10 = cVar.f4270c.h();
            for (int i10 = 0; i10 < h10; i10++) {
                cVar.f4270c.i(i10).l();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new t0(o.b("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            a0 a0Var = this.mChildFragmentManager;
            if (!a0Var.C) {
                a0Var.l();
                this.mChildFragmentManager = new b0();
                return;
            }
            return;
        }
        throw new t0(o.b("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.n(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.p(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.q(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(r.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(r.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new t0(o.b("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.s(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.t(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean N = this.mFragmentManager.N(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != N) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(N);
            onPrimaryNavigationFragmentChanged(N);
            a0 a0Var = this.mChildFragmentManager;
            a0Var.f0();
            a0Var.r(a0Var.f1818s);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            b0 b0Var = this.mLifecycleRegistry;
            r.b bVar = r.b.ON_RESUME;
            b0Var.f(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            a0 a0Var = this.mChildFragmentManager;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f1877w = false;
            a0Var.u(7);
            return;
        }
        throw new t0(o.b("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
        Parcelable X = this.mChildFragmentManager.X();
        if (X != null) {
            bundle.putParcelable("android:support:fragments", X);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            b0 b0Var = this.mLifecycleRegistry;
            r.b bVar = r.b.ON_START;
            b0Var.f(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            a0 a0Var = this.mChildFragmentManager;
            a0Var.A = false;
            a0Var.B = false;
            a0Var.H.f1877w = false;
            a0Var.u(5);
            return;
        }
        throw new t0(o.b("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        a0 a0Var = this.mChildFragmentManager;
        a0Var.B = true;
        a0Var.H.f1877w = true;
        a0Var.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(r.b.ON_STOP);
        }
        this.mLifecycleRegistry.f(r.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new t0(o.b("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f1793s = true;
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return prepareCallInternal(aVar, new e(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [androidx.activity.result.ActivityResultRegistry$b, androidx.activity.result.c<java.lang.String[]>] */
    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost != null) {
            a0 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1823x != null) {
                parentFragmentManager.f1824y.addLast(new a0.j(this.mWho, i10));
                parentFragmentManager.f1823x.a(strArr, (c0.c) null);
                return;
            }
            Objects.requireNonNull(parentFragmentManager.f1815p);
            return;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not attached to Activity"));
    }

    public final r requireActivity() {
        r activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final a0 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(o.b("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.W(parcelable);
            this.mChildFragmentManager.j();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            p0 p0Var = this.mViewLifecycleOwner;
            p0Var.f1976t.a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new t0(o.b("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.a(r.b.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1790p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f1789o = Boolean.valueOf(z);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            ensureAnimationInfo().f1778b = i10;
            ensureAnimationInfo().f1779c = i11;
            ensureAnimationInfo().f1780d = i12;
            ensureAnimationInfo().f1781e = i13;
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(t tVar) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(t tVar) {
        Objects.requireNonNull(ensureAnimationInfo());
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f1785k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f1792r = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.g();
            }
        }
    }

    public void setInitialSavedState(l lVar) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (lVar == null || (bundle = lVar.f1794a) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.g();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo != null || i10 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f1782f = i10;
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().f1777a = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f1791q = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f1786l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        a1.d dVar = a1.d.f23a;
        a1.j jVar = new a1.j(this);
        a1.d dVar2 = a1.d.f23a;
        a1.d.c(jVar);
        d.c a10 = a1.d.a(this);
        if (a10.f26a.contains(d.a.DETECT_RETAIN_INSTANCE_USAGE) && a1.d.f(a10, getClass(), a1.j.class)) {
            a1.d.b(a10, jVar);
        }
        this.mRetainInstance = z;
        a0 a0Var = this.mFragmentManager;
        if (a0Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            a0Var.H.i(this);
        } else {
            a0Var.H.l(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f1784j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f1787m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        iVar.g = arrayList;
        iVar.f1783h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f1788n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i10) {
        if (fragment != null) {
            a1.d dVar = a1.d.f23a;
            a1.k kVar = new a1.k(this, fragment, i10);
            a1.d dVar2 = a1.d.f23a;
            a1.d.c(kVar);
            d.c a10 = a1.d.a(this);
            if (a10.f26a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && a1.d.f(a10, getClass(), a1.k.class)) {
                a1.d.b(a10, kVar);
            }
        }
        a0 a0Var = this.mFragmentManager;
        a0 a0Var2 = fragment != null ? fragment.mFragmentManager : null;
        if (a0Var == null || a0Var2 == null || a0Var == a0Var2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i10;
            return;
        }
        throw new IllegalArgumentException(o.b("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        a1.d dVar = a1.d.f23a;
        a1.l lVar = new a1.l(this, z);
        a1.d dVar2 = a1.d.f23a;
        a1.d.c(lVar);
        d.c a10 = a1.d.a(this);
        if (a10.f26a.contains(d.a.DETECT_SET_USER_VISIBLE_HINT) && a1.d.f(a10, getClass(), a1.l.class)) {
            a1.d.b(a10, lVar);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            a0 a0Var = this.mFragmentManager;
            a0Var.R(a0Var.f(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            return wVar.f(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, (Bundle) null);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [androidx.activity.result.ActivityResultRegistry$b, androidx.activity.result.c<androidx.activity.result.f>] */
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        IntentSender intentSender2 = intentSender;
        int i14 = i10;
        Intent intent2 = intent;
        Bundle bundle2 = bundle;
        if (this.mHost != null) {
            if (a0.K(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle2);
            }
            a0 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1822w != null) {
                if (bundle2 != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle2 + " were added to fillInIntent " + intent2 + " for fragment " + this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
                }
                int i15 = i11;
                androidx.activity.result.f fVar = new androidx.activity.result.f(intentSender, intent2, i11, i12);
                parentFragmentManager.f1824y.addLast(new a0.j(this.mWho, i10));
                if (a0.K(2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.f1822w.a(fVar, (c0.c) null);
                return;
            }
            int i16 = i11;
            int i17 = i12;
            w<?> wVar = parentFragmentManager.f1815p;
            Objects.requireNonNull(wVar);
            if (i14 == -1) {
                Activity activity = wVar.f2009a;
                int i18 = c0.b.f3053c;
                activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            }
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f1793s) {
            if (this.mHost == null) {
                ensureAnimationInfo().f1793s = false;
            } else if (Looper.myLooper() != this.mHost.f2011c.getLooper()) {
                this.mHost.f2011c.postAtFrontOfQueue(new b());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            a1.d dVar = a1.d.f23a;
            a1.h hVar = new a1.h(this);
            a1.d dVar2 = a1.d.f23a;
            a1.d.c(hVar);
            d.c a10 = a1.d.a(this);
            if (a10.f26a.contains(d.a.DETECT_TARGET_FRAGMENT_USAGE) && a1.d.f(a10, getClass(), a1.h.class)) {
                a1.d.b(a10, hVar);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        a0 a0Var = this.mFragmentManager;
        if (a0Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return a0Var.D(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) v.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e10) {
            throw new j(o.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (IllegalAccessException e11) {
            throw new j(o.c("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new j(o.c("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new j(o.c("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f1793s = true;
        a0 a0Var = this.mFragmentManager;
        if (a0Var != null) {
            handler = a0Var.f1815p.f2011c;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return prepareCallInternal(aVar, new f(activityResultRegistry), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            Objects.requireNonNull(wVar);
            Context context = wVar.f2010b;
            Object obj = d0.a.f4256a;
            a.C0057a.b(context, intent, bundle);
            return;
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not attached to Activity"));
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [androidx.activity.result.ActivityResultRegistry$b, androidx.activity.result.c<android.content.Intent>] */
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost != null) {
            a0 parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.f1821v != null) {
                parentFragmentManager.f1824y.addLast(new a0.j(this.mWho, i10));
                if (!(intent == null || bundle == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.f1821v.a(intent, (c0.c) null);
                return;
            }
            w<?> wVar = parentFragmentManager.f1815p;
            Objects.requireNonNull(wVar);
            if (i10 == -1) {
                Context context = wVar.f2010b;
                Object obj = d0.a.f4256a;
                a.C0057a.b(context, intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(o.b("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        w<?> wVar = this.mHost;
        if (wVar != null) {
            LayoutInflater e10 = wVar.e();
            e10.setFactory2(this.mChildFragmentManager.f1807f);
            return e10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private void restoreViewState() {
        if (a0.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}
