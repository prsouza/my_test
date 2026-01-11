package id;

import a.a;
import com.google.gson.annotations.SerializedName;
import e6.e;

public final class b {
    private final a error;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f6409id;
    @SerializedName("jsonrpc")
    private final String jsonrpc;
    @SerializedName("result")
    private final Object result;

    public b(String str, Object obj, int i, a aVar) {
        e.D(str, "jsonrpc");
        this.jsonrpc = str;
        this.result = obj;
        this.f6409id = i;
    }

    public final a getError() {
        return null;
    }

    public final int getId() {
        return this.f6409id;
    }

    public final String getJsonrpc() {
        return this.jsonrpc;
    }

    public final Object getResult() {
        return this.result;
    }

    public String toString() {
        StringBuilder d10 = a.d("RpcResponse(");
        d10.append(this.f6409id);
        d10.append(')');
        return d10.toString();
    }
}
