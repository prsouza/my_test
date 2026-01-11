package i2;

import g9.f;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public final class u extends p {

    /* renamed from: a  reason: collision with root package name */
    public final Serializable f6006a;

    public u(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f6006a = bool;
    }

    public static boolean g(u uVar) {
        Serializable serializable = uVar.f6006a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    public final String e() {
        Serializable serializable = this.f6006a;
        if (serializable instanceof Number) {
            return i().toString();
        }
        return serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f6006a == null) {
            return uVar.f6006a == null;
        }
        if (g(this) && g(uVar)) {
            return i().longValue() == uVar.i().longValue();
        }
        Serializable serializable = this.f6006a;
        if (!(serializable instanceof Number) || !(uVar.f6006a instanceof Number)) {
            return serializable.equals(uVar.f6006a);
        }
        double doubleValue = i().doubleValue();
        double doubleValue2 = uVar.i().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final boolean h() {
        Serializable serializable = this.f6006a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(e());
    }

    public final int hashCode() {
        long j10;
        if (this.f6006a == null) {
            return 31;
        }
        if (g(this)) {
            j10 = i().longValue();
        } else {
            Serializable serializable = this.f6006a;
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            j10 = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) ((j10 >>> 32) ^ j10);
    }

    public final Number i() {
        Serializable serializable = this.f6006a;
        return serializable instanceof String ? new f((String) serializable) : (Number) serializable;
    }

    public u(Number number) {
        Objects.requireNonNull(number);
        this.f6006a = number;
    }

    public u(String str) {
        Objects.requireNonNull(str);
        this.f6006a = str;
    }
}
