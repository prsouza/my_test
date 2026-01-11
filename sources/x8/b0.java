package x8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class b0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<b0> CREATOR = new c0();
    @SafeParcelable.Field(id = 2)

    /* renamed from: a  reason: collision with root package name */
    public Bundle f13023a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f13024b;

    /* renamed from: c  reason: collision with root package name */
    public a f13025c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13026a;

        public a(y yVar) {
            yVar.j("gcm.n.title");
            yVar.g("gcm.n.title");
            a(yVar, "gcm.n.title");
            this.f13026a = yVar.j("gcm.n.body");
            yVar.g("gcm.n.body");
            a(yVar, "gcm.n.body");
            yVar.j("gcm.n.icon");
            if (TextUtils.isEmpty(yVar.j("gcm.n.sound2"))) {
                yVar.j("gcm.n.sound");
            }
            yVar.j("gcm.n.tag");
            yVar.j("gcm.n.color");
            yVar.j("gcm.n.click_action");
            yVar.j("gcm.n.android_channel_id");
            yVar.e();
            yVar.j("gcm.n.image");
            yVar.j("gcm.n.ticker");
            yVar.b("gcm.n.notification_priority");
            yVar.b("gcm.n.visibility");
            yVar.b("gcm.n.notification_count");
            yVar.a("gcm.n.sticky");
            yVar.a("gcm.n.local_only");
            yVar.a("gcm.n.default_sound");
            yVar.a("gcm.n.default_vibrate_timings");
            yVar.a("gcm.n.default_light_settings");
            yVar.h();
            yVar.d();
            yVar.k();
        }

        public static String[] a(y yVar, String str) {
            Object[] f10 = yVar.f(str);
            if (f10 == null) {
                return null;
            }
            String[] strArr = new String[f10.length];
            for (int i = 0; i < f10.length; i++) {
                strArr[i] = String.valueOf(f10[i]);
            }
            return strArr;
        }
    }

    @SafeParcelable.Constructor
    public b0(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f13023a = bundle;
    }

    public final Map<String, String> getData() {
        if (this.f13024b == null) {
            Bundle bundle = this.f13023a;
            s.a aVar = new s.a();
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        aVar.put(next, str);
                    }
                }
            }
            this.f13024b = aVar;
        }
        return this.f13024b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f13023a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
