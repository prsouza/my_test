package f9;

import f9.b;
import fe.k;
import fe.o;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Objects;
import nd.f;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yf.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f5039a = {"zero", "one", "two", "few", "many", "other"};

    public final String a(XmlPullParser xmlPullParser) {
        StringBuilder sb2 = new StringBuilder();
        int i = 1;
        while (i != 0) {
            int nextToken = xmlPullParser.nextToken();
            if (nextToken == 2) {
                i++;
                sb2.append("<");
                sb2.append(xmlPullParser.getName());
                sb2.append(">");
            } else if (nextToken == 3) {
                i--;
                if (i > 0) {
                    sb2.append("</");
                    sb2.append(xmlPullParser.getName());
                    sb2.append(">");
                }
            } else if (nextToken == 4) {
                String text = xmlPullParser.getText();
                e6.e.C(text, "parser.text");
                boolean z = false;
                if (o.l1(text, '\"', 0, false, 2) >= 0) {
                    StringBuilder sb3 = new StringBuilder();
                    int length = text.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        if (text.charAt(i10) != '\"' || (i10 != 0 && text.charAt(i10 - 1) == '\\')) {
                            sb3.append(text.charAt(i10));
                        }
                    }
                    text = sb3.toString();
                    e6.e.C(text, "sb.toString()");
                }
                if (o.l1(text, '\\', 0, false, 2) >= 0) {
                    z = true;
                }
                if (z) {
                    a aVar = xf.a.f13227a;
                    Objects.requireNonNull(aVar);
                    try {
                        StringWriter stringWriter = new StringWriter(text.length() * 2);
                        aVar.b(text, stringWriter);
                        text = stringWriter.toString();
                        e6.e.C(text, "StringEscapeUtils.unescapeJava(s)");
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                sb2.append(k.b1(text, "\n", "<br/>"));
            } else if (nextToken == 5) {
                sb2.append("<![CDATA[");
                sb2.append(xmlPullParser.getText());
                sb2.append("]]>");
            } else if (nextToken == 6) {
                sb2.append(xmlPullParser.getText());
            }
        }
        String sb4 = sb2.toString();
        e6.e.C(sb4, "sb.toString()");
        return sb4;
    }

    public final void b(XmlPullParser xmlPullParser, String str, b.a aVar) {
        xmlPullParser.require(2, (String) null, "plurals");
        while (xmlPullParser.nextTag() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                xmlPullParser.require(2, (String) null, "item");
                String attributeValue = xmlPullParser.getAttributeValue((String) null, "quantity");
                String[] strArr = this.f5039a;
                e6.e.D(strArr, "<this>");
                if (f.L(strArr, attributeValue) >= 0) {
                    String a10 = a(xmlPullParser);
                    e6.e.C(attributeValue, "quantity");
                    e6.e.D(str, "key");
                    HashMap hashMap = aVar.f5028c.get(str);
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        aVar.f5028c.put(str, hashMap);
                    }
                    hashMap.put(attributeValue, a10);
                    xmlPullParser.require(3, (String) null, "item");
                } else {
                    throw new XmlPullParserException(a8.a.c("Unknown quantity qualifier: ", attributeValue));
                }
            }
        }
        xmlPullParser.require(3, (String) null, "plurals");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[Catch:{ all -> 0x013d, all -> 0x0140 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00eb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f9.b c(java.io.InputStream r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "item"
            java.lang.String r3 = "resources"
            java.lang.String r4 = "string"
            java.lang.String r5 = "string-array"
            f9.b$a r6 = new f9.b$a
            r6.<init>()
            org.xmlpull.v1.XmlPullParserFactory r7 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ all -> 0x013d }
            org.xmlpull.v1.XmlPullParser r7 = r7.newPullParser()     // Catch:{ all -> 0x013d }
            r8 = 0
            r7.setInput(r2, r8)     // Catch:{ all -> 0x013d }
            r7.next()     // Catch:{ all -> 0x013d }
            int r9 = r7.getEventType()     // Catch:{ all -> 0x013d }
            r10 = 1
            if (r9 != r10) goto L_0x0029
            goto L_0x012e
        L_0x0029:
            r9 = 2
            r7.require(r9, r8, r3)     // Catch:{ all -> 0x013d }
        L_0x002d:
            int r11 = r7.nextTag()     // Catch:{ all -> 0x013d }
            r12 = 3
            if (r11 == r12) goto L_0x012b
            int r11 = r7.getEventType()     // Catch:{ all -> 0x013d }
            if (r11 != r9) goto L_0x010b
            java.lang.String r11 = "name"
            java.lang.String r11 = r7.getAttributeValue(r8, r11)     // Catch:{ all -> 0x013d }
            if (r11 == 0) goto L_0x004b
            int r13 = r11.length()     // Catch:{ all -> 0x013d }
            if (r13 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r13 = 0
            goto L_0x004c
        L_0x004b:
            r13 = r10
        L_0x004c:
            if (r13 != 0) goto L_0x00eb
            java.lang.String r13 = r7.getName()     // Catch:{ all -> 0x013d }
            if (r13 == 0) goto L_0x00d0
            int r14 = r13.hashCode()     // Catch:{ all -> 0x013d }
            r15 = -1024600675(0xffffffffc2edd59d, float:-118.91721)
            java.lang.String r10 = "key"
            if (r14 == r15) goto L_0x008e
            r15 = -891985903(0xffffffffcad56011, float:-6991880.5)
            if (r14 == r15) goto L_0x0075
            r10 = -475309713(0xffffffffe3ab596f, float:-6.321675E21)
            if (r14 != r10) goto L_0x00d0
            java.lang.String r10 = "plurals"
            boolean r10 = r13.equals(r10)     // Catch:{ all -> 0x013d }
            if (r10 == 0) goto L_0x00d0
            r1.b(r7, r11, r6)     // Catch:{ all -> 0x013d }
            goto L_0x00cd
        L_0x0075:
            boolean r13 = r13.equals(r4)     // Catch:{ all -> 0x013d }
            if (r13 == 0) goto L_0x00d0
            r7.require(r9, r8, r4)     // Catch:{ all -> 0x013d }
            java.lang.String r13 = r1.a(r7)     // Catch:{ all -> 0x013d }
            e6.e.D(r11, r10)     // Catch:{ all -> 0x013d }
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r6.f5026a     // Catch:{ all -> 0x013d }
            r10.put(r11, r13)     // Catch:{ all -> 0x013d }
            r7.require(r12, r8, r4)     // Catch:{ all -> 0x013d }
            goto L_0x00cd
        L_0x008e:
            boolean r13 = r13.equals(r5)     // Catch:{ all -> 0x013d }
            if (r13 == 0) goto L_0x00d0
            r7.require(r9, r8, r5)     // Catch:{ all -> 0x013d }
        L_0x0097:
            int r13 = r7.nextTag()     // Catch:{ all -> 0x013d }
            if (r13 == r12) goto L_0x00ca
            int r13 = r7.getEventType()     // Catch:{ all -> 0x013d }
            if (r13 == r9) goto L_0x00a4
            goto L_0x0097
        L_0x00a4:
            r7.require(r9, r8, r0)     // Catch:{ all -> 0x013d }
            java.lang.String r13 = r1.a(r7)     // Catch:{ all -> 0x013d }
            e6.e.D(r11, r10)     // Catch:{ all -> 0x013d }
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r14 = r6.f5027b     // Catch:{ all -> 0x013d }
            java.lang.Object r14 = r14.get(r11)     // Catch:{ all -> 0x013d }
            java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch:{ all -> 0x013d }
            if (r14 == 0) goto L_0x00b9
            goto L_0x00c3
        L_0x00b9:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x013d }
            r14.<init>()     // Catch:{ all -> 0x013d }
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r15 = r6.f5027b     // Catch:{ all -> 0x013d }
            r15.put(r11, r14)     // Catch:{ all -> 0x013d }
        L_0x00c3:
            r14.add(r13)     // Catch:{ all -> 0x013d }
            r7.require(r12, r8, r0)     // Catch:{ all -> 0x013d }
            goto L_0x0097
        L_0x00ca:
            r7.require(r12, r8, r5)     // Catch:{ all -> 0x013d }
        L_0x00cd:
            r10 = 1
            goto L_0x002d
        L_0x00d0:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x013d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013d }
            r3.<init>()     // Catch:{ all -> 0x013d }
            java.lang.String r4 = "Unknown tag: "
            r3.append(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r4 = r7.getName()     // Catch:{ all -> 0x013d }
            r3.append(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x013d }
            r0.<init>(r3)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x00eb:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x013d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013d }
            r3.<init>()     // Catch:{ all -> 0x013d }
            java.lang.String r4 = "Missing name attribute in <"
            r3.append(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r4 = r7.getName()     // Catch:{ all -> 0x013d }
            r3.append(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r4 = "> declaration"
            r3.append(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x013d }
            r0.<init>(r3)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x010b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x013d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x013d }
            r3.<init>()     // Catch:{ all -> 0x013d }
            java.lang.String r4 = "Unexpected tag: <"
            r3.append(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r4 = r7.getName()     // Catch:{ all -> 0x013d }
            r3.append(r4)     // Catch:{ all -> 0x013d }
            r4 = 62
            r3.append(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x013d }
            r0.<init>(r3)     // Catch:{ all -> 0x013d }
            throw r0     // Catch:{ all -> 0x013d }
        L_0x012b:
            r7.require(r12, r8, r3)     // Catch:{ all -> 0x013d }
        L_0x012e:
            ad.c.z(r2, r8)
            f9.b r0 = new f9.b
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r6.f5026a
            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> r3 = r6.f5027b
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>> r4 = r6.f5028c
            r0.<init>(r2, r3, r4)
            return r0
        L_0x013d:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r0 = move-exception
            r4 = r0
            ad.c.z(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.e.c(java.io.InputStream):f9.b");
    }
}
