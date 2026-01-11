package e9;

import ad.c;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;
import e6.e;
import java.util.ArrayList;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final int f4789a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4790b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4791a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4792b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4793c;

        public a(int i, int i10, int i11) {
            this.f4791a = i;
            this.f4792b = i10;
            this.f4793c = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4791a == aVar.f4791a && this.f4792b == aVar.f4792b && this.f4793c == aVar.f4793c;
        }

        public final int hashCode() {
            return (((this.f4791a * 31) + this.f4792b) * 31) + this.f4793c;
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("IdsPack(id=");
            d10.append(this.f4791a);
            d10.append(", title=");
            d10.append(this.f4792b);
            d10.append(", titleCondensed=");
            return androidx.activity.result.d.c(d10, this.f4793c, ")");
        }
    }

    public d(Context context) {
        e.D(context, "context");
        this.f4790b = context;
    }

    public final void a(int i, Menu menu) {
        e.D(menu, "menu");
        Context context = this.f4790b;
        ArrayList arrayList = new ArrayList();
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser layout = context.getResources().getLayout(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(layout);
            for (int eventType = layout.getEventType(); eventType != 1; eventType = layout.next()) {
                if (layout.getEventType() == 2 && e.r(layout.getName(), "item")) {
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, c.f308e);
                    e.C(obtainStyledAttributes, "context.obtainStyledAttr…rs, R.styleable.MenuItem)");
                    int resourceId = obtainStyledAttributes.getResourceId(2, this.f4789a);
                    int resourceId2 = obtainStyledAttributes.getResourceId(7, this.f4789a);
                    int resourceId3 = obtainStyledAttributes.getResourceId(8, this.f4789a);
                    int i10 = this.f4789a;
                    if (!(resourceId == i10 || (resourceId2 == i10 && resourceId3 == i10))) {
                        arrayList.add(new a(resourceId, resourceId2, resourceId3));
                    }
                    obtainStyledAttributes.recycle();
                }
            }
            layout.close();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                MenuItem findItem = menu.findItem(aVar.f4791a);
                if (findItem != null) {
                    if (aVar.f4792b != this.f4789a) {
                        findItem.setTitle(this.f4790b.getResources().getText(aVar.f4792b));
                    }
                    if (aVar.f4793c != this.f4789a) {
                        findItem.setTitleCondensed(this.f4790b.getResources().getText(aVar.f4793c));
                    }
                }
            }
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
