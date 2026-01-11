package x0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.d;
import c3.k;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final b f12745a;

    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f12746a;

        /* renamed from: b  reason: collision with root package name */
        public final d f12747b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12748c = true;

        public a(TextView textView) {
            this.f12746a = textView;
            this.f12747b = new d(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (!this.f12748c) {
                SparseArray sparseArray = new SparseArray(1);
                for (int i = 0; i < inputFilterArr.length; i++) {
                    if (inputFilterArr[i] instanceof d) {
                        sparseArray.put(i, inputFilterArr[i]);
                    }
                }
                if (sparseArray.size() == 0) {
                    return inputFilterArr;
                }
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
                int i10 = 0;
                for (int i11 = 0; i11 < length; i11++) {
                    if (sparseArray.indexOfKey(i11) < 0) {
                        inputFilterArr2[i10] = inputFilterArr[i11];
                        i10++;
                    }
                }
                return inputFilterArr2;
            }
            for (d dVar : inputFilterArr) {
                if (dVar == this.f12747b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, r0);
            inputFilterArr3[r0] = this.f12747b;
            return inputFilterArr3;
        }

        public final boolean b() {
            return this.f12748c;
        }

        public final void c(boolean z) {
            if (z) {
                this.f12746a.setTransformationMethod(e(this.f12746a.getTransformationMethod()));
            }
        }

        public final void d(boolean z) {
            this.f12748c = z;
            this.f12746a.setTransformationMethod(e(this.f12746a.getTransformationMethod()));
            this.f12746a.setFilters(a(this.f12746a.getFilters()));
        }

        public final TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f12748c ? (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new h(transformationMethod) : transformationMethod : transformationMethod instanceof h ? ((h) transformationMethod).f12755a : transformationMethod;
        }
    }

    public static class b {
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z) {
            throw null;
        }

        public void d(boolean z) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    public static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final a f12749a;

        public c(TextView textView) {
            this.f12749a = new a(textView);
        }

        public final InputFilter[] a(InputFilter[] inputFilterArr) {
            if (f()) {
                return inputFilterArr;
            }
            return this.f12749a.a(inputFilterArr);
        }

        public final boolean b() {
            return this.f12749a.f12748c;
        }

        public final void c(boolean z) {
            if (!f()) {
                a aVar = this.f12749a;
                Objects.requireNonNull(aVar);
                if (z) {
                    aVar.f12746a.setTransformationMethod(aVar.e(aVar.f12746a.getTransformationMethod()));
                }
            }
        }

        public final void d(boolean z) {
            if (f()) {
                this.f12749a.f12748c = z;
            } else {
                this.f12749a.d(z);
            }
        }

        public final TransformationMethod e(TransformationMethod transformationMethod) {
            if (f()) {
                return transformationMethod;
            }
            return this.f12749a.e(transformationMethod);
        }

        public final boolean f() {
            return !d.c();
        }
    }

    public f(TextView textView) {
        k.S(textView, "textView cannot be null");
        this.f12745a = new c(textView);
    }
}
