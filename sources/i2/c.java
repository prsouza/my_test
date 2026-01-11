package i2;

import java.lang.reflect.Field;
import java.util.Locale;

public enum c implements d {
    IDENTITY {
        public String a(Field field) {
            return field.getName();
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        public String a(Field field) {
            return c.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };

    /* 'enum' modifier removed */
    public final class b extends c {
        public b(String str, int i) {
            super(str, i, (a) null);
        }

        public String a(Field field) {
            return c.a(field.getName());
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: i2.c$c  reason: collision with other inner class name */
    public final class C0102c extends c {
        public C0102c(String str, int i) {
            super(str, i, (a) null);
        }

        public String a(Field field) {
            return c.a(c.a(field.getName(), " "));
        }
    }

    /* 'enum' modifier removed */
    public final class e extends c {
        public e(String str, int i) {
            super(str, i, (a) null);
        }

        public String a(Field field) {
            return c.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    }

    /* 'enum' modifier removed */
    public final class f extends c {
        public f(String str, int i) {
            super(str, i, (a) null);
        }

        public String a(Field field) {
            return c.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    }

    public static String a(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static String a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }
}
