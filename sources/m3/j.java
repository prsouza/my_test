package m3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.helpers.MessageFormatter;

public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<i>> f8411b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f8412c;

    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final Map<String, List<i>> f8413b;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<i>> f8414a = f8413b;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb2.append(charAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f8413b = Collections.unmodifiableMap(hashMap);
        }
    }

    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        public final String f8415a;

        public b(String str) {
            this.f8415a = str;
        }

        public final String a() {
            return this.f8415a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f8415a.equals(((b) obj).f8415a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f8415a.hashCode();
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("StringHeaderFactory{value='");
            d10.append(this.f8415a);
            d10.append('\'');
            d10.append(MessageFormatter.DELIM_STOP);
            return d10.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.f8411b = Collections.unmodifiableMap(map);
    }

    public final Map<String, String> a() {
        if (this.f8412c == null) {
            synchronized (this) {
                if (this.f8412c == null) {
                    this.f8412c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f8412c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f8411b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String a10 = ((i) list.get(i)).a();
                if (!TextUtils.isEmpty(a10)) {
                    sb2.append(a10);
                    if (i != list.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String sb3 = sb2.toString();
            if (!TextUtils.isEmpty(sb3)) {
                hashMap.put(next.getKey(), sb3);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f8411b.equals(((j) obj).f8411b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8411b.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("LazyHeaders{headers=");
        d10.append(this.f8411b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
