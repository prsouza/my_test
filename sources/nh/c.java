package nh;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;

public final class c implements Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public r f9061a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9062b;

    /* renamed from: c  reason: collision with root package name */
    public int f9063c;

    /* renamed from: s  reason: collision with root package name */
    public int f9064s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9065t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9066u = false;

    public c(int i) {
        this.f9062b = i;
    }

    /* renamed from: a */
    public final c clone() {
        c cVar = new c(this.f9062b);
        cVar.f9061a = this.f9061a;
        cVar.f9063c = this.f9063c;
        cVar.f9064s = this.f9064s;
        cVar.f9065t = this.f9065t;
        cVar.f9066u = this.f9066u;
        return cVar;
    }

    public final int b() {
        return (!this.f9065t || this.f9066u) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : this.f9063c;
    }
}
