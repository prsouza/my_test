package com.bumptech.glide.load.data;

import com.bumptech.glide.g;

public interface d<T> {

    public interface a<T> {
        void c(Exception exc);

        void d(T t10);
    }

    Class<T> a();

    void b();

    void cancel();

    g3.a e();

    void f(g gVar, a<? super T> aVar);
}
