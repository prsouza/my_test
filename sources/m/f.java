package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.activity.result.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.k0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f8323e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f8324f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f8325a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f8326b;

    /* renamed from: c  reason: collision with root package name */
    public Context f8327c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8328d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f8329c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f8330a;

        /* renamed from: b  reason: collision with root package name */
        public Method f8331b;

        public a(Object obj, String str) {
            this.f8330a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f8331b = cls.getMethod(str, f8329c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException(d.a(cls, d.d("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f8331b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f8331b.invoke(this.f8330a, new Object[]{menuItem})).booleanValue();
                }
                this.f8331b.invoke(this.f8330a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f8332a;

        /* renamed from: b  reason: collision with root package name */
        public int f8333b;

        /* renamed from: c  reason: collision with root package name */
        public int f8334c;

        /* renamed from: d  reason: collision with root package name */
        public int f8335d;

        /* renamed from: e  reason: collision with root package name */
        public int f8336e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8337f;
        public boolean g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f8338h;
        public int i;

        /* renamed from: j  reason: collision with root package name */
        public int f8339j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f8340k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f8341l;

        /* renamed from: m  reason: collision with root package name */
        public int f8342m;

        /* renamed from: n  reason: collision with root package name */
        public char f8343n;

        /* renamed from: o  reason: collision with root package name */
        public int f8344o;

        /* renamed from: p  reason: collision with root package name */
        public char f8345p;

        /* renamed from: q  reason: collision with root package name */
        public int f8346q;

        /* renamed from: r  reason: collision with root package name */
        public int f8347r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f8348s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f8349t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f8350u;

        /* renamed from: v  reason: collision with root package name */
        public int f8351v;

        /* renamed from: w  reason: collision with root package name */
        public int f8352w;

        /* renamed from: x  reason: collision with root package name */
        public String f8353x;

        /* renamed from: y  reason: collision with root package name */
        public String f8354y;
        public n0.b z;

        public b(Menu menu) {
            this.f8332a = menu;
            this.f8333b = 0;
            this.f8334c = 0;
            this.f8335d = 0;
            this.f8336e = 0;
            this.f8337f = true;
            this.g = true;
        }

        public final SubMenu a() {
            this.f8338h = true;
            SubMenu addSubMenu = this.f8332a.addSubMenu(this.f8333b, this.i, this.f8339j, this.f8340k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f8327c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f8348s).setVisible(this.f8349t).setEnabled(this.f8350u).setCheckable(this.f8347r >= 1).setTitleCondensed(this.f8341l).setIcon(this.f8342m);
            int i10 = this.f8351v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f8354y != null) {
                if (!f.this.f8327c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f8328d == null) {
                        Object obj = fVar.f8327c;
                        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                            obj = fVar.a(((ContextWrapper) obj).getBaseContext());
                        }
                        fVar.f8328d = obj;
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f8328d, this.f8354y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f8347r >= 2) {
                if (menuItem instanceof g) {
                    g gVar = (g) menuItem;
                    gVar.f969x = (gVar.f969x & -5) | 4;
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        if (cVar.f8758e == null) {
                            cVar.f8758e = cVar.f8757d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f8758e.invoke(cVar.f8757d, new Object[]{Boolean.TRUE});
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str = this.f8353x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.f8323e, f.this.f8325a));
                z10 = true;
            }
            int i11 = this.f8352w;
            if (i11 > 0) {
                if (!z10) {
                    menuItem.setActionView(i11);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            n0.b bVar = this.z;
            if (bVar != null) {
                if (menuItem instanceof i0.b) {
                    ((i0.b) menuItem).b(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            n0.g.b(menuItem, this.A);
            n0.g.f(menuItem, this.B);
            n0.g.a(menuItem, this.f8343n, this.f8344o);
            n0.g.e(menuItem, this.f8345p, this.f8346q);
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                n0.g.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                n0.g.c(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f8323e = r0
            f8324f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.f8327c = context;
        Object[] objArr = {context};
        this.f8325a = objArr;
        this.f8326b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        char c10;
        char c11;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(a8.a.c("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        String str = null;
        boolean z = false;
        boolean z10 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z10 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z10 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.f8333b = 0;
                            bVar.f8334c = 0;
                            bVar.f8335d = 0;
                            bVar.f8336e = 0;
                            bVar.f8337f = true;
                            bVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f8338h) {
                                n0.b bVar2 = bVar.z;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.f8338h = true;
                                    bVar.c(bVar.f8332a.add(bVar.f8333b, bVar.i, bVar.f8339j, bVar.f8340k));
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z10) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.f8327c.obtainStyledAttributes(attributeSet2, ad.c.J);
                        bVar.f8333b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.f8334c = obtainStyledAttributes.getInt(3, 0);
                        bVar.f8335d = obtainStyledAttributes.getInt(4, 0);
                        bVar.f8336e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f8337f = obtainStyledAttributes.getBoolean(2, true);
                        bVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        d1 p10 = d1.p(f.this.f8327c, attributeSet2, ad.c.K);
                        bVar.i = p10.l(2, 0);
                        bVar.f8339j = (p10.j(5, bVar.f8334c) & -65536) | (p10.j(6, bVar.f8335d) & 65535);
                        bVar.f8340k = p10.n(7);
                        bVar.f8341l = p10.n(8);
                        bVar.f8342m = p10.l(0, 0);
                        String m10 = p10.m(9);
                        if (m10 == null) {
                            c10 = 0;
                        } else {
                            c10 = m10.charAt(0);
                        }
                        bVar.f8343n = c10;
                        bVar.f8344o = p10.j(16, LZ4Constants.HASH_TABLE_SIZE);
                        String m11 = p10.m(10);
                        if (m11 == null) {
                            c11 = 0;
                        } else {
                            c11 = m11.charAt(0);
                        }
                        bVar.f8345p = c11;
                        bVar.f8346q = p10.j(20, LZ4Constants.HASH_TABLE_SIZE);
                        if (p10.o(11)) {
                            bVar.f8347r = p10.a(11, false) ? 1 : 0;
                        } else {
                            bVar.f8347r = bVar.f8336e;
                        }
                        bVar.f8348s = p10.a(3, false);
                        bVar.f8349t = p10.a(4, bVar.f8337f);
                        bVar.f8350u = p10.a(1, bVar.g);
                        bVar.f8351v = p10.j(21, -1);
                        bVar.f8354y = p10.m(12);
                        bVar.f8352w = p10.l(13, 0);
                        bVar.f8353x = p10.m(15);
                        String m12 = p10.m(14);
                        boolean z11 = m12 != null;
                        if (z11 && bVar.f8352w == 0 && bVar.f8353x == null) {
                            bVar.z = (n0.b) bVar.b(m12, f8324f, f.this.f8326b);
                        } else {
                            if (z11) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.z = null;
                        }
                        bVar.A = p10.n(17);
                        bVar.B = p10.n(22);
                        if (p10.o(19)) {
                            bVar.D = k0.e(p10.j(19, -1), bVar.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.D = null;
                        }
                        if (p10.o(18)) {
                            bVar.C = p10.c(18);
                        } else {
                            bVar.C = colorStateList;
                        }
                        p10.r();
                        bVar.f8338h = false;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet2, bVar.a());
                        } else {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            str = name3;
                            z10 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser5 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof i0.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f8327c.getResources().getLayout(i);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
