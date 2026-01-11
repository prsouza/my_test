package n0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f8830a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f8831b;

    /* renamed from: c  reason: collision with root package name */
    public final View f8832c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8833d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f8834e;

    public j(View view) {
        this.f8832c = view;
    }

    public final boolean a(float f10, float f11, boolean z) {
        ViewParent f12;
        if (!this.f8833d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return f12.onNestedFling(this.f8832c, f10, f11, z);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedFling", e10);
            return false;
        }
    }

    public final boolean b(float f10, float f11) {
        ViewParent f12;
        if (!this.f8833d || (f12 = f(0)) == null) {
            return false;
        }
        try {
            return f12.onNestedPreFling(this.f8832c, f10, f11);
        } catch (AbstractMethodError e10) {
            Log.e("ViewParentCompat", "ViewParent " + f12 + " does not implement interface method onNestedPreFling", e10);
            return false;
        }
    }

    public final boolean c(int i, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent f10;
        int i12;
        int i13;
        int[] iArr3;
        int i14 = i;
        int i15 = i10;
        int[] iArr4 = iArr2;
        int i16 = i11;
        if (!this.f8833d || (f10 = f(i16)) == null) {
            return false;
        }
        if (i14 != 0 || i15 != 0) {
            if (iArr4 != null) {
                this.f8832c.getLocationInWindow(iArr4);
                i13 = iArr4[0];
                i12 = iArr4[1];
            } else {
                i13 = 0;
                i12 = 0;
            }
            if (iArr == null) {
                if (this.f8834e == null) {
                    this.f8834e = new int[2];
                }
                iArr3 = this.f8834e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f8832c;
            if (f10 instanceof k) {
                ((k) f10).j(view, i, i10, iArr3, i11);
            } else if (i16 == 0) {
                try {
                    f10.onNestedPreScroll(view, i, i15, iArr3);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedPreScroll", e10);
                }
            }
            if (iArr4 != null) {
                this.f8832c.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i13;
                iArr4[1] = iArr4[1] - i12;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i, int i10, int i11, int[] iArr) {
        e(0, i, 0, i10, (int[]) null, i11, iArr);
    }

    public final boolean e(int i, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent f10;
        int i14;
        int i15;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i16 = i13;
        if (!this.f8833d || (f10 = f(i16)) == null) {
            return false;
        }
        if (i == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f8832c.getLocationInWindow(iArr4);
            i15 = iArr4[0];
            i14 = iArr4[1];
        } else {
            i15 = 0;
            i14 = 0;
        }
        if (iArr2 == null) {
            if (this.f8834e == null) {
                this.f8834e = new int[2];
            }
            int[] iArr5 = this.f8834e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f8832c;
        if (f10 instanceof l) {
            ((l) f10).m(view, i, i10, i11, i12, i13, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i11;
            iArr3[1] = iArr3[1] + i12;
            if (f10 instanceof k) {
                ((k) f10).n(view, i, i10, i11, i12, i13);
            } else if (i16 == 0) {
                try {
                    f10.onNestedScroll(view, i, i10, i11, i12);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr4 != null) {
            this.f8832c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i15;
            iArr4[1] = iArr4[1] - i14;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i == 0) {
            return this.f8830a;
        }
        if (i != 1) {
            return null;
        }
        return this.f8831b;
    }

    public final boolean g(int i) {
        return f(i) != null;
    }

    public final boolean h(int i, int i10) {
        boolean z;
        if (g(i10)) {
            return true;
        }
        if (this.f8833d) {
            View view = this.f8832c;
            for (ViewParent parent = this.f8832c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f8832c;
                boolean z10 = parent instanceof k;
                if (z10) {
                    z = ((k) parent).o(view, view2, i, i10);
                } else {
                    if (i10 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e10) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i10 == 0) {
                        this.f8830a = parent;
                    } else if (i10 == 1) {
                        this.f8831b = parent;
                    }
                    View view3 = this.f8832c;
                    if (z10) {
                        ((k) parent).h(view, view3, i, i10);
                    } else if (i10 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public final void i(int i) {
        ViewParent f10 = f(i);
        if (f10 != null) {
            View view = this.f8832c;
            if (f10 instanceof k) {
                ((k) f10).i(view, i);
            } else if (i == 0) {
                try {
                    f10.onStopNestedScroll(view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + f10 + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i == 0) {
                this.f8830a = null;
            } else if (i == 1) {
                this.f8831b = null;
            }
        }
    }
}
