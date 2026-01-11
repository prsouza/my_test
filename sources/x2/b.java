package x2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class b {
    public final a a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
