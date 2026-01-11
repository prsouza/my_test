package a5;

import a5.a0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import c9.f;
import c9.k;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.nodle.cash.ui.view.activity.transact.TransactActivity;
import java.util.Objects;
import mb.c;
import mb.g;
import org.json.JSONArray;
import org.json.JSONException;
import ri.a;
import x4.c;
import x8.m0;
import xa.c;

public final /* synthetic */ class m implements a0.a, OnSuccessListener, Continuation, k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f105b;

    public /* synthetic */ m(Object obj, int i) {
        this.f104a = i;
        this.f105b = obj;
    }

    public final Object apply(Object obj) {
        a0 a0Var = (a0) this.f105b;
        Cursor cursor = (Cursor) obj;
        Objects.requireNonNull(a0Var);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            a0Var.f((long) i, c.a.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final void d(Object obj) {
        int i;
        switch (this.f104a) {
            case 4:
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f105b;
                int i10 = HomeActivityV2.H;
                e.D(homeActivityV2, "this$0");
                if (e.r((Boolean) obj, Boolean.TRUE)) {
                    ((ShimmerFrameLayout) homeActivityV2.k(R.id.shimmerLayout)).b();
                    return;
                }
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) homeActivityV2.k(R.id.shimmerLayout);
                if (shimmerFrameLayout.f3584c) {
                    shimmerFrameLayout.c();
                    shimmerFrameLayout.f3584c = false;
                    shimmerFrameLayout.invalidate();
                    return;
                }
                return;
            default:
                TransactActivity transactActivity = (TransactActivity) this.f105b;
                xa.c cVar = (xa.c) obj;
                int i11 = TransactActivity.C;
                e.D(transactActivity, "this$0");
                a.C0210a aVar = a.f10801a;
                c.b bVar = cVar.f13161a;
                aVar.a("Progress: " + bVar, new Object[0]);
                c.b bVar2 = cVar.f13161a;
                if (bVar2 == null) {
                    i = -1;
                } else {
                    i = TransactActivity.a.f6745b[bVar2.ordinal()];
                }
                if (i == 1) {
                    c.a aVar2 = mb.c.f8516u;
                    String string = transactActivity.getString(cVar.f13162b);
                    e.C(string, "getString(progress.messageResId)");
                    mb.c cVar2 = new mb.c();
                    Bundle bundle = new Bundle();
                    bundle.putString("ARG_STATUS_MESSAGE", string);
                    cVar2.setArguments(bundle);
                    transactActivity.z = cVar2;
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(transactActivity.getSupportFragmentManager());
                    mb.c cVar3 = transactActivity.z;
                    e.B(cVar3);
                    aVar3.f(R.id.fragmentContainerLayout, cVar3);
                    aVar3.d();
                    return;
                } else if (i == 2) {
                    mb.c cVar4 = transactActivity.z;
                    if (cVar4 != null) {
                        String string2 = transactActivity.getString(cVar.f13162b);
                        e.C(string2, "getString(progress.messageResId)");
                        TextView textView = (TextView) cVar4.b(R.id.progressTextView);
                        if (textView != null) {
                            textView.setText(string2);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i == 3) {
                    if (cVar.f13163c == c.a.SUCCESS) {
                        mb.c cVar5 = transactActivity.z;
                        if (cVar5 != null) {
                            String string3 = transactActivity.getString(cVar.f13162b);
                            e.C(string3, "getString(progress.messageResId)");
                            ImageView imageView = (ImageView) cVar5.b(R.id.statusImageView);
                            if (imageView != null) {
                                imageView.setImageResource(R.drawable.status_success);
                            }
                            ImageView imageView2 = (ImageView) cVar5.b(R.id.statusImageView);
                            if (imageView2 != null) {
                                imageView2.setImageTintList(cVar5.getResources().getColorStateList(R.color.colorAccent));
                            }
                            ImageView imageView3 = (ImageView) cVar5.b(R.id.statusImageView);
                            if (imageView3 != null) {
                                imageView3.setBackgroundTintList(cVar5.getResources().getColorStateList(R.color.colorAccent));
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((ImageView) cVar5.b(R.id.statusImageView), "alpha", new float[]{0.1f, 1.0f});
                            ofFloat.setInterpolator(new AccelerateInterpolator());
                            ofFloat.setDuration(1000);
                            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((ImageView) cVar5.b(R.id.statusImageView), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.2f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.2f})});
                            e.C(ofPropertyValuesHolder, "ofPropertyValuesHolder(s….ofFloat(\"scaleY\", 1.2f))");
                            ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
                            ofPropertyValuesHolder.setDuration(200);
                            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder((ImageView) cVar5.b(R.id.statusImageView), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f})});
                            e.C(ofPropertyValuesHolder2, "ofPropertyValuesHolder(s…er.ofFloat(\"scaleY\", 1f))");
                            ofPropertyValuesHolder2.setInterpolator(new AccelerateInterpolator());
                            ofPropertyValuesHolder2.setDuration(100);
                            ofFloat.addListener(new g(cVar5, string3));
                            ImageView imageView4 = (ImageView) cVar5.b(R.id.statusImageView);
                            if (imageView4 != null) {
                                imageView4.setVisibility(0);
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playSequentially(new Animator[]{ofPropertyValuesHolder, ofPropertyValuesHolder2});
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            cVar5.f8519c = animatorSet2;
                            animatorSet2.playSequentially(new Animator[]{ofFloat, animatorSet});
                            AnimatorSet animatorSet3 = cVar5.f8519c;
                            if (animatorSet3 != null) {
                                animatorSet3.start();
                            }
                            TextView textView2 = (TextView) cVar5.b(R.id.progressTextView);
                            if (textView2 != null) {
                                textView2.setText(BuildConfig.FLAVOR);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    mb.c cVar6 = transactActivity.z;
                    if (cVar6 != null) {
                        String string4 = transactActivity.getString(cVar.f13162b);
                        e.C(string4, "getString(progress.messageResId)");
                        ImageView imageView5 = (ImageView) cVar6.b(R.id.statusImageView);
                        if (imageView5 != null) {
                            imageView5.setImageResource(R.drawable.status_fail);
                        }
                        ImageView imageView6 = (ImageView) cVar6.b(R.id.statusImageView);
                        if (imageView6 != null) {
                            imageView6.setImageTintList(cVar6.getResources().getColorStateList(R.color.colorError));
                        }
                        ImageView imageView7 = (ImageView) cVar6.b(R.id.statusImageView);
                        if (imageView7 != null) {
                            imageView7.setBackgroundTintList(cVar6.getResources().getColorStateList(R.color.colorError));
                        }
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((ImageView) cVar6.b(R.id.statusImageView), "alpha", new float[]{0.1f, 1.0f});
                        ofFloat2.setInterpolator(new AccelerateInterpolator());
                        ofFloat2.setDuration(1000);
                        ofFloat2.addListener(new mb.e(cVar6, string4));
                        ImageView imageView8 = (ImageView) cVar6.b(R.id.statusImageView);
                        if (imageView8 != null) {
                            imageView8.setVisibility(0);
                        }
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((ImageView) cVar6.b(R.id.statusImageView), "translationX", new float[]{0.0f, 25.0f, -25.0f, 25.0f, -25.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f});
                        ofFloat3.setInterpolator(new BounceInterpolator());
                        ofFloat3.setDuration(300);
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        cVar6.f8519c = animatorSet4;
                        animatorSet4.playSequentially(new Animator[]{ofFloat2, ofFloat3});
                        AnimatorSet animatorSet5 = cVar6.f8519c;
                        if (animatorSet5 != null) {
                            animatorSet5.start();
                        }
                        TextView textView3 = (TextView) cVar6.b(R.id.progressTextView);
                        if (textView3 != null) {
                            textView3.setText(BuildConfig.FLAVOR);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }

    public final void onSuccess(Object obj) {
        switch (this.f104a) {
            case 1:
                m0 m0Var = (m0) obj;
                if (((FirebaseMessaging) this.f105b).g.b()) {
                    m0Var.f();
                    return;
                }
                return;
            default:
                j0 j0Var = (j0) this.f105b;
                LocationSettingsResponse locationSettingsResponse = (LocationSettingsResponse) obj;
                int i = ad.c.f307d0;
                e.D(j0Var, "$success");
                j0Var.k(Boolean.TRUE);
                return;
        }
    }

    public final Object then(Task task) {
        boolean z;
        b9.c cVar = (b9.c) this.f105b;
        Objects.requireNonNull(cVar);
        if (task.isSuccessful()) {
            c9.e eVar = cVar.f2915d;
            synchronized (eVar) {
                eVar.f3284c = Tasks.forResult(null);
            }
            k kVar = eVar.f3283b;
            synchronized (kVar) {
                kVar.f3307a.deleteFile(kVar.f3308b);
            }
            if (task.getResult() != null) {
                JSONArray jSONArray = ((f) task.getResult()).f3290d;
                if (cVar.f2913b != null) {
                    try {
                        cVar.f2913b.c(b9.c.b(jSONArray));
                    } catch (JSONException e10) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e10);
                    } catch (l7.a e11) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e11);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
