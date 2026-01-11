package ch.hsr.geohash;

import a8.a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class GeoHash implements Comparable<GeoHash>, Serializable {
    public static final long FIRST_BIT_FLAGGED = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f3463c = {16, 8, 4, 2, 1};

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f3464d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: e  reason: collision with root package name */
    public static final Map<Character, Integer> f3465e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public WGS84Point f3466a;

    /* renamed from: b  reason: collision with root package name */
    public BoundingBox f3467b;
    public long bits = 0;
    public byte significantBits = 0;

    static {
        for (int i = 0; i < 32; i++) {
            f3465e.put(Character.valueOf(f3464d[i]), Integer.valueOf(i));
        }
    }

    public GeoHash() {
    }

    public GeoHash(double d10, double d11, int i) {
        this.f3466a = new WGS84Point(d10, d11);
        int min = Math.min(i, 64);
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        boolean z = true;
        while (this.significantBits < min) {
            if (z) {
                a(d11, dArr2);
            } else {
                a(d10, dArr);
            }
            z = !z;
        }
        a(this, dArr, dArr2);
        this.bits <<= 64 - min;
    }

    public static String a(String str, int i, String str2) {
        return String.format(a.b("%", i, "s"), new Object[]{str}).replace(" ", str2);
    }

    public static void a(GeoHash geoHash, double[] dArr, boolean z) {
        double d10 = (dArr[0] + dArr[1]) / 2.0d;
        if (z) {
            geoHash.addOnBitToEnd();
            dArr[0] = d10;
            return;
        }
        geoHash.addOffBitToEnd();
        dArr[1] = d10;
    }

    public static void a(GeoHash geoHash, double[] dArr, double[] dArr2) {
        geoHash.f3467b = new BoundingBox(dArr[0], dArr[1], dArr2[0], dArr2[1]);
    }

    public static GeoHash fromBinaryString(String str) {
        GeoHash geoHash = new GeoHash();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                geoHash.addOnBitToEnd();
            } else if (str.charAt(i) == '0') {
                geoHash.addOffBitToEnd();
            } else {
                throw new IllegalArgumentException(a.c(str, " is not a valid geohash as a binary string"));
            }
        }
        geoHash.bits <<= 64 - geoHash.significantBits;
        return geoHash.recombineLatLonBitsToHash(geoHash.getRightAlignedLatitudeBits(), geoHash.getRightAlignedLongitudeBits());
    }

    public static GeoHash fromGeohashString(String str) {
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        GeoHash geoHash = new GeoHash();
        boolean z = true;
        for (int i = 0; i < str.length(); i++) {
            int intValue = ((Integer) ((HashMap) f3465e).get(Character.valueOf(str.charAt(i)))).intValue();
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = f3463c[i10] & intValue;
                if (z) {
                    a(geoHash, dArr2, i11 != 0);
                } else {
                    a(geoHash, dArr, i11 != 0);
                }
                z = !z;
            }
        }
        geoHash.f3466a = new WGS84Point((dArr[0] + dArr[1]) / 2.0d, (dArr2[0] + dArr2[1]) / 2.0d);
        a(geoHash, dArr, dArr2);
        geoHash.bits <<= 64 - geoHash.significantBits;
        return geoHash;
    }

    public static GeoHash fromLongValue(long j10, int i) {
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        GeoHash geoHash = new GeoHash();
        String binaryString = Long.toBinaryString(j10);
        while (binaryString.length() < 64) {
            binaryString = a.c("0", binaryString);
        }
        boolean z = true;
        for (int i10 = 0; i10 < i; i10++) {
            char charAt = binaryString.charAt(i10);
            if (z) {
                a(geoHash, dArr2, charAt != '0');
            } else {
                a(geoHash, dArr, charAt != '0');
            }
            z = !z;
        }
        geoHash.f3466a = new WGS84Point((dArr[0] + dArr[1]) / 2.0d, (dArr2[0] + dArr2[1]) / 2.0d);
        a(geoHash, dArr, dArr2);
        geoHash.bits <<= 64 - geoHash.significantBits;
        return geoHash;
    }

    public static GeoHash fromOrd(long j10, int i) {
        return fromLongValue(j10 << (64 - i), i);
    }

    public static String geoHashStringWithCharacterPrecision(double d10, double d11, int i) {
        return withCharacterPrecision(d10, d11, i).toBase32();
    }

    public static long stepsBetween(GeoHash geoHash, GeoHash geoHash2) {
        if (geoHash.significantBits() == geoHash2.significantBits()) {
            return geoHash2.ord() - geoHash.ord();
        }
        throw new IllegalArgumentException("It is only valid to compare the number of steps between two hashes if they have the same number of significant bits");
    }

    public static GeoHash withBitPrecision(double d10, double d11, int i) {
        if (i > 64) {
            throw new IllegalArgumentException("A Geohash can only be 64 bits long!");
        } else if (Math.abs(d10) <= 90.0d && Math.abs(d11) <= 180.0d) {
            return new GeoHash(d10, d11, i);
        } else {
            throw new IllegalArgumentException("Can't have lat/lon values out of (-90,90)/(-180/180)");
        }
    }

    public static GeoHash withCharacterPrecision(double d10, double d11, int i) {
        if (i <= 12) {
            int i10 = i * 5;
            return new GeoHash(d10, d11, i10 <= 60 ? i10 : 60);
        }
        throw new IllegalArgumentException("A geohash can only be 12 character long.");
    }

    public final long a(long j10, int i) {
        long j11 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            if ((j10 & Long.MIN_VALUE) == Long.MIN_VALUE) {
                j11 |= 1;
            }
            j11 <<= 1;
            j10 <<= 2;
        }
        return j11 >>> 1;
    }

    public final long a(long j10, long j11) {
        return j10 & (-1 >>> ((int) (64 - j11)));
    }

    public final void a(double d10, double[] dArr) {
        double d11 = (dArr[0] + dArr[1]) / 2.0d;
        if (d10 >= d11) {
            addOnBitToEnd();
            dArr[0] = d11;
            return;
        }
        addOffBitToEnd();
        dArr[1] = d11;
    }

    public final void addOffBitToEnd() {
        this.significantBits = (byte) (this.significantBits + 1);
        this.bits <<= 1;
    }

    public final void addOnBitToEnd() {
        this.significantBits = (byte) (this.significantBits + 1);
        this.bits = (this.bits << 1) | 1;
    }

    public int compareTo(GeoHash geoHash) {
        int compare = Long.compare(this.bits ^ Long.MIN_VALUE, Long.MIN_VALUE ^ geoHash.bits);
        return compare != 0 ? compare : Integer.compare(this.significantBits, geoHash.significantBits);
    }

    public boolean contains(WGS84Point wGS84Point) {
        return this.f3467b.contains(wGS84Point);
    }

    public boolean enclosesCircleAroundPoint(WGS84Point wGS84Point, double d10) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeoHash)) {
            return false;
        }
        GeoHash geoHash = (GeoHash) obj;
        return geoHash.significantBits == this.significantBits && geoHash.bits == this.bits;
    }

    public GeoHash[] getAdjacent() {
        GeoHash northernNeighbour = getNorthernNeighbour();
        GeoHash easternNeighbour = getEasternNeighbour();
        GeoHash southernNeighbour = getSouthernNeighbour();
        return new GeoHash[]{northernNeighbour, northernNeighbour.getEasternNeighbour(), easternNeighbour, southernNeighbour.getEasternNeighbour(), southernNeighbour, southernNeighbour.getWesternNeighbour(), getWesternNeighbour(), northernNeighbour.getWesternNeighbour()};
    }

    public BoundingBox getBoundingBox() {
        return this.f3467b;
    }

    public WGS84Point getBoundingBoxCenter() {
        return this.f3467b.getCenter();
    }

    public int getCharacterPrecision() {
        byte b10 = this.significantBits;
        if (b10 % 5 == 0) {
            return b10 / 5;
        }
        throw new IllegalStateException("precision of GeoHash is not divisble by 5: " + this);
    }

    public GeoHash getEasternNeighbour() {
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLongitudeBits[0] = rightAlignedLongitudeBits[0] + 1;
        rightAlignedLongitudeBits[0] = a(rightAlignedLongitudeBits[0], rightAlignedLongitudeBits[1]);
        return recombineLatLonBitsToHash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public GeoHash getNorthernNeighbour() {
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLatitudeBits[0] = rightAlignedLatitudeBits[0] + 1;
        rightAlignedLatitudeBits[0] = a(rightAlignedLatitudeBits[0], rightAlignedLatitudeBits[1]);
        return recombineLatLonBitsToHash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public int[] getNumberOfLatLonBits() {
        byte b10 = this.significantBits;
        if (b10 % 2 == 0) {
            int i = b10 / 2;
            return new int[]{i, i};
        }
        int i10 = b10 / 2;
        return new int[]{i10, i10 + 1};
    }

    public WGS84Point getOriginatingPoint() {
        return this.f3466a;
    }

    public long[] getRightAlignedLatitudeBits() {
        return new long[]{a(this.bits << 1, getNumberOfLatLonBits()[0]), (long) getNumberOfLatLonBits()[0]};
    }

    public long[] getRightAlignedLongitudeBits() {
        return new long[]{a(this.bits, getNumberOfLatLonBits()[1]), (long) getNumberOfLatLonBits()[1]};
    }

    public GeoHash getSouthernNeighbour() {
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLatitudeBits[0] = rightAlignedLatitudeBits[0] - 1;
        rightAlignedLatitudeBits[0] = a(rightAlignedLatitudeBits[0], rightAlignedLatitudeBits[1]);
        return recombineLatLonBitsToHash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public GeoHash getWesternNeighbour() {
        long[] rightAlignedLatitudeBits = getRightAlignedLatitudeBits();
        long[] rightAlignedLongitudeBits = getRightAlignedLongitudeBits();
        rightAlignedLongitudeBits[0] = rightAlignedLongitudeBits[0] - 1;
        rightAlignedLongitudeBits[0] = a(rightAlignedLongitudeBits[0], rightAlignedLongitudeBits[1]);
        return recombineLatLonBitsToHash(rightAlignedLatitudeBits, rightAlignedLongitudeBits);
    }

    public int hashCode() {
        long j10 = this.bits;
        return ((((int) (j10 ^ (j10 >>> 32))) + 527) * 31) + this.significantBits;
    }

    public long longValue() {
        return this.bits;
    }

    public GeoHash next() {
        return next(1);
    }

    public GeoHash next(int i) {
        return fromOrd(ord() + ((long) i), this.significantBits);
    }

    public long ord() {
        return this.bits >>> (64 - this.significantBits);
    }

    public GeoHash prev() {
        return next(-1);
    }

    public GeoHash recombineLatLonBitsToHash(long[] jArr, long[] jArr2) {
        GeoHash geoHash = new GeoHash();
        jArr[0] = jArr[0] << ((int) (64 - jArr[1]));
        jArr2[0] = jArr2[0] << ((int) (64 - jArr2[1]));
        double[] dArr = {-90.0d, 90.0d};
        double[] dArr2 = {-180.0d, 180.0d};
        boolean z = false;
        for (int i = 0; ((long) i) < jArr[1] + jArr2[1]; i++) {
            if (z) {
                a(geoHash, dArr, (jArr[0] & Long.MIN_VALUE) == Long.MIN_VALUE);
                jArr[0] = jArr[0] << 1;
            } else {
                a(geoHash, dArr2, (jArr2[0] & Long.MIN_VALUE) == Long.MIN_VALUE);
                jArr2[0] = jArr2[0] << 1;
            }
            z = !z;
        }
        geoHash.bits <<= 64 - geoHash.significantBits;
        a(geoHash, dArr, dArr2);
        geoHash.f3466a = geoHash.f3467b.getCenter();
        return geoHash;
    }

    public int significantBits() {
        return this.significantBits;
    }

    public String toBase32() {
        if (this.significantBits % 5 == 0) {
            StringBuilder sb2 = new StringBuilder();
            long j10 = this.bits;
            int ceil = (int) Math.ceil(((double) this.significantBits) / 5.0d);
            for (int i = 0; i < ceil; i++) {
                sb2.append(f3464d[(int) ((j10 & -576460752303423488L) >>> 59)]);
                j10 <<= 5;
            }
            return sb2.toString();
        }
        throw new IllegalStateException("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
    }

    public String toBinaryString() {
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.bits;
        for (int i = 0; i < this.significantBits; i++) {
            sb2.append((j10 & Long.MIN_VALUE) == Long.MIN_VALUE ? '1' : '0');
            j10 <<= 1;
        }
        return sb2.toString();
    }

    public String toString() {
        if (this.significantBits % 5 == 0) {
            return String.format("%s -> %s -> %s", new Object[]{a(Long.toBinaryString(this.bits), 64, "0"), this.f3467b, toBase32()});
        }
        return String.format("%s -> %s, bits: %d", new Object[]{a(Long.toBinaryString(this.bits), 64, "0"), this.f3467b, Byte.valueOf(this.significantBits)});
    }

    public boolean within(GeoHash geoHash) {
        long j10 = this.bits;
        byte b10 = geoHash.significantBits;
        if ((j10 & (b10 == 0 ? 0 : -9223372036854775808 >> (b10 - 1))) == geoHash.bits) {
            return true;
        }
        return false;
    }
}
