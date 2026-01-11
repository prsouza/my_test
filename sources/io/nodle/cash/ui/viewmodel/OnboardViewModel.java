package io.nodle.cash.ui.viewmodel;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.u0;
import e6.e;
import io.nodle.cash.R;
import qa.f;

public final class OnboardViewModel extends u0 {
    public final LiveData<Boolean> A;

    /* renamed from: c  reason: collision with root package name */
    public final Context f6797c;

    /* renamed from: s  reason: collision with root package name */
    public final f f6798s;

    /* renamed from: t  reason: collision with root package name */
    public final ya.b f6799t;

    /* renamed from: u  reason: collision with root package name */
    public final String f6800u = "OnboardViewModel";

    /* renamed from: v  reason: collision with root package name */
    public boolean f6801v;

    /* renamed from: w  reason: collision with root package name */
    public b f6802w = b.NONE;

    /* renamed from: x  reason: collision with root package name */
    public final j0<a> f6803x;

    /* renamed from: y  reason: collision with root package name */
    public final j0<Boolean> f6804y;
    public final LiveData<a> z;

    public enum a {
        NONE,
        LOAD_FRAGMENT,
        LOAD_IMPORT,
        ONBOARD_COMPLETE
    }

    public enum b {
        NONE(0, 0, 0, 0, 0),
        STEP_ONE(R.string.onboard1Title, R.string.onboard1Message, R.drawable.img_onboard_intro, R.string.next, R.string.blank),
        STEP_TWO(R.string.onboard2Title, R.string.onboard2Message, R.drawable.img_onboard_two, R.string.accountCreate, R.string.accountImport),
        STEP_THREE(R.string.onboard3Title, R.string.onboard3Message, R.drawable.img_onboard_referral, R.string.next, R.string.blank),
        STEP_FOUR(R.string.onboard4Title, R.string.onboard4Message, R.drawable.img_onboard_start, R.string.onboardComplete, R.string.blank);
        
        private final int button1Label;
        private final int button2Label;
        private final int details;
        private final int image;
        private final int title;

        private b(int i, int i10, int i11, int i12, int i13) {
            this.title = i;
            this.details = i10;
            this.image = i11;
            this.button1Label = i12;
            this.button2Label = i13;
        }

        public final int getButton1Label() {
            return this.button1Label;
        }

        public final int getButton2Label() {
            return this.button2Label;
        }

        public final int getDetails() {
            return this.details;
        }

        public final int getImage() {
            return this.image;
        }

        public final int getTitle() {
            return this.title;
        }
    }

    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6805a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.STEP_ONE.ordinal()] = 1;
            iArr[b.STEP_TWO.ordinal()] = 2;
            iArr[b.STEP_THREE.ordinal()] = 3;
            iArr[b.STEP_FOUR.ordinal()] = 4;
            f6805a = iArr;
        }
    }

    public OnboardViewModel(Context context, f fVar, ya.b bVar) {
        e.D(bVar, "analytics");
        this.f6797c = context;
        this.f6798s = fVar;
        this.f6799t = bVar;
        j0<a> j0Var = new j0<>(a.NONE);
        this.f6803x = j0Var;
        j0<Boolean> j0Var2 = new j0<>(Boolean.FALSE);
        this.f6804y = j0Var2;
        this.z = j0Var;
        this.A = j0Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        ad.c.z(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.util.List<java.lang.String> r10) {
        /*
            r9 = this;
            r0 = 1
            if (r10 == 0) goto L_0x0005
            r9.f6801v = r0
        L_0x0005:
            r1 = 0
            r2 = 0
            if (r10 != 0) goto L_0x005c
            za.h r10 = za.h.f14215a
            hc.b$a r10 = hc.b.a.TWELVE
            java.lang.String r3 = "length"
            e6.e.D(r10, r3)
            fa.c r3 = new fa.c
            r3.<init>()
            int r10 = r10.getByteLength()     // Catch:{ all -> 0x0055 }
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x0055 }
            java.security.SecureRandom r4 = new java.security.SecureRandom     // Catch:{ all -> 0x0055 }
            r4.<init>()     // Catch:{ all -> 0x0055 }
            r4.nextBytes(r10)     // Catch:{ all -> 0x0055 }
            ga.a r4 = new ga.a     // Catch:{ all -> 0x0055 }
            hc.a r5 = hc.a.INSTANCE     // Catch:{ all -> 0x0055 }
            r4.<init>(r5)     // Catch:{ all -> 0x0055 }
            hc.e r5 = new hc.e     // Catch:{ all -> 0x0055 }
            r5.<init>(r3)     // Catch:{ all -> 0x0055 }
            hc.f r6 = new hc.f     // Catch:{ all -> 0x0055 }
            r6.<init>(r5)     // Catch:{ all -> 0x0055 }
            r4.a(r10, r6)     // Catch:{ all -> 0x0055 }
            byte r4 = (byte) r1     // Catch:{ all -> 0x0055 }
            java.util.Arrays.fill(r10, r4)     // Catch:{ all -> 0x0055 }
            int r10 = r3.length()     // Catch:{ all -> 0x0055 }
            fa.d r4 = fa.d.ALLOW     // Catch:{ all -> 0x0055 }
            java.lang.CharSequence r10 = fa.a.a(r3, r1, r10, r4)     // Catch:{ all -> 0x0055 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0055 }
            hc.b r10 = c3.k.m0(r10)     // Catch:{ all -> 0x0055 }
            ad.c.z(r3, r2)
            java.util.List<java.lang.String> r10 = r10.f5927a
            goto L_0x005c
        L_0x0055:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            ad.c.z(r3, r10)
            throw r0
        L_0x005c:
            java.lang.String r2 = r9.f6800u
            java.lang.String r3 = "registerAccount"
            android.util.Log.d(r2, r3)
            za.h r2 = za.h.f14215a
            r3 = 37
            java.lang.String r3 = r2.g(r10, r3)
            r4 = 42
            java.lang.String r2 = r2.g(r10, r4)
            qa.f r4 = r9.f6798s
            qa.e r5 = qa.e.NODLE_SDK_DEVKEY
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "ss58:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r4.a(r5, r6)
            qa.f r4 = r9.f6798s
            qa.e r5 = qa.e.MNEMONIC
            java.lang.String r10 = ub.f.b(r10)
            r4.a(r5, r10)
            qa.f r10 = r9.f6798s
            qa.e r4 = qa.e.NODLE_PUBLIC_KEY_4
            r10.a(r4, r3)
            qa.f r10 = r9.f6798s
            qa.e r3 = qa.e.NODLE_PUBLIC_KEY_5
            r10.a(r3, r2)
            qa.f r10 = r9.f6798s
            qa.e r2 = qa.e.FCM_TOKEN
            java.lang.String r10 = r10.c(r2)
            if (r10 == 0) goto L_0x00b5
            int r2 = r10.length()
            if (r2 != 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r2 = r1
            goto L_0x00b6
        L_0x00b5:
            r2 = r0
        L_0x00b6:
            if (r2 != 0) goto L_0x00bf
            io.nodle.cash.ui.service.FirebaseMessageService$a r2 = io.nodle.cash.ui.service.FirebaseMessageService.f6689w
            android.content.Context r3 = r9.f6797c
            r2.a(r3, r10)
        L_0x00bf:
            boolean r10 = r9.f6801v
            if (r10 != 0) goto L_0x0128
            android.content.Context r10 = r9.f6797c
            java.lang.String r2 = "cxt"
            e6.e.D(r10, r2)
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0124 }
            java.lang.String r3 = "announcements_list"
            java.lang.String r3 = ah.v.K(r3)     // Catch:{ Exception -> 0x0124 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0124 }
            qa.e r3 = qa.e.ANNOUNCEMENTS_SEEN     // Catch:{ Exception -> 0x0124 }
            java.lang.String r3 = ah.v.J(r10, r3)     // Catch:{ Exception -> 0x0124 }
            int r4 = r2.length()     // Catch:{ Exception -> 0x0124 }
            r5 = r1
        L_0x00e0:
            if (r5 >= r4) goto L_0x011e
            org.json.JSONObject r6 = r2.getJSONObject(r5)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r7 = "title"
            java.lang.String r7 = r6.optString(r7)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r8 = "description"
            java.lang.String r6 = r6.optString(r8)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r6 = a.b.Y(r7, r6)     // Catch:{ Exception -> 0x0124 }
            int r7 = r6.length()     // Catch:{ Exception -> 0x0124 }
            if (r7 <= 0) goto L_0x00fe
            r7 = r0
            goto L_0x00ff
        L_0x00fe:
            r7 = r1
        L_0x00ff:
            if (r7 == 0) goto L_0x011b
            boolean r7 = fe.o.g1(r3, r6)     // Catch:{ Exception -> 0x0124 }
            if (r7 != 0) goto L_0x011b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0124 }
            r7.<init>()     // Catch:{ Exception -> 0x0124 }
            r7.append(r3)     // Catch:{ Exception -> 0x0124 }
            r7.append(r6)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r3 = "|"
            r7.append(r3)     // Catch:{ Exception -> 0x0124 }
            java.lang.String r3 = r7.toString()     // Catch:{ Exception -> 0x0124 }
        L_0x011b:
            int r5 = r5 + 1
            goto L_0x00e0
        L_0x011e:
            qa.e r0 = qa.e.ANNOUNCEMENTS_SEEN     // Catch:{ Exception -> 0x0124 }
            ah.v.f0(r10, r0, r3)     // Catch:{ Exception -> 0x0124 }
            goto L_0x0128
        L_0x0124:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0128:
            androidx.lifecycle.j0<java.lang.Boolean> r10 = r9.f6804y
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.j(r0)
            r9.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.viewmodel.OnboardViewModel.i(java.util.List):void");
    }

    public final void j(a aVar) {
        e.D(aVar, "action");
        String str = this.f6800u;
        Log.d(str, "ViewModel Action: " + aVar);
        this.f6803x.j(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r3 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (r0 < r2.ordinal()) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r13 = this;
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r0 = r13.f6802w
            int r0 = r0.ordinal()
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r1 = io.nodle.cash.ui.viewmodel.OnboardViewModel.b.STEP_ONE
            int r2 = r1.ordinal()
            r3 = 1
            r4 = 0
            if (r0 >= r2) goto L_0x0047
            ya.b r0 = r13.f6799t
            ub.a r0 = r0.getMetadata()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.f11923j
            if (r0 != r3) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r3 = r4
        L_0x001e:
            if (r3 == 0) goto L_0x0022
            goto L_0x0092
        L_0x0022:
            ya.b r0 = r13.f6799t
            ya.f$a r2 = new ya.f$a
            ya.g r3 = ya.g.ONBOARD_STARTED
            r4 = 0
            r2.<init>(r3, r4)
            r0.b(r2)
            ya.b r0 = r13.f6799t
            ub.a r5 = r0.getMetadata()
            if (r5 == 0) goto L_0x0043
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 0
            r12 = 1535(0x5ff, float:2.151E-42)
            ub.a r4 = ub.a.a(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0043:
            r0.d(r4)
            goto L_0x0092
        L_0x0047:
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r0 = r13.f6802w
            int r0 = r0.ordinal()
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r2 = io.nodle.cash.ui.viewmodel.OnboardViewModel.b.STEP_TWO
            int r5 = r2.ordinal()
            if (r0 >= r5) goto L_0x0059
            r13.f6801v = r4
        L_0x0057:
            r1 = r2
            goto L_0x0092
        L_0x0059:
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r0 = r13.f6802w
            int r0 = r0.ordinal()
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r2 = io.nodle.cash.ui.viewmodel.OnboardViewModel.b.STEP_THREE
            int r5 = r2.ordinal()
            if (r0 >= r5) goto L_0x0083
            boolean r0 = r13.f6801v
            if (r0 != 0) goto L_0x0080
            qa.f r0 = r13.f6798s
            qa.e r1 = qa.e.REFERRER
            java.lang.String r0 = r0.c(r1)
            if (r0 == 0) goto L_0x007d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r3 = r4
        L_0x007d:
            if (r3 != 0) goto L_0x0080
            goto L_0x0091
        L_0x0080:
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r1 = io.nodle.cash.ui.viewmodel.OnboardViewModel.b.STEP_FOUR
            goto L_0x0092
        L_0x0083:
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r0 = r13.f6802w
            int r0 = r0.ordinal()
            io.nodle.cash.ui.viewmodel.OnboardViewModel$b r2 = io.nodle.cash.ui.viewmodel.OnboardViewModel.b.STEP_FOUR
            int r3 = r2.ordinal()
            if (r0 >= r3) goto L_0x0092
        L_0x0091:
            goto L_0x0057
        L_0x0092:
            r13.f6802w = r1
            io.nodle.cash.ui.viewmodel.OnboardViewModel$a r0 = io.nodle.cash.ui.viewmodel.OnboardViewModel.a.LOAD_FRAGMENT
            r13.j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.viewmodel.OnboardViewModel.k():void");
    }
}
