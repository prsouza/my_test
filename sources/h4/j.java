package h4;

import k4.a;
import org.slf4j.helpers.MessageFormatter;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public int f5834a;

    /* renamed from: b  reason: collision with root package name */
    public int f5835b;

    public abstract String a();

    public final boolean b() {
        return this.f5834a == 1;
    }

    public final boolean c() {
        return this.f5834a == 2;
    }

    public final String d() {
        int i = this.f5834a;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i = this.f5834a;
        if (i == 0) {
            sb2.append("/");
        } else if (i != 1) {
            sb2.append(MessageFormatter.DELIM_START);
            String a10 = a();
            if (a10 != null) {
                sb2.append('\"');
                a.a(sb2, a10);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append(MessageFormatter.DELIM_STOP);
        } else {
            sb2.append('[');
            int i10 = this.f5835b;
            if (i10 < 0) {
                i10 = 0;
            }
            sb2.append(i10);
            sb2.append(']');
        }
        return sb2.toString();
    }
}
