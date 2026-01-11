package ch.hsr.geohash;

import com.github.mikephil.charting.utils.Utils;
import java.io.Serializable;

public class BoundingBox implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public double f3458a;

    /* renamed from: b  reason: collision with root package name */
    public double f3459b;

    /* renamed from: c  reason: collision with root package name */
    public double f3460c;

    /* renamed from: d  reason: collision with root package name */
    public double f3461d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3462e;

    public BoundingBox(double d10, double d11, double d12, double d13) {
        if (d10 > d11) {
            throw new IllegalArgumentException("The southLatitude must not be greater than the northLatitude");
        } else if (Math.abs(d10) > 90.0d || Math.abs(d11) > 90.0d || Math.abs(d12) > 180.0d || Math.abs(d13) > 180.0d) {
            throw new IllegalArgumentException("The supplied coordinates are out of range.");
        } else {
            this.f3459b = d11;
            this.f3460c = d12;
            this.f3458a = d10;
            this.f3461d = d13;
            this.f3462e = d13 < d12;
        }
    }

    public BoundingBox(BoundingBox boundingBox) {
        this(boundingBox.f3458a, boundingBox.f3459b, boundingBox.f3460c, boundingBox.f3461d);
    }

    public BoundingBox(WGS84Point wGS84Point, WGS84Point wGS84Point2) {
        this(wGS84Point.getLatitude(), wGS84Point2.getLatitude(), wGS84Point.getLongitude(), wGS84Point2.getLongitude());
    }

    public static int b(double d10) {
        long doubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final boolean a(double d10) {
        return this.f3462e ? d10 <= this.f3461d || d10 >= this.f3460c : d10 >= this.f3460c && d10 <= this.f3461d;
    }

    public boolean contains(WGS84Point wGS84Point) {
        double latitude = wGS84Point.getLatitude();
        if (!(latitude >= this.f3458a && latitude <= this.f3459b) || !a(wGS84Point.getLongitude())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        return this.f3458a == boundingBox.f3458a && this.f3460c == boundingBox.f3460c && this.f3459b == boundingBox.f3459b && this.f3461d == boundingBox.f3461d;
    }

    public void expandToInclude(BoundingBox boundingBox) {
        BoundingBox boundingBox2 = boundingBox;
        double d10 = boundingBox2.f3458a;
        if (d10 < this.f3458a) {
            this.f3458a = d10;
        }
        double d11 = boundingBox2.f3459b;
        if (d11 > this.f3459b) {
            this.f3459b = d11;
        }
        boolean z = true;
        boolean z10 = a(boundingBox2.f3461d) && a(boundingBox2.f3460c);
        boolean z11 = boundingBox2.a(this.f3461d) && boundingBox2.a(this.f3460c);
        if (z10 && z11) {
            this.f3461d = 180.0d;
            this.f3460c = -180.0d;
            this.f3462e = false;
        } else if (!z10) {
            if (z11) {
                double d12 = boundingBox2.f3461d;
                this.f3461d = d12;
                double d13 = boundingBox2.f3460c;
                this.f3460c = d13;
                if (d12 >= d13) {
                    z = false;
                }
                this.f3462e = z;
                return;
            }
            double d14 = boundingBox2.f3461d;
            double d15 = (d14 - this.f3461d) % 360.0d;
            double d16 = this.f3460c;
            double d17 = boundingBox2.f3460c;
            double d18 = (d16 - d17) % 360.0d;
            if (d15 < Utils.DOUBLE_EPSILON) {
                d15 += 360.0d;
            }
            if (d18 < Utils.DOUBLE_EPSILON) {
                d18 += 360.0d;
            }
            if (d15 <= d18) {
                this.f3461d = d14;
            } else {
                this.f3460c = d17;
            }
            if (this.f3461d >= this.f3460c) {
                z = false;
            }
            this.f3462e = z;
        }
    }

    public WGS84Point getCenter() {
        double d10 = (this.f3458a + this.f3459b) / 2.0d;
        double d11 = (this.f3460c + this.f3461d) / 2.0d;
        if (d11 > 180.0d) {
            d11 -= 360.0d;
        }
        return new WGS84Point(d10, d11);
    }

    public double getEastLongitude() {
        return this.f3461d;
    }

    public double getLatitudeSize() {
        return this.f3459b - this.f3458a;
    }

    public double getLongitudeSize() {
        double d10 = this.f3461d;
        if (d10 == 180.0d && this.f3460c == -180.0d) {
            return 360.0d;
        }
        double d11 = (d10 - this.f3460c) % 360.0d;
        return d11 < Utils.DOUBLE_EPSILON ? d11 + 360.0d : d11;
    }

    public WGS84Point getNorthEastCorner() {
        return new WGS84Point(this.f3459b, this.f3461d);
    }

    public double getNorthLatitude() {
        return this.f3459b;
    }

    public WGS84Point getNorthWestCorner() {
        return new WGS84Point(this.f3459b, this.f3460c);
    }

    public WGS84Point getSouthEastCorner() {
        return new WGS84Point(this.f3458a, this.f3461d);
    }

    public double getSouthLatitude() {
        return this.f3458a;
    }

    public WGS84Point getSouthWestCorner() {
        return new WGS84Point(this.f3458a, this.f3460c);
    }

    public double getWestLongitude() {
        return this.f3460c;
    }

    public int hashCode() {
        int b10 = b(this.f3459b);
        int b11 = b(this.f3460c);
        return b(this.f3461d) + ((b11 + ((b10 + ((b(this.f3458a) + 629) * 37)) * 37)) * 37);
    }

    public boolean intersects(BoundingBox boundingBox) {
        if (boundingBox.f3458a > this.f3459b || boundingBox.f3459b < this.f3458a) {
            return false;
        }
        boolean z = this.f3462e;
        if (!z && !boundingBox.f3462e) {
            return boundingBox.f3461d >= this.f3460c && boundingBox.f3460c <= this.f3461d;
        }
        if (z && !boundingBox.f3462e) {
            return this.f3461d >= boundingBox.f3460c || this.f3460c <= boundingBox.f3461d;
        }
        if (z || !boundingBox.f3462e) {
            return true;
        }
        return this.f3460c <= boundingBox.f3461d || this.f3461d >= boundingBox.f3460c;
    }

    public boolean intersects180Meridian() {
        return this.f3462e;
    }

    public String toString() {
        return getNorthWestCorner() + " -> " + getSouthEastCorner();
    }
}
