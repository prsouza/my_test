package wb;

import a.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import e6.e;
import java.util.Objects;

public final class c extends a implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12642a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12643b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12644c;

    /* renamed from: d  reason: collision with root package name */
    public final Bitmap f12645d;

    /* renamed from: e  reason: collision with root package name */
    public final Matrix f12646e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    public Display f12647f;
    public SensorManager g;

    /* renamed from: h  reason: collision with root package name */
    public Sensor f12648h;
    public Sensor i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f12649j = new float[3];

    /* renamed from: k  reason: collision with root package name */
    public float[] f12650k = new float[3];

    /* renamed from: l  reason: collision with root package name */
    public float f12651l;

    public c(Context context, float f10, float f11, Bitmap bitmap) {
        this.f12642a = context;
        this.f12643b = f10;
        this.f12644c = f11;
        this.f12645d = bitmap;
        Object systemService = context.getSystemService("sensor");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.g = sensorManager;
        this.f12648h = sensorManager.getDefaultSensor(1);
        SensorManager sensorManager2 = this.g;
        this.i = sensorManager2 != null ? sensorManager2.getDefaultSensor(2) : null;
        Object systemService2 = context.getSystemService("window");
        Objects.requireNonNull(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        this.f12647f = ((WindowManager) systemService2).getDefaultDisplay();
    }

    public final void a(Canvas canvas) {
        Matrix matrix = this.f12646e;
        float width = this.f12643b - ((float) (this.f12645d.getWidth() / 2));
        Context context = this.f12642a;
        float f10 = 1.0f;
        float f11 = width - ((context != null ? context.getResources().getDisplayMetrics().density : 1.0f) * 1.0f);
        float height = this.f12644c - ((float) this.f12645d.getHeight());
        Context context2 = this.f12642a;
        if (context2 != null) {
            f10 = context2.getResources().getDisplayMetrics().density;
        }
        matrix.setTranslate(f11, (14.0f * f10) + height);
        this.f12646e.postRotate(this.f12651l, this.f12643b, this.f12644c);
        if (canvas != null) {
            canvas.drawBitmap(this.f12645d, this.f12646e, (Paint) null);
        }
    }

    public final float[] b(float[] fArr, float[] fArr2) {
        if (fArr2 == null) {
            return fArr;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = a.a(fArr[i10], fArr2[i10], 0.1f, fArr2[i10]);
        }
        return fArr2;
    }

    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        e.D(sensorEvent, "sensorEvent");
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            this.f12649j = b((float[]) sensorEvent.values.clone(), this.f12649j);
        } else if (type == 2) {
            this.f12650k = b((float[]) sensorEvent.values.clone(), this.f12650k);
        } else {
            return;
        }
        float[] fArr = new float[9];
        Integer num = null;
        boolean rotationMatrix = SensorManager.getRotationMatrix(fArr, (float[]) null, this.f12649j, this.f12650k);
        float[] fArr2 = new float[9];
        Display display = this.f12647f;
        if (display != null) {
            num = Integer.valueOf(display.getRotation());
        }
        if (num != null && num.intValue() == 0) {
            fArr2 = (float[]) fArr.clone();
        } else if (num != null && num.intValue() == 1) {
            SensorManager.remapCoordinateSystem(fArr, 2, 129, fArr2);
        } else if (num != null && num.intValue() == 2) {
            SensorManager.remapCoordinateSystem(fArr, 129, 130, fArr2);
        } else if (num != null && num.intValue() == 3) {
            SensorManager.remapCoordinateSystem(fArr, 130, 1, fArr2);
        }
        float[] fArr3 = new float[3];
        if (rotationMatrix) {
            SensorManager.getOrientation(fArr2, fArr3);
        }
        this.f12651l = (float) (((double) (fArr3[0] * ((float) 180))) / 3.141592653589793d);
    }
}
