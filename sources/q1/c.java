package q1;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.BuildConfig;
import f0.k;
import g0.d;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

public final class c {

    public static class a implements TypeEvaluator<d.a[]> {

        /* renamed from: a  reason: collision with root package name */
        public d.a[] f10121a;

        public final Object evaluate(float f10, Object obj, Object obj2) {
            d.a[] aVarArr = (d.a[]) obj;
            d.a[] aVarArr2 = (d.a[]) obj2;
            if (d.a(aVarArr, aVarArr2)) {
                if (!d.a(this.f10121a, aVarArr)) {
                    this.f10121a = d.e(aVarArr);
                }
                for (int i = 0; i < aVarArr.length; i++) {
                    d.a aVar = this.f10121a[i];
                    d.a aVar2 = aVarArr[i];
                    d.a aVar3 = aVarArr2[i];
                    Objects.requireNonNull(aVar);
                    aVar.f5208a = aVar2.f5208a;
                    int i10 = 0;
                    while (true) {
                        float[] fArr = aVar2.f5209b;
                        if (i10 >= fArr.length) {
                            break;
                        }
                        aVar.f5209b[i10] = (aVar3.f5209b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                        i10++;
                    }
                }
                return this.f10121a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0305  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r27
            int r11 = r25.getDepth()
            r0 = 0
            r1 = 0
            r12 = r1
        L_0x000f:
            int r1 = r25.next()
            r2 = 3
            r13 = 0
            if (r1 != r2) goto L_0x001d
            int r3 = r25.getDepth()
            if (r3 <= r11) goto L_0x032c
        L_0x001d:
            r3 = 1
            if (r1 == r3) goto L_0x032c
            r4 = 2
            if (r1 == r4) goto L_0x0024
            goto L_0x000f
        L_0x0024:
            java.lang.String r1 = r25.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0044
            android.animation.ObjectAnimator r6 = new android.animation.ObjectAnimator
            r6.<init>()
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r6
            r5 = r25
            e(r0, r1, r2, r3, r4, r5)
            goto L_0x005b
        L_0x0044:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0060
            r4 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r5 = r25
            android.animation.ValueAnimator r6 = e(r0, r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = r6
            r18 = r11
            goto L_0x02ff
        L_0x0060:
            java.lang.String r5 = "set"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0095
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            int[] r0 = q1.a.f10106h
            r15 = r26
            android.content.res.TypedArray r6 = f0.k.l(r7, r8, r15, r0)
            java.lang.String r0 = "ordering"
            int r16 = f0.k.f(r6, r9, r0, r13, r13)
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r14
            r17 = r6
            r6 = r16
            a(r0, r1, r2, r3, r4, r5, r6)
            r17.recycle()
            r18 = r11
            r0 = r14
            goto L_0x02ff
        L_0x0095:
            r15 = r26
            java.lang.String r5 = "propertyValuesHolder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0315
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r25)
            r6 = 0
            r21 = r13
            r13 = r3
            r3 = r21
        L_0x00a9:
            int r14 = r25.getEventType()
            if (r14 == r2) goto L_0x02db
            if (r14 == r13) goto L_0x02db
            if (r14 == r4) goto L_0x00b7
            r25.next()
            goto L_0x00a9
        L_0x00b7:
            java.lang.String r14 = r25.getName()
            boolean r14 = r14.equals(r5)
            if (r14 == 0) goto L_0x02c4
            int[] r3 = q1.a.i
            android.content.res.TypedArray r3 = f0.k.l(r7, r8, r1, r3)
            java.lang.String r13 = "propertyName"
            java.lang.String r13 = f0.k.g(r3, r9, r13, r2)
            java.lang.String r14 = "valueType"
            r16 = r1
            r1 = 4
            int r1 = f0.k.f(r3, r9, r14, r4, r1)
            r4 = 0
            r14 = r1
            r17 = r5
        L_0x00da:
            int r5 = r25.next()
            if (r5 == r2) goto L_0x01c7
            r18 = r2
            r2 = 1
            if (r5 == r2) goto L_0x01c7
            java.lang.String r2 = r25.getName()
            java.lang.String r5 = "keyframe"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b8
            java.lang.String r2 = "value"
            r5 = 4
            if (r14 != r5) goto L_0x0125
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r25)
            int[] r14 = q1.a.f10107j
            android.content.res.TypedArray r5 = f0.k.l(r7, r8, r5, r14)
            boolean r14 = f0.k.k(r9, r2)
            if (r14 != 0) goto L_0x0108
            r14 = 0
            goto L_0x010d
        L_0x0108:
            r14 = 0
            android.util.TypedValue r14 = r5.peekValue(r14)
        L_0x010d:
            if (r14 == 0) goto L_0x0112
            r19 = 1
            goto L_0x0114
        L_0x0112:
            r19 = 0
        L_0x0114:
            if (r19 == 0) goto L_0x0121
            int r14 = r14.type
            boolean r14 = d(r14)
            if (r14 == 0) goto L_0x0121
            r14 = r18
            goto L_0x0122
        L_0x0121:
            r14 = 0
        L_0x0122:
            r5.recycle()
        L_0x0125:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r25)
            r18 = r11
            int[] r11 = q1.a.f10107j
            android.content.res.TypedArray r5 = f0.k.l(r7, r8, r5, r11)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r7 = "fraction"
            r8 = 3
            float r7 = f0.k.e(r5, r9, r7, r8, r11)
            boolean r8 = f0.k.k(r9, r2)
            if (r8 != 0) goto L_0x0142
            r8 = 0
            goto L_0x0147
        L_0x0142:
            r8 = 0
            android.util.TypedValue r8 = r5.peekValue(r8)
        L_0x0147:
            if (r8 == 0) goto L_0x014b
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            r15 = 4
            if (r14 != r15) goto L_0x015d
            if (r11 == 0) goto L_0x015b
            int r8 = r8.type
            boolean r8 = d(r8)
            if (r8 == 0) goto L_0x015b
            r8 = 3
            goto L_0x015e
        L_0x015b:
            r8 = 0
            goto L_0x015e
        L_0x015d:
            r8 = r14
        L_0x015e:
            if (r11 == 0) goto L_0x017f
            if (r8 == 0) goto L_0x0174
            r11 = 1
            if (r8 == r11) goto L_0x016a
            r11 = 3
            if (r8 == r11) goto L_0x016a
            r2 = 0
            goto L_0x018a
        L_0x016a:
            r8 = 0
            int r2 = f0.k.f(r5, r9, r2, r8, r8)
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r7, r2)
            goto L_0x018a
        L_0x0174:
            r8 = 0
            r11 = 0
            float r2 = f0.k.e(r5, r9, r2, r8, r11)
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r7, r2)
            goto L_0x018a
        L_0x017f:
            if (r8 != 0) goto L_0x0186
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r7)
            goto L_0x018a
        L_0x0186:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r7)
        L_0x018a:
            java.lang.String r7 = "interpolator"
            boolean r7 = f0.k.k(r9, r7)
            if (r7 != 0) goto L_0x0194
            r7 = 0
            goto L_0x019a
        L_0x0194:
            r7 = 0
            r8 = 1
            int r7 = r5.getResourceId(r8, r7)
        L_0x019a:
            r8 = r22
            if (r7 <= 0) goto L_0x01a5
            android.view.animation.Interpolator r7 = android.view.animation.AnimationUtils.loadInterpolator(r8, r7)
            r2.setInterpolator(r7)
        L_0x01a5:
            r5.recycle()
            if (r2 == 0) goto L_0x01b4
            if (r4 != 0) goto L_0x01b1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01b1:
            r4.add(r2)
        L_0x01b4:
            r25.next()
            goto L_0x01bc
        L_0x01b8:
            r8 = r22
            r18 = r11
        L_0x01bc:
            r2 = 3
            r7 = r23
            r8 = r24
            r15 = r26
            r11 = r18
            goto L_0x00da
        L_0x01c7:
            r8 = r22
            r18 = r11
            if (r4 == 0) goto L_0x02a4
            int r2 = r4.size()
            if (r2 <= 0) goto L_0x02a4
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            android.animation.Keyframe r5 = (android.animation.Keyframe) r5
            int r7 = r2 + -1
            java.lang.Object r7 = r4.get(r7)
            android.animation.Keyframe r7 = (android.animation.Keyframe) r7
            float r11 = r7.getFraction()
            r15 = 1065353216(0x3f800000, float:1.0)
            int r19 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r19 >= 0) goto L_0x0203
            r19 = 0
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 >= 0) goto L_0x01f6
            r7.setFraction(r15)
            goto L_0x0203
        L_0x01f6:
            int r11 = r4.size()
            android.animation.Keyframe r7 = b(r7, r15)
            r4.add(r11, r7)
            int r2 = r2 + 1
        L_0x0203:
            float r7 = r5.getFraction()
            r11 = 0
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x021e
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x0214
            r5.setFraction(r11)
            goto L_0x021e
        L_0x0214:
            android.animation.Keyframe r5 = b(r5, r11)
            r7 = 0
            r4.add(r7, r5)
            int r2 = r2 + 1
        L_0x021e:
            android.animation.Keyframe[] r5 = new android.animation.Keyframe[r2]
            r4.toArray(r5)
            r4 = 0
        L_0x0224:
            if (r4 >= r2) goto L_0x0296
            r7 = r5[r4]
            float r11 = r7.getFraction()
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 >= 0) goto L_0x0240
            if (r4 != 0) goto L_0x0237
            r7.setFraction(r15)
            goto L_0x0240
        L_0x0237:
            int r11 = r2 + -1
            if (r4 != r11) goto L_0x0243
            r11 = 1065353216(0x3f800000, float:1.0)
            r7.setFraction(r11)
        L_0x0240:
            r19 = r2
            goto L_0x028f
        L_0x0243:
            int r7 = r4 + 1
            r15 = r4
        L_0x0246:
            if (r7 >= r11) goto L_0x025d
            r19 = r5[r7]
            float r19 = r19.getFraction()
            r20 = 0
            int r19 = (r19 > r20 ? 1 : (r19 == r20 ? 0 : -1))
            if (r19 < 0) goto L_0x0255
            goto L_0x025d
        L_0x0255:
            int r15 = r7 + 1
            r21 = r15
            r15 = r7
            r7 = r21
            goto L_0x0246
        L_0x025d:
            int r7 = r15 + 1
            r7 = r5[r7]
            float r7 = r7.getFraction()
            int r11 = r4 + -1
            r11 = r5[r11]
            float r11 = r11.getFraction()
            float r7 = r7 - r11
            int r11 = r15 - r4
            int r11 = r11 + 2
            float r11 = (float) r11
            float r7 = r7 / r11
            r11 = r4
        L_0x0275:
            if (r11 > r15) goto L_0x0240
            r19 = r2
            r2 = r5[r11]
            int r20 = r11 + -1
            r20 = r5[r20]
            float r20 = r20.getFraction()
            float r8 = r20 + r7
            r2.setFraction(r8)
            int r11 = r11 + 1
            r8 = r22
            r2 = r19
            goto L_0x0275
        L_0x028f:
            int r4 = r4 + 1
            r8 = r22
            r2 = r19
            goto L_0x0224
        L_0x0296:
            r2 = 2
            android.animation.PropertyValuesHolder r4 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r5)
            r5 = 3
            if (r14 != r5) goto L_0x02a7
            q1.d r7 = q1.d.f10122a
            r4.setEvaluator(r7)
            goto L_0x02a7
        L_0x02a4:
            r5 = 3
            r2 = 2
            r4 = 0
        L_0x02a7:
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x02af
            android.animation.PropertyValuesHolder r4 = c(r3, r1, r7, r8, r13)
        L_0x02af:
            if (r4 == 0) goto L_0x02bc
            if (r6 != 0) goto L_0x02b9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6 = r1
        L_0x02b9:
            r6.add(r4)
        L_0x02bc:
            r3.recycle()
            r4 = r2
            r2 = r5
            r3 = r7
            r13 = r8
            goto L_0x02ca
        L_0x02c4:
            r16 = r1
            r17 = r5
            r18 = r11
        L_0x02ca:
            r25.next()
            r7 = r23
            r8 = r24
            r15 = r26
            r1 = r16
            r5 = r17
            r11 = r18
            goto L_0x00a9
        L_0x02db:
            r18 = r11
            if (r6 == 0) goto L_0x02f2
            int r1 = r6.size()
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r1]
        L_0x02e5:
            if (r3 >= r1) goto L_0x02f3
            java.lang.Object r4 = r6.get(r3)
            android.animation.PropertyValuesHolder r4 = (android.animation.PropertyValuesHolder) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x02e5
        L_0x02f2:
            r2 = 0
        L_0x02f3:
            if (r2 == 0) goto L_0x02ff
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x02ff
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r2)
        L_0x02ff:
            if (r10 == 0) goto L_0x030d
            if (r13 != 0) goto L_0x030d
            if (r12 != 0) goto L_0x030a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x030a:
            r12.add(r0)
        L_0x030d:
            r7 = r23
            r8 = r24
            r11 = r18
            goto L_0x000f
        L_0x0315:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown animator name: "
            java.lang.StringBuilder r1 = a.a.d(r1)
            java.lang.String r2 = r25.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x032c:
            if (r10 == 0) goto L_0x0355
            if (r12 == 0) goto L_0x0355
            int r1 = r12.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r12.iterator()
        L_0x033a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x034c
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r13 + 1
            r1[r13] = r3
            r13 = r4
            goto L_0x033a
        L_0x034c:
            if (r28 != 0) goto L_0x0352
            r10.playTogether(r1)
            goto L_0x0355
        L_0x0352:
            r10.playSequentially(r1)
        L_0x0355:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.c.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f10) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f10);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f10);
        }
        return Keyframe.ofObject(f10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder c(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = r1
            goto L_0x000b
        L_0x000a:
            r3 = r2
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = r1
            goto L_0x001a
        L_0x0019:
            r5 = r2
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = d(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = d(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = r7
            goto L_0x0037
        L_0x0036:
            r12 = r2
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = r1
            goto L_0x003c
        L_0x003b:
            r6 = r2
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            g0.d$a[] r13 = g0.d.c(r12)
            g0.d$a[] r14 = g0.d.c(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0165
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            q1.c$a r0 = new q1.c$a
            r0.<init>()
            if (r14 == 0) goto L_0x008d
            boolean r3 = g0.d.a(r13, r14)
            if (r3 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0095
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L_0x0095:
            r8 = r11
            goto L_0x0165
        L_0x0098:
            if (r14 == 0) goto L_0x0165
            q1.c$a r11 = new q1.c$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0165
        L_0x00a9:
            if (r12 != r7) goto L_0x00ae
            q1.d r12 = q1.d.f10122a
            goto L_0x00af
        L_0x00ae:
            r12 = r8
        L_0x00af:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f7
            if (r3 == 0) goto L_0x00e1
            if (r0 != r7) goto L_0x00bc
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c0
        L_0x00bc:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c0:
            if (r5 == 0) goto L_0x00d8
            if (r4 != r7) goto L_0x00c9
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cd
        L_0x00c9:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cd:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x00f4
        L_0x00d8:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00f4
        L_0x00e1:
            if (r4 != r7) goto L_0x00e8
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ec
        L_0x00e8:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ec:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
        L_0x00f4:
            r8 = r11
            goto L_0x015e
        L_0x00f7:
            if (r3 == 0) goto L_0x013d
            if (r0 != r7) goto L_0x0101
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0110
        L_0x0101:
            boolean r0 = d(r0)
            if (r0 == 0) goto L_0x010c
            int r13 = r11.getColor(r13, r2)
            goto L_0x0110
        L_0x010c:
            int r13 = r11.getInt(r13, r2)
        L_0x0110:
            if (r5 == 0) goto L_0x0134
            if (r4 != r7) goto L_0x011a
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0129
        L_0x011a:
            boolean r0 = d(r4)
            if (r0 == 0) goto L_0x0125
            int r11 = r11.getColor(r14, r2)
            goto L_0x0129
        L_0x0125:
            int r11 = r11.getInt(r14, r2)
        L_0x0129:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015e
        L_0x0134:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015e
        L_0x013d:
            if (r5 == 0) goto L_0x015e
            if (r4 != r7) goto L_0x0147
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0156
        L_0x0147:
            boolean r13 = d(r4)
            if (r13 == 0) goto L_0x0152
            int r11 = r11.getColor(r14, r2)
            goto L_0x0156
        L_0x0152:
            int r11 = r11.getInt(r14, r2)
        L_0x0156:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015e:
            if (r8 == 0) goto L_0x0165
            if (r12 == 0) goto L_0x0165
            r8.setEvaluator(r12)
        L_0x0165:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.c.c(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static boolean d(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        TypedArray l10 = k.l(resources2, theme2, attributeSet2, a.g);
        TypedArray l11 = k.l(resources2, theme2, attributeSet2, a.f10108k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long f10 = (long) k.f(l10, xmlPullParser2, "duration", 1, 300);
        int i = 0;
        long f11 = (long) k.f(l10, xmlPullParser2, "startOffset", 2, 0);
        int f12 = k.f(l10, xmlPullParser2, "valueType", 7, 4);
        if (k.k(xmlPullParser2, "valueFrom") && k.k(xmlPullParser2, "valueTo")) {
            if (f12 == 4) {
                TypedValue peekValue = l10.peekValue(5);
                boolean z = peekValue != null;
                int i10 = z ? peekValue.type : 0;
                TypedValue peekValue2 = l10.peekValue(6);
                boolean z10 = peekValue2 != null;
                f12 = ((!z || !d(i10)) && (!z10 || !d(z10 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder c10 = c(l10, f12, 5, 6, BuildConfig.FLAVOR);
            if (c10 != null) {
                valueAnimator4.setValues(new PropertyValuesHolder[]{c10});
            }
        }
        valueAnimator4.setDuration(f10);
        valueAnimator4.setStartDelay(f11);
        valueAnimator4.setRepeatCount(k.f(l10, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(k.f(l10, xmlPullParser2, "repeatMode", 4, 1));
        if (l11 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String g = k.g(l11, xmlPullParser2, "pathData", 1);
            if (g != null) {
                String g8 = k.g(l11, xmlPullParser2, "propertyXName", 2);
                String g10 = k.g(l11, xmlPullParser2, "propertyYName", 3);
                if (g8 == null && g10 == null) {
                    throw new InflateException(l11.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d10 = d.d(g);
                PathMeasure pathMeasure = new PathMeasure(d10, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f13 = 0.0f;
                do {
                    f13 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f13));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d10, false);
                int min = Math.min(100, ((int) (f13 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f14 = f13 / ((float) (min - 1));
                valueAnimator2 = valueAnimator4;
                typedArray = l10;
                int i11 = 0;
                float f15 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i >= min) {
                        break;
                    }
                    int i12 = min;
                    pathMeasure2.getPosTan(f15 - ((Float) arrayList.get(i11)).floatValue(), fArr3, (float[]) null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f15 += f14;
                    int i13 = i11 + 1;
                    if (i13 < arrayList.size() && f15 > ((Float) arrayList.get(i13)).floatValue()) {
                        pathMeasure2.nextContour();
                        i11 = i13;
                    }
                    i++;
                    min = i12;
                }
                PropertyValuesHolder ofFloat = g8 != null ? PropertyValuesHolder.ofFloat(g8, fArr) : null;
                if (g10 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(g10, fArr2);
                }
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat});
                    } else {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = l10;
                objectAnimator.setPropertyName(k.g(l11, xmlPullParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = l10;
        }
        if (!k.k(xmlPullParser2, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        }
        if (i > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (l11 != null) {
            l11.recycle();
        }
        return valueAnimator3;
    }
}
