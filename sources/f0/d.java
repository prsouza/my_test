package f0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k0.e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d {

    public interface a {
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final c[] f4874a;

        public b(c[] cVarArr) {
            this.f4874a = cVarArr;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f4875a;

        /* renamed from: b  reason: collision with root package name */
        public int f4876b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4877c;

        /* renamed from: d  reason: collision with root package name */
        public String f4878d;

        /* renamed from: e  reason: collision with root package name */
        public int f4879e;

        /* renamed from: f  reason: collision with root package name */
        public int f4880f;

        public c(String str, int i, boolean z, String str2, int i10, int i11) {
            this.f4875a = str;
            this.f4876b = i;
            this.f4877c = z;
            this.f4878d = str2;
            this.f4879e = i10;
            this.f4880f = i11;
        }
    }

    /* renamed from: f0.d$d  reason: collision with other inner class name */
    public static final class C0074d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final e f4881a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4882b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4883c;

        /* renamed from: d  reason: collision with root package name */
        public final String f4884d;

        public C0074d(e eVar, int i, int i10, String str) {
            this.f4881a = eVar;
            this.f4883c = i;
            this.f4882b = i10;
            this.f4884d = str;
        }
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), e6.e.f4648u);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), e6.e.f4649v);
                                int i = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i = 1;
                                }
                                int i10 = obtainAttributes2.getInt(i, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i11 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i11 = 3;
                                }
                                int i12 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i12 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i12);
                                int i13 = obtainAttributes2.getInt(i11, 0);
                                int i14 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i14, 0);
                                String string6 = obtainAttributes2.getString(i14);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    c(xmlPullParser);
                                }
                                arrayList.add(new c(string6, i10, z, string5, i13, resourceId2));
                            } else {
                                c(xmlPullParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
                    }
                } else {
                    while (xmlPullParser.next() != 3) {
                        c(xmlPullParser);
                    }
                    return new C0074d(new e(string, string2, string3, b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                c(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        arrayList.add(d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(d(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List<byte[]> d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
