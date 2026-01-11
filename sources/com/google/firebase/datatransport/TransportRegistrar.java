package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.fragment.app.m;
import java.util.Arrays;
import java.util.List;
import q4.g;
import s7.b;
import s7.f;
import s7.n;

@Keep
public class TransportRegistrar implements f {
    public List<b<?>> getComponents() {
        b.C0214b<g> a10 = b.a(g.class);
        a10.a(new n(Context.class, 1, 0));
        a10.f10945e = m.f1957a;
        return Arrays.asList(new b[]{a10.b(), a9.f.a("fire-transport", "18.1.3")});
    }
}
