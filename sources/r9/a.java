package r9;

import a.b;
import java.util.TimeZone;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f10586a = TimeZone.getTimeZone("UTC");

    public static int a(String str, int i, int i10) {
        int i11;
        int i12;
        if (i < 0 || i10 > str.length() || i > i10) {
            throw new NumberFormatException(str);
        }
        if (i < i10) {
            i12 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i11 = -digit;
            } else {
                StringBuilder q10 = b.q("Invalid number: ");
                q10.append(str.substring(i, i10));
                throw new NumberFormatException(q10.toString());
            }
        } else {
            i11 = 0;
            i12 = i;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 >= 0) {
                i11 = (i11 * 10) - digit2;
                i12 = i13;
            } else {
                StringBuilder q11 = b.q("Invalid number: ");
                q11.append(str.substring(i, i10));
                throw new NumberFormatException(q11.toString());
            }
        }
        return -i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e1 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01c8 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01d0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date b(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r3 = r0 + 4
            int r0 = a(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r4 = 45
            boolean r5 = c(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = a(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r6 = c(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = a(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r7 = 84
            boolean r7 = c(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00d5
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r13 = 58
            boolean r14 = c(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = a(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r13 = c(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r13 <= r14) goto L_0x00d2
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r13 == r10) goto L_0x00d2
            if (r13 == r9) goto L_0x00d2
            if (r13 == r4) goto L_0x00d2
            int r13 = r14 + 2
            int r14 = a(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = c(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r15 == 0) goto L_0x00d0
            int r13 = r13 + 1
            int r15 = r13 + 1
        L_0x009c:
            int r11 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r15 >= r11) goto L_0x00b4
            char r11 = r1.charAt(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r4 = 48
            if (r11 < r4) goto L_0x00b9
            r4 = 57
            if (r11 <= r4) goto L_0x00af
            goto L_0x00b9
        L_0x00af:
            int r15 = r15 + 1
            r4 = 45
            goto L_0x009c
        L_0x00b4:
            int r4 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r15 = r4
        L_0x00b9:
            int r4 = r13 + 3
            int r4 = java.lang.Math.min(r15, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r11 = a(r1, r13, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r4 = r4 - r13
            if (r4 == r8) goto L_0x00cc
            if (r4 == r12) goto L_0x00c9
            goto L_0x00ce
        L_0x00c9:
            int r11 = r11 * 10
            goto L_0x00ce
        L_0x00cc:
            int r11 = r11 * 100
        L_0x00ce:
            r13 = r15
            goto L_0x00db
        L_0x00d0:
            r11 = 0
            goto L_0x00db
        L_0x00d2:
            r4 = r6
            r6 = r14
            goto L_0x00d7
        L_0x00d5:
            r4 = 0
            r7 = 0
        L_0x00d7:
            r13 = r6
            r11 = 0
            r14 = 0
            r6 = r4
        L_0x00db:
            int r4 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r4 <= r13) goto L_0x01c8
            char r4 = r1.charAt(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r15 = 5
            if (r4 != r10) goto L_0x00ed
            java.util.TimeZone r4 = f10586a     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r13 = r13 + r8
            goto L_0x0197
        L_0x00ed:
            if (r4 == r9) goto L_0x0110
            r9 = 45
            if (r4 != r9) goto L_0x00f4
            goto L_0x0110
        L_0x00f4:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r5 = "Invalid time zone indicator '"
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x0110:
            java.lang.String r4 = r1.substring(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r9 < r15) goto L_0x011b
            goto L_0x012c
        L_0x011b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x012c:
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r13 = r13 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r9 != 0) goto L_0x0195
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r9 == 0) goto L_0x0142
            goto L_0x0195
        L_0x0142:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r10 = "GMT"
            r9.append(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r10 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r16 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r16 != 0) goto L_0x0193
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replace(r15, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            boolean r10 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            if (r10 == 0) goto L_0x0170
            goto L_0x0193
        L_0x0170:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.append(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x0193:
            r4 = r9
            goto L_0x0197
        L_0x0195:
            java.util.TimeZone r4 = f10586a     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x0197:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r9.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 13
            r9.set(r0, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r0 = 14
            r9.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            r2.setIndex(r13)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            return r0
        L_0x01c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01d4, NumberFormatException -> 0x01d2, IllegalArgumentException -> 0x01d0 }
        L_0x01d0:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d2:
            r0 = move-exception
            goto L_0x01d5
        L_0x01d4:
            r0 = move-exception
        L_0x01d5:
            if (r1 != 0) goto L_0x01d9
            r1 = 0
            goto L_0x01ed
        L_0x01d9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 34
            r3.append(r4)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = r3.toString()
        L_0x01ed:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01f9
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0213
        L_0x01f9:
            java.lang.String r3 = "("
            java.lang.StringBuilder r3 = a.b.q(r3)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0213:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to parse date ["
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static boolean c(String str, int i, char c10) {
        return i < str.length() && str.charAt(i) == c10;
    }
}
