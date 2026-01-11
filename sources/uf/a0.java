package uf;

import a.a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class a0 extends b {

    /* renamed from: l  reason: collision with root package name */
    public final Socket f11937l;

    public a0(Socket socket) {
        this.f11937l = socket;
    }

    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void k() {
        try {
            this.f11937l.close();
        } catch (Exception e10) {
            Logger logger = q.f11974a;
            Level level = Level.WARNING;
            StringBuilder d10 = a.d("Failed to close timed out socket ");
            d10.append(this.f11937l);
            logger.log(level, d10.toString(), e10);
        } catch (AssertionError e11) {
            if (p.c(e11)) {
                Logger logger2 = q.f11974a;
                Level level2 = Level.WARNING;
                StringBuilder d11 = a.d("Failed to close timed out socket ");
                d11.append(this.f11937l);
                logger2.log(level2, d11.toString(), e11);
                return;
            }
            throw e11;
        }
    }
}
