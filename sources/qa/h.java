package qa;

import androidx.fragment.app.m;
import e6.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f10339a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10340b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10341c;

    /* renamed from: d  reason: collision with root package name */
    public final b f10342d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10343e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(java.lang.String r2, java.lang.String r3, java.lang.String r4, qa.b r5) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            e6.e.D(r5, r0)
            r1.<init>()
            r1.f10339a = r2
            r1.f10340b = r3
            r1.f10341c = r4
            r1.f10342d = r5
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "getDefault()"
            e6.e.C(r3, r4)
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            e6.e.C(r2, r3)
            int r3 = r2.hashCode()
            switch(r3) {
                case -1360467711: goto L_0x005e;
                case -991745245: goto L_0x0051;
                case -916346253: goto L_0x0044;
                case 28903346: goto L_0x0037;
                case 1671380268: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x006b
        L_0x002a:
            java.lang.String r3 = "discord"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0033
            goto L_0x006b
        L_0x0033:
            r2 = 2131165425(0x7f0700f1, float:1.7945067E38)
            goto L_0x006e
        L_0x0037:
            java.lang.String r3 = "instagram"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0040
            goto L_0x006b
        L_0x0040:
            r2 = 2131165426(0x7f0700f2, float:1.7945069E38)
            goto L_0x006e
        L_0x0044:
            java.lang.String r3 = "twitter"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
            goto L_0x006b
        L_0x004d:
            r2 = 2131165428(0x7f0700f4, float:1.7945073E38)
            goto L_0x006e
        L_0x0051:
            java.lang.String r3 = "youtube"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            r2 = 2131165429(0x7f0700f5, float:1.7945075E38)
            goto L_0x006e
        L_0x005e:
            java.lang.String r3 = "telegram"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            r2 = 2131165427(0x7f0700f3, float:1.794507E38)
            goto L_0x006e
        L_0x006b:
            r2 = 2131165418(0x7f0700ea, float:1.7945053E38)
        L_0x006e:
            r1.f10343e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.h.<init>(java.lang.String, java.lang.String, java.lang.String, qa.b):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return e.r(this.f10339a, hVar.f10339a) && e.r(this.f10340b, hVar.f10340b) && e.r(this.f10341c, hVar.f10341c) && this.f10342d == hVar.f10342d;
    }

    public final int hashCode() {
        return this.f10342d.hashCode() + m.a(this.f10341c, m.a(this.f10340b, this.f10339a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.f10339a;
        String str2 = this.f10340b;
        String str3 = this.f10341c;
        b bVar = this.f10342d;
        return "SocialMedia(name=" + str + ", url=" + str2 + ", pckage=" + str3 + ", type=" + bVar + ")";
    }
}
