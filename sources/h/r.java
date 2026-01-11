package h;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;

public class r extends f {

    /* renamed from: c  reason: collision with root package name */
    public final f f5603c;

    public r(f fVar) {
        this.f5603c = fVar;
    }

    public final void A(int i) {
        this.f5603c.A(i);
    }

    public final void B(CharSequence charSequence) {
        this.f5603c.B(charSequence);
    }

    public final void d(View view, ViewGroup.LayoutParams layoutParams) {
        this.f5603c.d(view, layoutParams);
    }

    public Context e(Context context) {
        e.D(context, "context");
        Context e10 = this.f5603c.e(context);
        e.C(e10, "baseDelegate.attachBaseC…achBaseContext2(context))");
        return e10;
    }

    public View f(View view, String str, Context context, AttributeSet attributeSet) {
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(context, "context");
        e.D(attributeSet, "attrs");
        return this.f5603c.f(view, str, context, attributeSet);
    }

    public final <T extends View> T g(int i) {
        return this.f5603c.g(i);
    }

    public final int h() {
        return this.f5603c.h();
    }

    public MenuInflater i() {
        MenuInflater i = this.f5603c.i();
        e.C(i, "baseDelegate.menuInflater");
        return i;
    }

    public final a j() {
        return this.f5603c.j();
    }

    public void k() {
        this.f5603c.k();
    }

    public final void l() {
        this.f5603c.l();
    }

    public final void m(Configuration configuration) {
        this.f5603c.m(configuration);
    }

    public final void n(Bundle bundle) {
        this.f5603c.n(bundle);
        f.u(this.f5603c);
        f.c(this);
    }

    public final void o() {
        this.f5603c.o();
        f.u(this);
    }

    public final void p(Bundle bundle) {
        this.f5603c.p(bundle);
    }

    public final void q() {
        this.f5603c.q();
    }

    public final void r(Bundle bundle) {
        this.f5603c.r(bundle);
    }

    public final void s() {
        this.f5603c.s();
    }

    public final void t() {
        this.f5603c.t();
    }

    public final boolean w(int i) {
        return this.f5603c.w(1);
    }

    public final void x(int i) {
        this.f5603c.x(i);
    }

    public final void y(View view) {
        this.f5603c.y(view);
    }

    public final void z(View view, ViewGroup.LayoutParams layoutParams) {
        this.f5603c.z(view, layoutParams);
    }
}
