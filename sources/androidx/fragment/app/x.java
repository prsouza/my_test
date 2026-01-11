package androidx.fragment.app;

import a1.d;
import a1.e;
import ah.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import s.g;

public final class x implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f2013a;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g0 f2014a;

        public a(g0 g0Var) {
            this.f2014a = g0Var;
        }

        public final void onViewAttachedToWindow(View view) {
            g0 g0Var = this.f2014a;
            Fragment fragment = g0Var.f1902c;
            g0Var.k();
            r0.f((ViewGroup) fragment.mView.getParent(), x.this.f2013a).e();
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public x(a0 a0Var) {
        this.f2013a = a0Var;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        g0 g0Var;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f2013a);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.I);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            g<ClassLoader, g<String, Class<?>>> gVar = v.f2008a;
            try {
                z = Fragment.class.isAssignableFrom(v.b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                if (resourceId != -1) {
                    fragment = this.f2013a.E(resourceId);
                }
                if (fragment == null && string != null) {
                    fragment = this.f2013a.F(string);
                }
                if (fragment == null && i != -1) {
                    fragment = this.f2013a.E(i);
                }
                if (fragment == null) {
                    fragment = this.f2013a.H().a(context.getClassLoader(), attributeValue);
                    fragment.mFromLayout = true;
                    fragment.mFragmentId = resourceId != 0 ? resourceId : i;
                    fragment.mContainerId = i;
                    fragment.mTag = string;
                    fragment.mInLayout = true;
                    a0 a0Var = this.f2013a;
                    fragment.mFragmentManager = a0Var;
                    w<?> wVar = a0Var.f1815p;
                    fragment.mHost = wVar;
                    fragment.onInflate(wVar.f2010b, attributeSet, fragment.mSavedFragmentState);
                    g0Var = this.f2013a.a(fragment);
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!fragment.mInLayout) {
                    fragment.mInLayout = true;
                    a0 a0Var2 = this.f2013a;
                    fragment.mFragmentManager = a0Var2;
                    w<?> wVar2 = a0Var2.f1815p;
                    fragment.mHost = wVar2;
                    fragment.onInflate(wVar2.f2010b, attributeSet, fragment.mSavedFragmentState);
                    g0Var = this.f2013a.f(fragment);
                    if (a0.K(2)) {
                        Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                d dVar = d.f23a;
                e eVar = new e(fragment, viewGroup);
                d dVar2 = d.f23a;
                d.c(eVar);
                d.c a10 = d.a(fragment);
                if (a10.f26a.contains(d.a.DETECT_FRAGMENT_TAG_USAGE) && d.f(a10, fragment.getClass(), e.class)) {
                    d.b(a10, eVar);
                }
                fragment.mContainer = viewGroup;
                g0Var.k();
                g0Var.j();
                View view2 = fragment.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragment.mView.getTag() == null) {
                        fragment.mView.setTag(string);
                    }
                    fragment.mView.addOnAttachStateChangeListener(new a(g0Var));
                    return fragment.mView;
                }
                throw new IllegalStateException(o.c("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
