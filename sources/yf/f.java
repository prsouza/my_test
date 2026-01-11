package yf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public final class f extends b {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f13645b;

    /* renamed from: c  reason: collision with root package name */
    public final BitSet f13646c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13647d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13648e;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public f(Map<CharSequence, CharSequence> map) {
        if (map != null) {
            this.f13645b = new HashMap();
            this.f13646c = new BitSet();
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i10 = 0;
            for (Map.Entry next : map.entrySet()) {
                this.f13645b.put(((CharSequence) next.getKey()).toString(), ((CharSequence) next.getValue()).toString());
                this.f13646c.set(((CharSequence) next.getKey()).charAt(0));
                int length = ((CharSequence) next.getKey()).length();
                i = length < i ? length : i;
                if (length > i10) {
                    i10 = length;
                }
            }
            this.f13647d = i;
            this.f13648e = i10;
            return;
        }
        throw new InvalidParameterException("lookupMap cannot be null");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final int a(CharSequence charSequence, int i, Writer writer) throws IOException {
        if (!this.f13646c.get(charSequence.charAt(i))) {
            return 0;
        }
        int i10 = this.f13648e;
        if (i + i10 > charSequence.length()) {
            i10 = charSequence.length() - i;
        }
        while (i10 >= this.f13647d) {
            String str = (String) this.f13645b.get(charSequence.subSequence(i, i + i10).toString());
            if (str != null) {
                writer.write(str);
                return i10;
            }
            i10--;
        }
        return 0;
    }
}
