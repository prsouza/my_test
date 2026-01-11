package ag;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import xh.c;

public abstract class m implements d, c {
    public abstract s d();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        return d().m(((d) obj).d());
    }

    public void g(OutputStream outputStream) throws IOException {
        new q(outputStream).k(this);
    }

    public final byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public void h(OutputStream outputStream, String str) throws IOException {
        q.a(outputStream, str).l(d(), true);
    }

    public int hashCode() {
        return d().hashCode();
    }

    public final byte[] i(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        h(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
