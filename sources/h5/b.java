package h5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import b6.c;
import io.nodle.cash.R;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import x5.o;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f5846a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5847b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final float f5848c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5849d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5850e;

    public b(Context context) {
        AttributeSet attributeSet;
        int i;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Locale locale;
        int next;
        a aVar = new a();
        int i17 = aVar.f5851a;
        int i18 = 0;
        if (i17 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i17);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                } else if (TextUtils.equals(xml.getName(), "badge")) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    i = asAttributeSet.getStyleAttribute();
                    attributeSet = asAttributeSet;
                } else {
                    throw new XmlPullParserException("Must have a <badge> start tag");
                }
            } catch (IOException | XmlPullParserException e10) {
                StringBuilder d10 = a.a.d("Can't load badge resource ID #0x");
                d10.append(Integer.toHexString(i17));
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(d10.toString());
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray d11 = o.d(context, attributeSet, e5.a.f4618b, R.attr.badgeStyle, i == 0 ? 2131821543 : i, new int[0]);
        Resources resources = context.getResources();
        this.f5848c = (float) d11.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f5850e = (float) d11.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f5849d = (float) d11.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        a aVar2 = this.f5847b;
        int i19 = aVar.f5854s;
        aVar2.f5854s = i19 == -2 ? 255 : i19;
        CharSequence charSequence = aVar.f5858w;
        aVar2.f5858w = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        a aVar3 = this.f5847b;
        int i20 = aVar.f5859x;
        aVar3.f5859x = i20 == 0 ? R.plurals.mtrl_badge_content_description : i20;
        int i21 = aVar.f5860y;
        aVar3.f5860y = i21 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i21;
        Boolean bool = aVar.A;
        aVar3.A = Boolean.valueOf(bool == null || bool.booleanValue());
        a aVar4 = this.f5847b;
        int i22 = aVar.f5856u;
        aVar4.f5856u = i22 == -2 ? d11.getInt(8, 4) : i22;
        int i23 = aVar.f5855t;
        if (i23 != -2) {
            this.f5847b.f5855t = i23;
        } else if (d11.hasValue(9)) {
            this.f5847b.f5855t = d11.getInt(9, 0);
        } else {
            this.f5847b.f5855t = -1;
        }
        a aVar5 = this.f5847b;
        Integer num = aVar.f5852b;
        if (num == null) {
            i10 = c.a(context, d11, 0).getDefaultColor();
        } else {
            i10 = num.intValue();
        }
        aVar5.f5852b = Integer.valueOf(i10);
        Integer num2 = aVar.f5853c;
        if (num2 != null) {
            this.f5847b.f5853c = num2;
        } else if (d11.hasValue(3)) {
            this.f5847b.f5853c = Integer.valueOf(c.a(context, d11, 3).getDefaultColor());
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2131821083, e5.a.F);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList a10 = c.a(context, obtainStyledAttributes, 3);
            c.a(context, obtainStyledAttributes, 4);
            c.a(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i24 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
            obtainStyledAttributes.getResourceId(i24, 0);
            obtainStyledAttributes.getString(i24);
            obtainStyledAttributes.getBoolean(14, false);
            c.a(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(2131821083, e5.a.f4635u);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.f5847b.f5853c = Integer.valueOf(a10.getDefaultColor());
        }
        a aVar6 = this.f5847b;
        Integer num3 = aVar.z;
        if (num3 == null) {
            i11 = d11.getInt(1, 8388661);
        } else {
            i11 = num3.intValue();
        }
        aVar6.z = Integer.valueOf(i11);
        a aVar7 = this.f5847b;
        Integer num4 = aVar.B;
        if (num4 == null) {
            i12 = d11.getDimensionPixelOffset(6, 0);
        } else {
            i12 = num4.intValue();
        }
        aVar7.B = Integer.valueOf(i12);
        a aVar8 = this.f5847b;
        if (aVar.B == null) {
            i13 = d11.getDimensionPixelOffset(10, 0);
        } else {
            i13 = aVar.C.intValue();
        }
        aVar8.C = Integer.valueOf(i13);
        a aVar9 = this.f5847b;
        Integer num5 = aVar.D;
        if (num5 == null) {
            i14 = d11.getDimensionPixelOffset(7, aVar9.B.intValue());
        } else {
            i14 = num5.intValue();
        }
        aVar9.D = Integer.valueOf(i14);
        a aVar10 = this.f5847b;
        Integer num6 = aVar.E;
        if (num6 == null) {
            i15 = d11.getDimensionPixelOffset(11, aVar10.C.intValue());
        } else {
            i15 = num6.intValue();
        }
        aVar10.E = Integer.valueOf(i15);
        a aVar11 = this.f5847b;
        Integer num7 = aVar.F;
        if (num7 == null) {
            i16 = 0;
        } else {
            i16 = num7.intValue();
        }
        aVar11.F = Integer.valueOf(i16);
        a aVar12 = this.f5847b;
        Integer num8 = aVar.G;
        aVar12.G = Integer.valueOf(num8 != null ? num8.intValue() : i18);
        d11.recycle();
        Locale locale2 = aVar.f5857v;
        if (locale2 == null) {
            a aVar13 = this.f5847b;
            if (Build.VERSION.SDK_INT >= 24) {
                locale = Locale.getDefault(Locale.Category.FORMAT);
            } else {
                locale = Locale.getDefault();
            }
            aVar13.f5857v = locale;
        } else {
            this.f5847b.f5857v = locale2;
        }
        this.f5846a = aVar;
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0094a();
        public Boolean A = Boolean.TRUE;
        public Integer B;
        public Integer C;
        public Integer D;
        public Integer E;
        public Integer F;
        public Integer G;

        /* renamed from: a  reason: collision with root package name */
        public int f5851a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f5852b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f5853c;

        /* renamed from: s  reason: collision with root package name */
        public int f5854s = 255;

        /* renamed from: t  reason: collision with root package name */
        public int f5855t = -2;

        /* renamed from: u  reason: collision with root package name */
        public int f5856u = -2;

        /* renamed from: v  reason: collision with root package name */
        public Locale f5857v;

        /* renamed from: w  reason: collision with root package name */
        public CharSequence f5858w;

        /* renamed from: x  reason: collision with root package name */
        public int f5859x;

        /* renamed from: y  reason: collision with root package name */
        public int f5860y;
        public Integer z;

        /* renamed from: h5.b$a$a  reason: collision with other inner class name */
        public class C0094a implements Parcelable.Creator<a> {
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            public final Object[] newArray(int i) {
                return new a[i];
            }
        }

        public a() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5851a);
            parcel.writeSerializable(this.f5852b);
            parcel.writeSerializable(this.f5853c);
            parcel.writeInt(this.f5854s);
            parcel.writeInt(this.f5855t);
            parcel.writeInt(this.f5856u);
            CharSequence charSequence = this.f5858w;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f5859x);
            parcel.writeSerializable(this.z);
            parcel.writeSerializable(this.B);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.A);
            parcel.writeSerializable(this.f5857v);
        }

        public a(Parcel parcel) {
            this.f5851a = parcel.readInt();
            this.f5852b = (Integer) parcel.readSerializable();
            this.f5853c = (Integer) parcel.readSerializable();
            this.f5854s = parcel.readInt();
            this.f5855t = parcel.readInt();
            this.f5856u = parcel.readInt();
            this.f5858w = parcel.readString();
            this.f5859x = parcel.readInt();
            this.z = (Integer) parcel.readSerializable();
            this.B = (Integer) parcel.readSerializable();
            this.C = (Integer) parcel.readSerializable();
            this.D = (Integer) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
            this.F = (Integer) parcel.readSerializable();
            this.G = (Integer) parcel.readSerializable();
            this.A = (Boolean) parcel.readSerializable();
            this.f5857v = (Locale) parcel.readSerializable();
        }
    }
}
