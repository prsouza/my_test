package xh;

import java.security.AccessController;
import java.security.PrivilegedAction;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13295a = 0;

    public static class a implements PrivilegedAction<String> {
        public final Object run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            String str = (String) AccessController.doPrivileged(new a());
        } catch (Exception unused) {
            try {
                String.format("%n", new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static byte[] b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String c(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c10 = charArray[i];
            if ('A' <= c10 && 'Z' >= c10) {
                charArray[i] = (char) ((c10 - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
