package x5;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Objects;
import l5.b;
import n0.e0;
import n0.n;
import x5.t;

public final class r implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t.a f12864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t.b f12865b;

    public r(t.a aVar, t.b bVar) {
        this.f12864a = aVar;
        this.f12865b = bVar;
    }

    public final e0 a(View view, e0 e0Var) {
        int i;
        int i10;
        int i11;
        t.a aVar = this.f12864a;
        t.b bVar = this.f12865b;
        int i12 = bVar.f12866a;
        int i13 = bVar.f12867b;
        int i14 = bVar.f12868c;
        b bVar2 = (b) aVar;
        Objects.requireNonNull(bVar2);
        g0.b b10 = e0Var.b(7);
        g0.b b11 = e0Var.b(32);
        bVar2.f7778b.f3708v = b10.f5204b;
        boolean c10 = t.c(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = bVar2.f7778b;
        if (bottomSheetBehavior.f3700n) {
            bottomSheetBehavior.f3707u = e0Var.c();
            paddingBottom = bVar2.f7778b.f3707u + i14;
        }
        BottomSheetBehavior bottomSheetBehavior2 = bVar2.f7778b;
        if (bottomSheetBehavior2.f3701o) {
            paddingLeft = (c10 ? i13 : i12) + b10.f5203a;
        }
        if (bottomSheetBehavior2.f3702p) {
            if (!c10) {
                i12 = i13;
            }
            paddingRight = i12 + b10.f5205c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = bVar2.f7778b;
        boolean z = false;
        boolean z10 = true;
        if (bottomSheetBehavior3.f3704r && marginLayoutParams.leftMargin != (i11 = b10.f5203a)) {
            marginLayoutParams.leftMargin = i11;
            z = true;
        }
        if (bottomSheetBehavior3.f3705s && marginLayoutParams.rightMargin != (i10 = b10.f5205c)) {
            marginLayoutParams.rightMargin = i10;
            z = true;
        }
        if (!bottomSheetBehavior3.f3706t || marginLayoutParams.topMargin == (i = b10.f5204b)) {
            z10 = z;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z10) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z11 = bVar2.f7777a;
        if (z11) {
            bVar2.f7778b.f3698l = b11.f5206d;
        }
        BottomSheetBehavior bottomSheetBehavior4 = bVar2.f7778b;
        if (bottomSheetBehavior4.f3700n || z11) {
            bottomSheetBehavior4.L();
        }
        return e0Var;
    }
}
