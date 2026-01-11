package com.google.android.gms.common.images;

import androidx.appcompat.widget.d;

public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i, int i10) {
        this.zaa = i;
        this.zab = i10;
    }

    public static Size parseSize(String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zaa(str);
                }
            } else {
                throw zaa(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(d.b(new StringBuilder(str.length() + 16), "Invalid Size: \"", str, "\""));
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            return this.zaa == size.zaa && this.zab == size.zab;
        }
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i = this.zab;
        int i10 = this.zaa;
        return i ^ ((i10 >>> 16) | (i10 << 16));
    }

    public String toString() {
        int i = this.zaa;
        int i10 = this.zab;
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append(i);
        sb2.append("x");
        sb2.append(i10);
        return sb2.toString();
    }
}
