package k4;

import java.io.Serializable;

public final class e implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final d f7444b = d.f7443a;

    /* renamed from: a  reason: collision with root package name */
    public final String f7445a;

    public e(String str) {
        if (str != null) {
            this.f7445a = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != e.class) {
            return false;
        }
        return this.f7445a.equals(((e) obj).f7445a);
    }

    public final int hashCode() {
        return this.f7445a.hashCode();
    }

    public final String toString() {
        return this.f7445a;
    }
}
