package androidx.appcompat.widget;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import q0.g;
import y.c;

public final class i extends CheckedTextView {

    /* renamed from: a  reason: collision with root package name */
    public final j f1278a;

    /* renamed from: b  reason: collision with root package name */
    public final f f1279b;

    /* renamed from: c  reason: collision with root package name */
    public final d0 f1280c;

    /* renamed from: s  reason: collision with root package name */
    public o f1281s;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0063 A[SYNTHETIC, Splitter:B:11:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083 A[Catch:{ all -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093 A[Catch:{ all -> 0x00ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            androidx.appcompat.widget.a1.a(r9)
            r0 = 2130903221(0x7f0300b5, float:1.7413254E38)
            r8.<init>(r9, r10, r0)
            android.content.Context r9 = r8.getContext()
            androidx.appcompat.widget.y0.a(r8, r9)
            androidx.appcompat.widget.d0 r9 = new androidx.appcompat.widget.d0
            r9.<init>(r8)
            r8.f1280c = r9
            r9.f(r10, r0)
            r9.b()
            androidx.appcompat.widget.f r9 = new androidx.appcompat.widget.f
            r9.<init>(r8)
            r8.f1279b = r9
            r9.d(r10, r0)
            androidx.appcompat.widget.j r9 = new androidx.appcompat.widget.j
            r9.<init>(r8)
            r8.f1278a = r9
            android.content.Context r1 = r8.getContext()
            int[] r4 = ad.c.F
            androidx.appcompat.widget.d1 r1 = androidx.appcompat.widget.d1.q(r1, r10, r4, r0)
            android.content.Context r3 = r8.getContext()
            android.content.res.TypedArray r6 = r1.f1207b
            r7 = 2130903221(0x7f0300b5, float:1.7413254E38)
            r2 = r8
            r5 = r10
            n0.x.o(r2, r3, r4, r5, r6, r7)
            r2 = 1
            boolean r3 = r1.o(r2)     // Catch:{ all -> 0x00ad }
            r4 = 0
            if (r3 == 0) goto L_0x0060
            int r3 = r1.l(r2, r4)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x0060
            android.content.Context r5 = r8.getContext()     // Catch:{ NotFoundException -> 0x0060 }
            android.graphics.drawable.Drawable r3 = a.b.a0(r5, r3)     // Catch:{ NotFoundException -> 0x0060 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r3)     // Catch:{ NotFoundException -> 0x0060 }
            goto L_0x0061
        L_0x0060:
            r2 = r4
        L_0x0061:
            if (r2 != 0) goto L_0x007c
            boolean r2 = r1.o(r4)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x007c
            int r2 = r1.l(r4, r4)     // Catch:{ all -> 0x00ad }
            if (r2 == 0) goto L_0x007c
            android.widget.CheckedTextView r3 = r9.f1288a     // Catch:{ all -> 0x00ad }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x00ad }
            android.graphics.drawable.Drawable r2 = a.b.a0(r4, r2)     // Catch:{ all -> 0x00ad }
            r3.setCheckMarkDrawable(r2)     // Catch:{ all -> 0x00ad }
        L_0x007c:
            r2 = 2
            boolean r3 = r1.o(r2)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x008c
            android.widget.CheckedTextView r3 = r9.f1288a     // Catch:{ all -> 0x00ad }
            android.content.res.ColorStateList r2 = r1.c(r2)     // Catch:{ all -> 0x00ad }
            r3.setCheckMarkTintList(r2)     // Catch:{ all -> 0x00ad }
        L_0x008c:
            r2 = 3
            boolean r3 = r1.o(r2)     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x00a2
            android.widget.CheckedTextView r9 = r9.f1288a     // Catch:{ all -> 0x00ad }
            r3 = -1
            int r2 = r1.j(r2, r3)     // Catch:{ all -> 0x00ad }
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.k0.e(r2, r3)     // Catch:{ all -> 0x00ad }
            r9.setCheckMarkTintMode(r2)     // Catch:{ all -> 0x00ad }
        L_0x00a2:
            r1.r()
            androidx.appcompat.widget.o r9 = r8.getEmojiTextViewHelper()
            r9.b(r10, r0)
            return
        L_0x00ad:
            r9 = move-exception
            r1.r()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private o getEmojiTextViewHelper() {
        if (this.f1281s == null) {
            this.f1281s = new o(this);
        }
        return this.f1281s;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d0 d0Var = this.f1280c;
        if (d0Var != null) {
            d0Var.b();
        }
        f fVar = this.f1279b;
        if (fVar != null) {
            fVar.a();
        }
        j jVar = this.f1278a;
        if (jVar != null) {
            jVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        f fVar = this.f1279b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f fVar = this.f1279b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        j jVar = this.f1278a;
        if (jVar != null) {
            return jVar.f1289b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        j jVar = this.f1278a;
        if (jVar != null) {
            return jVar.f1290c;
        }
        return null;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c.X(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f fVar = this.f1279b;
        if (fVar != null) {
            fVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f fVar = this.f1279b;
        if (fVar != null) {
            fVar.f(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        j jVar = this.f1278a;
        if (jVar == null) {
            return;
        }
        if (jVar.f1293f) {
            jVar.f1293f = false;
            return;
        }
        jVar.f1293f = true;
        jVar.a();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.g(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        f fVar = this.f1279b;
        if (fVar != null) {
            fVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1279b;
        if (fVar != null) {
            fVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        j jVar = this.f1278a;
        if (jVar != null) {
            jVar.f1289b = colorStateList;
            jVar.f1291d = true;
            jVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        j jVar = this.f1278a;
        if (jVar != null) {
            jVar.f1290c = mode;
            jVar.f1292e = true;
            jVar.a();
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.f1280c;
        if (d0Var != null) {
            d0Var.g(context, i);
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(b.a0(getContext(), i));
    }
}
