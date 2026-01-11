package mf;

import e6.e;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import jf.c;
import od.a;
import p002if.g;
import p002if.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f8596a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8597b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8598c;

    /* renamed from: d  reason: collision with root package name */
    public final List<i> f8599d;

    public b(List<i> list) {
        e.D(list, "connectionSpecs");
        this.f8599d = list;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.util.Comparator<java.lang.String>, if.g$a] */
    public final i a(SSLSocket sSLSocket) throws IOException {
        i iVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        int i = this.f8596a;
        int size = this.f8599d.size();
        while (true) {
            if (i >= size) {
                iVar = null;
                break;
            }
            iVar = this.f8599d.get(i);
            if (iVar.b(sSLSocket)) {
                this.f8596a = i + 1;
                break;
            }
            i++;
        }
        if (iVar != null) {
            int i10 = this.f8596a;
            int size2 = this.f8599d.size();
            while (true) {
                if (i10 >= size2) {
                    z = false;
                    break;
                } else if (this.f8599d.get(i10).b(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i10++;
                }
            }
            this.f8597b = z;
            boolean z10 = this.f8598c;
            if (iVar.f6522c != null) {
                String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                e.C(enabledCipherSuites, "sslSocket.enabledCipherSuites");
                String[] strArr3 = iVar.f6522c;
                g.b bVar = g.f6516t;
                Comparator<String> comparator = g.f6500b;
                strArr = c.p(enabledCipherSuites, strArr3, g.f6500b);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            if (iVar.f6523d != null) {
                String[] enabledProtocols = sSLSocket.getEnabledProtocols();
                e.C(enabledProtocols, "sslSocket.enabledProtocols");
                strArr2 = c.p(enabledProtocols, iVar.f6523d, a.f9417a);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            e.C(supportedCipherSuites, "supportedCipherSuites");
            g.b bVar2 = g.f6516t;
            Comparator<String> comparator2 = g.f6500b;
            ? r72 = g.f6500b;
            byte[] bArr = c.f7250a;
            int length = supportedCipherSuites.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (r72.compare(supportedCipherSuites[i11], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                }
                i11++;
            }
            if (z10 && i11 != -1) {
                e.C(strArr, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i11];
                e.C(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
                e.C(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                strArr = (String[]) copyOf;
                strArr[strArr.length - 1] = str;
            }
            i.a aVar = new i.a(iVar);
            e.C(strArr, "cipherSuitesIntersection");
            aVar.c((String[]) Arrays.copyOf(strArr, strArr.length));
            e.C(strArr2, "tlsVersionsIntersection");
            aVar.f((String[]) Arrays.copyOf(strArr2, strArr2.length));
            i a10 = aVar.a();
            if (a10.c() != null) {
                sSLSocket.setEnabledProtocols(a10.f6523d);
            }
            if (a10.a() != null) {
                sSLSocket.setEnabledCipherSuites(a10.f6522c);
            }
            return iVar;
        }
        StringBuilder d10 = a.a.d("Unable to find acceptable protocols. isFallback=");
        d10.append(this.f8598c);
        d10.append(',');
        d10.append(" modes=");
        d10.append(this.f8599d);
        d10.append(',');
        d10.append(" supported protocols=");
        String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
        e.B(enabledProtocols2);
        String arrays = Arrays.toString(enabledProtocols2);
        e.C(arrays, "java.util.Arrays.toString(this)");
        d10.append(arrays);
        throw new UnknownServiceException(d10.toString());
    }
}
