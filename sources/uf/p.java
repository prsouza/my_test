package uf;

import e6.e;
import fe.o;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class p {
    public static final g a(z zVar) {
        e.D(zVar, "$this$buffer");
        return new u(zVar);
    }

    public static final h b(b0 b0Var) {
        return new v(b0Var);
    }

    public static final boolean c(AssertionError assertionError) {
        Logger logger = q.f11974a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? o.g1(message, "getsockname failed") : false;
    }

    public static final z d(Socket socket) throws IOException {
        Logger logger = q.f11974a;
        a0 a0Var = new a0(socket);
        OutputStream outputStream = socket.getOutputStream();
        e.C(outputStream, "getOutputStream()");
        return new c(a0Var, new s(outputStream, a0Var));
    }

    public static final b0 e(InputStream inputStream) {
        Logger logger = q.f11974a;
        e.D(inputStream, "$this$source");
        return new o(inputStream, new c0());
    }

    public static final b0 f(Socket socket) throws IOException {
        Logger logger = q.f11974a;
        a0 a0Var = new a0(socket);
        InputStream inputStream = socket.getInputStream();
        e.C(inputStream, "getInputStream()");
        return new d(a0Var, new o(inputStream, a0Var));
    }
}
