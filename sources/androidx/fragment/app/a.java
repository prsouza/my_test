package androidx.fragment.app;

import a1.d;
import android.util.Log;
import androidx.fragment.app.a0;
import androidx.fragment.app.i0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a extends i0 implements a0.k {

    /* renamed from: q  reason: collision with root package name */
    public final a0 f1799q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1800r;

    /* renamed from: s  reason: collision with root package name */
    public int f1801s;

    public a(a0 a0Var) {
        a0Var.H();
        w<?> wVar = a0Var.f1815p;
        if (wVar != null) {
            wVar.f2010b.getClassLoader();
        }
        this.f1801s = -1;
        this.f1799q = a0Var;
    }

    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (a0.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        a0 a0Var = this.f1799q;
        if (a0Var.f1805d == null) {
            a0Var.f1805d = new ArrayList<>();
        }
        a0Var.f1805d.add(this);
        return true;
    }

    public final int d() {
        return i(false);
    }

    public final void e(int i, Fragment fragment, String str, int i10) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            d.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder d10 = a.a.d("Fragment ");
            d10.append(cls.getCanonicalName());
            d10.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(d10.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(androidx.appcompat.widget.d.b(sb2, fragment.mTag, " now ", str));
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i11 = fragment.mFragmentId;
                if (i11 == 0 || i11 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        b(new i0.a(i10, fragment));
        fragment.mFragmentManager = this.f1799q;
    }

    public final void g(int i) {
        if (this.g) {
            if (a0.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1918a.size();
            for (int i10 = 0; i10 < size; i10++) {
                i0.a aVar = this.f1918a.get(i10);
                Fragment fragment = aVar.f1933b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (a0.K(2)) {
                        StringBuilder d10 = a.a.d("Bump nesting of ");
                        d10.append(aVar.f1933b);
                        d10.append(" to ");
                        d10.append(aVar.f1933b.mBackStackNesting);
                        Log.v("FragmentManager", d10.toString());
                    }
                }
            }
        }
    }

    public final int h() {
        return i(true);
    }

    public final int i(boolean z) {
        if (!this.f1800r) {
            if (a0.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new q0());
                k("  ", printWriter, true);
                printWriter.close();
            }
            this.f1800r = true;
            if (this.g) {
                this.f1801s = this.f1799q.i.getAndIncrement();
            } else {
                this.f1801s = -1;
            }
            this.f1799q.y(this, z);
            return this.f1801s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void j() {
        if (!this.g) {
            this.f1924h = false;
            this.f1799q.B(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void k(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1801s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1800r);
            if (this.f1923f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1923f));
            }
            if (!(this.f1919b == 0 && this.f1920c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1919b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1920c));
            }
            if (!(this.f1921d == 0 && this.f1922e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1921d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1922e));
            }
            if (!(this.f1925j == 0 && this.f1926k == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1925j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1926k);
            }
            if (!(this.f1927l == 0 && this.f1928m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1927l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1928m);
            }
        }
        if (!this.f1918a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1918a.size();
            for (int i = 0; i < size; i++) {
                i0.a aVar = this.f1918a.get(i);
                switch (aVar.f1932a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder d10 = a.a.d("cmd=");
                        d10.append(aVar.f1932a);
                        str2 = d10.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1933b);
                if (z) {
                    if (!(aVar.f1935d == 0 && aVar.f1936e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1935d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1936e));
                    }
                    if (aVar.f1937f != 0 || aVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1937f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.g));
                    }
                }
            }
        }
    }

    public final i0 l(Fragment fragment) {
        a0 a0Var = fragment.mFragmentManager;
        if (a0Var == null || a0Var == this.f1799q) {
            b(new i0.a(4, fragment));
            return this;
        }
        StringBuilder d10 = a.a.d("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        d10.append(fragment.toString());
        d10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(d10.toString());
    }

    public final i0 m(Fragment fragment) {
        a0 a0Var = fragment.mFragmentManager;
        if (a0Var == null || a0Var == this.f1799q) {
            b(new i0.a(3, fragment));
            return this;
        }
        StringBuilder d10 = a.a.d("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        d10.append(fragment.toString());
        d10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(d10.toString());
    }

    public final i0 n(Fragment fragment) {
        a0 a0Var = fragment.mFragmentManager;
        if (a0Var == null || a0Var == this.f1799q) {
            b(new i0.a(5, fragment));
            return this;
        }
        StringBuilder d10 = a.a.d("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        d10.append(fragment.toString());
        d10.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(d10.toString());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1801s >= 0) {
            sb2.append(" #");
            sb2.append(this.f1801s);
        }
        if (this.i != null) {
            sb2.append(" ");
            sb2.append(this.i);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
