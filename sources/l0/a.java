package l0;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.github.mikephil.charting.BuildConfig;
import java.util.Locale;
import l0.e;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final e.d f7736d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f7737e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    public static final String f7738f = Character.toString(8207);
    public static final a g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f7739h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7740a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7741b;

    /* renamed from: c  reason: collision with root package name */
    public final d f7742c;

    /* renamed from: l0.a$a  reason: collision with other inner class name */
    public static class C0140a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f7743e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f7744a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7745b;

        /* renamed from: c  reason: collision with root package name */
        public int f7746c;

        /* renamed from: d  reason: collision with root package name */
        public char f7747d;

        static {
            for (int i = 0; i < 1792; i++) {
                f7743e[i] = Character.getDirectionality(i);
            }
        }

        public C0140a(CharSequence charSequence) {
            this.f7744a = charSequence;
            this.f7745b = charSequence.length();
        }

        public final byte a() {
            char charAt = this.f7744a.charAt(this.f7746c - 1);
            this.f7747d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f7744a, this.f7746c);
                this.f7746c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f7746c--;
            char c10 = this.f7747d;
            return c10 < 1792 ? f7743e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        e.d dVar = e.f7754c;
        f7736d = dVar;
        g = new a(false, 2, dVar);
        f7739h = new a(true, 2, dVar);
    }

    public a(boolean z, int i, d dVar) {
        this.f7740a = z;
        this.f7741b = i;
        this.f7742c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            l0.a$a r0 = new l0.a$a
            r0.<init>(r9)
            r9 = 0
            r0.f7746c = r9
            r1 = -1
            r2 = 1
            r3 = r9
            r4 = r3
            r5 = r4
        L_0x000d:
            int r6 = r0.f7746c
            int r7 = r0.f7745b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f7744a
            char r6 = r7.charAt(r6)
            r0.f7747d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f7744a
            int r7 = r0.f7746c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f7746c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f7746c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f7746c
            int r6 = r6 + r2
            r0.f7746c = r6
            char r6 = r0.f7747d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = l0.a.C0140a.f7743e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = r9
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = r2
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = r1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r9 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f7746c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r9 = r2
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r9 = r1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            l0.a$a r0 = new l0.a$a
            r0.<init>(r6)
            int r6 = r0.f7745b
            r0.f7746c = r6
            r6 = 0
            r1 = r6
        L_0x000b:
            r2 = r1
        L_0x000c:
            int r3 = r0.f7746c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0029:
            if (r1 != r2) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r1 != r2) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r2 = r2 + -1
            goto L_0x000c
        L_0x0032:
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r6 = r4
            goto L_0x0041
        L_0x0036:
            if (r1 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r2 != 0) goto L_0x003d
        L_0x003b:
            r6 = -1
            goto L_0x0041
        L_0x003d:
            if (r1 != 0) goto L_0x000c
        L_0x003f:
            r1 = r2
            goto L_0x000b
        L_0x0041:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i = f.f7759a;
        boolean z = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z = false;
        }
        return z ? f7739h : g;
    }

    public final CharSequence d(CharSequence charSequence, d dVar) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean z = false;
        boolean b10 = ((e.c) dVar).b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f7741b & 2) != 0) {
            z = true;
        }
        String str2 = BuildConfig.FLAVOR;
        if (z) {
            boolean b11 = (b10 ? e.f7753b : e.f7752a).b(charSequence, charSequence.length());
            if (this.f7740a || (!b11 && a(charSequence) != 1)) {
                str = (!this.f7740a || (b11 && a(charSequence) != -1)) ? str2 : f7738f;
            } else {
                str = f7737e;
            }
            spannableStringBuilder.append(str);
        }
        if (b10 != this.f7740a) {
            spannableStringBuilder.append(b10 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean b12 = (b10 ? e.f7753b : e.f7752a).b(charSequence, charSequence.length());
        if (!this.f7740a && (b12 || b(charSequence) == 1)) {
            str2 = f7737e;
        } else if (this.f7740a && (!b12 || b(charSequence) == -1)) {
            str2 = f7738f;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
