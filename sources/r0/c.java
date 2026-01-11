package r0;

import android.content.Context;
import android.view.LayoutInflater;

public abstract class c extends a {

    /* renamed from: x  reason: collision with root package name */
    public int f10515x;

    /* renamed from: y  reason: collision with root package name */
    public int f10516y;
    public LayoutInflater z;

    @Deprecated
    public c(Context context, int i) {
        super(context);
        this.f10516y = i;
        this.f10515x = i;
        this.z = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
