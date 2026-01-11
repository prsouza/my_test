package e9;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.icu.text.PluralRules;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import d9.c;
import d9.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import l6.b0;
import l6.b1;
import md.g;

public final class e extends Resources {

    /* renamed from: a  reason: collision with root package name */
    public Resources f4794a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f4795b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f4796c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Resources resources, b0 b0Var) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        e6.e.D(b0Var, "repositoryHolder");
        this.f4795b = resources;
        this.f4796c = b0Var;
    }

    public final Resources a() {
        c cVar = (c) this.f4796c.f7787b;
        if (cVar.f4375c == null) {
            this.f4794a = null;
            return this.f4795b;
        }
        Locale locale = cVar.f4373a;
        Resources resources = this.f4794a;
        if (resources == null) {
            resources = this.f4795b;
        }
        Configuration configuration = resources.getConfiguration();
        e6.e.C(configuration, "currentResources.configuration");
        if (e6.e.r(Build.VERSION.SDK_INT >= 24 ? configuration.getLocales().get(0) : configuration.locale, locale)) {
            return resources;
        }
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        configuration2.setLocale(locale);
        Resources resources2 = new Resources(this.f4795b.getAssets(), this.f4795b.getDisplayMetrics(), configuration2);
        this.f4794a = resources2;
        return resources2;
    }

    public final CharSequence b(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            Spanned fromHtml = Html.fromHtml(str);
            e6.e.C(fromHtml, "Html.fromHtml(source)");
            return fromHtml;
        }
        Spanned fromHtml2 = Html.fromHtml(str, 63);
        e6.e.C(fromHtml2, "Html.fromHtml(source, Html.FROM_HTML_MODE_COMPACT)");
        return fromHtml2;
    }

    public final List<String> c(int i) {
        Object obj;
        Object obj2 = null;
        try {
            String resourceEntryName = getResourceEntryName(i);
            i a10 = this.f4796c.a();
            if (a10 != null) {
                e6.e.C(resourceEntryName, "arrayKey");
                obj = a10.a(resourceEntryName);
            } else {
                obj = null;
            }
        } catch (Throwable th2) {
            obj = b1.k(th2);
        }
        if (!(obj instanceof g.a)) {
            obj2 = obj;
        }
        return (List) obj2;
    }

    public final String d(int i) {
        Object obj;
        Object obj2 = null;
        try {
            String resourceEntryName = getResourceEntryName(i);
            i a10 = this.f4796c.a();
            if (a10 != null) {
                e6.e.C(resourceEntryName, "stringKey");
                obj = a10.c(resourceEntryName);
            } else {
                obj = null;
            }
        } catch (Throwable th2) {
            obj = b1.k(th2);
        }
        if (!(obj instanceof g.a)) {
            obj2 = obj;
        }
        return (String) obj2;
    }

    public final Configuration getConfiguration() {
        Configuration configuration = a().getConfiguration();
        e6.e.C(configuration, "getFallbackResources().configuration");
        return configuration;
    }

    public final String getQuantityString(int i, int i10) throws Resources.NotFoundException {
        return getQuantityText(i, i10).toString();
    }

    public final CharSequence getQuantityText(int i, int i10) throws Resources.NotFoundException {
        Locale locale;
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            i a10 = this.f4796c.a();
            if (a10 == null || (locale = a10.d()) == null) {
                locale = Locale.getDefault();
            }
            String select = PluralRules.forLocale(locale).select((double) i10);
            e6.e.C(select, "quantityName");
            Object obj2 = null;
            try {
                String resourceEntryName = getResourceEntryName(i);
                i a11 = this.f4796c.a();
                if (a11 != null) {
                    e6.e.C(resourceEntryName, "pluralKey");
                    obj = a11.b(resourceEntryName, select);
                } else {
                    obj = null;
                }
            } catch (Throwable th2) {
                obj = b1.k(th2);
            }
            if (!(obj instanceof g.a)) {
                obj2 = obj;
            }
            String str = (String) obj2;
            if (str != null) {
                return b(str);
            }
            CharSequence quantityText = a().getQuantityText(i, i10);
            e6.e.C(quantityText, "getFallbackResources().g…uantityText(id, quantity)");
            return quantityText;
        }
        CharSequence quantityText2 = a().getQuantityText(i, i10);
        e6.e.C(quantityText2, "getFallbackResources().g…uantityText(id, quantity)");
        return quantityText2;
    }

    public final String getString(int i) throws Resources.NotFoundException {
        return getText(i).toString();
    }

    public final String[] getStringArray(int i) throws Resources.NotFoundException {
        String[] strArr;
        List<String> c10 = c(i);
        if (c10 != null) {
            Object[] array = c10.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            strArr = (String[]) array;
        } else {
            strArr = null;
        }
        if (strArr != null) {
            return strArr;
        }
        String[] stringArray = a().getStringArray(i);
        e6.e.C(stringArray, "getFallbackResources().getStringArray(id)");
        return stringArray;
    }

    public final CharSequence getText(int i) throws Resources.NotFoundException {
        String d10 = d(i);
        if (d10 != null) {
            return b(d10);
        }
        CharSequence text = a().getText(i);
        e6.e.C(text, "getFallbackResources().getText(id)");
        return text;
    }

    public final CharSequence[] getTextArray(int i) throws Resources.NotFoundException {
        CharSequence[] charSequenceArr;
        List<String> c10 = c(i);
        if (c10 != null) {
            ArrayList arrayList = new ArrayList(nd.g.S0(c10));
            for (String b10 : c10) {
                arrayList.add(b(b10));
            }
            Object[] array = arrayList.toArray(new CharSequence[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            charSequenceArr = (CharSequence[]) array;
        } else {
            charSequenceArr = null;
        }
        if (charSequenceArr != null) {
            return charSequenceArr;
        }
        CharSequence[] textArray = a().getTextArray(i);
        e6.e.C(textArray, "getFallbackResources().getTextArray(id)");
        return textArray;
    }

    public final String getString(int i, Object... objArr) throws Resources.NotFoundException {
        e6.e.D(objArr, "formatArgs");
        String string = getString(i);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(string, Arrays.copyOf(copyOf, copyOf.length));
        e6.e.C(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final CharSequence getText(int i, CharSequence charSequence) throws Resources.NotFoundException {
        String d10 = d(i);
        return d10 != null ? b(d10) : a().getText(i, charSequence);
    }
}
