package l4;

import h4.g;
import java.util.HashSet;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7772a;

    /* renamed from: b  reason: collision with root package name */
    public String f7773b;

    /* renamed from: c  reason: collision with root package name */
    public String f7774c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet<String> f7775d;

    public a(Object obj) {
        this.f7772a = obj;
    }

    public final a a() {
        return new a(this.f7772a);
    }

    public final boolean b(String str) throws g {
        String str2 = this.f7773b;
        if (str2 == null) {
            this.f7773b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.f7774c;
            if (str3 == null) {
                this.f7774c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.f7775d == null) {
                    HashSet<String> hashSet = new HashSet<>(16);
                    this.f7775d = hashSet;
                    hashSet.add(this.f7773b);
                    this.f7775d.add(this.f7774c);
                }
                return !this.f7775d.add(str);
            }
        }
    }
}
