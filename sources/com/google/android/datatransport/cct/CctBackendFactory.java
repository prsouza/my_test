package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import u4.d;
import u4.h;
import u4.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new r4.d(hVar.a(), hVar.d(), hVar.c());
    }
}
