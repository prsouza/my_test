package p1;

import android.os.Build;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9552a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f9553b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f9554c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        f9554c = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View a(android.view.ViewGroup r16, android.view.View r17, android.view.View r18) {
        /*
            r0 = r17
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            int r2 = r18.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r18.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            r1.setTranslate(r2, r3)
            p1.x r2 = p1.t.f9564a
            r2.U0(r0, r1)
            r3 = r16
            r2.V0(r3, r1)
            android.graphics.RectF r2 = new android.graphics.RectF
            int r4 = r17.getWidth()
            float r4 = (float) r4
            int r5 = r17.getHeight()
            float r5 = (float) r5
            r6 = 0
            r2.<init>(r6, r6, r4, r5)
            r1.mapRect(r2)
            float r4 = r2.left
            int r4 = java.lang.Math.round(r4)
            float r5 = r2.top
            int r5 = java.lang.Math.round(r5)
            float r6 = r2.right
            int r6 = java.lang.Math.round(r6)
            float r7 = r2.bottom
            int r7 = java.lang.Math.round(r7)
            android.widget.ImageView r8 = new android.widget.ImageView
            android.content.Context r9 = r17.getContext()
            r8.<init>(r9)
            android.widget.ImageView$ScaleType r9 = android.widget.ImageView.ScaleType.CENTER_CROP
            r8.setScaleType(r9)
            boolean r9 = f9552a
            r10 = 0
            if (r9 == 0) goto L_0x0069
            boolean r9 = r17.isAttachedToWindow()
            r9 = r9 ^ 1
            boolean r11 = r16.isAttachedToWindow()
            goto L_0x006b
        L_0x0069:
            r9 = r10
            r11 = r9
        L_0x006b:
            boolean r12 = f9553b
            r13 = 0
            if (r12 == 0) goto L_0x0088
            if (r9 == 0) goto L_0x0088
            if (r11 != 0) goto L_0x0076
            goto L_0x00fe
        L_0x0076:
            android.view.ViewParent r10 = r17.getParent()
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r11 = r10.indexOfChild(r0)
            android.view.ViewGroupOverlay r14 = r16.getOverlay()
            r14.add(r0)
            goto L_0x008a
        L_0x0088:
            r11 = r10
            r10 = r13
        L_0x008a:
            float r14 = r2.width()
            int r14 = java.lang.Math.round(r14)
            float r15 = r2.height()
            int r15 = java.lang.Math.round(r15)
            if (r14 <= 0) goto L_0x00f0
            if (r15 <= 0) goto L_0x00f0
            r13 = 1233125376(0x49800000, float:1048576.0)
            int r3 = r14 * r15
            float r3 = (float) r3
            float r13 = r13 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r3, r13)
            float r13 = (float) r14
            float r13 = r13 * r3
            int r13 = java.lang.Math.round(r13)
            float r14 = (float) r15
            float r14 = r14 * r3
            int r14 = java.lang.Math.round(r14)
            float r15 = r2.left
            float r15 = -r15
            float r2 = r2.top
            float r2 = -r2
            r1.postTranslate(r15, r2)
            r1.postScale(r3, r3)
            boolean r2 = f9554c
            if (r2 == 0) goto L_0x00de
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r3 = r2.beginRecording(r13, r14)
            r3.concat(r1)
            r0.draw(r3)
            r2.endRecording()
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2)
            r13 = r1
            goto L_0x00f0
        L_0x00de:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r13, r14, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            r3.concat(r1)
            r0.draw(r3)
            r13 = r2
        L_0x00f0:
            if (r12 == 0) goto L_0x00fe
            if (r9 == 0) goto L_0x00fe
            android.view.ViewGroupOverlay r1 = r16.getOverlay()
            r1.remove(r0)
            r10.addView(r0, r11)
        L_0x00fe:
            if (r13 == 0) goto L_0x0103
            r8.setImageBitmap(r13)
        L_0x0103:
            int r0 = r6 - r4
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r2 = r7 - r5
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            r8.measure(r0, r1)
            r8.layout(r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.o.a(android.view.ViewGroup, android.view.View, android.view.View):android.view.View");
    }
}
