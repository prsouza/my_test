package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import io.nodle.cash.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;

class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int J = 0;
    public final MaterialButtonToggleGroup H;
    public final a I;

    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.J;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.I = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.H = materialButtonToggleGroup;
        materialButtonToggleGroup.f3751c.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            s();
        }
    }

    public final void s() {
        c.a aVar;
        if (this.H.getVisibility() == 0) {
            c cVar = new c();
            cVar.c(this);
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            char c10 = 1;
            if (x.e.d(this) == 0) {
                c10 = 2;
            }
            if (cVar.f1515c.containsKey(Integer.valueOf(R.id.material_clock_display)) && (aVar = cVar.f1515c.get(Integer.valueOf(R.id.material_clock_display))) != null) {
                switch (c10) {
                    case 1:
                        c.b bVar = aVar.f1519d;
                        bVar.i = -1;
                        bVar.f1545h = -1;
                        bVar.F = -1;
                        bVar.M = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        break;
                    case 2:
                        c.b bVar2 = aVar.f1519d;
                        bVar2.f1550k = -1;
                        bVar2.f1548j = -1;
                        bVar2.G = -1;
                        bVar2.O = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        break;
                    case 3:
                        c.b bVar3 = aVar.f1519d;
                        bVar3.f1554m = -1;
                        bVar3.f1552l = -1;
                        bVar3.H = 0;
                        bVar3.N = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        break;
                    case 4:
                        c.b bVar4 = aVar.f1519d;
                        bVar4.f1556n = -1;
                        bVar4.f1558o = -1;
                        bVar4.I = 0;
                        bVar4.P = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        break;
                    case 5:
                        c.b bVar5 = aVar.f1519d;
                        bVar5.f1560p = -1;
                        bVar5.f1561q = -1;
                        bVar5.f1562r = -1;
                        bVar5.L = 0;
                        bVar5.S = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        break;
                    case 6:
                        c.b bVar6 = aVar.f1519d;
                        bVar6.f1563s = -1;
                        bVar6.f1564t = -1;
                        bVar6.K = 0;
                        bVar6.R = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        break;
                    case 7:
                        c.b bVar7 = aVar.f1519d;
                        bVar7.f1565u = -1;
                        bVar7.f1566v = -1;
                        bVar7.J = 0;
                        bVar7.Q = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
                        break;
                    case 8:
                        c.b bVar8 = aVar.f1519d;
                        bVar8.B = -1.0f;
                        bVar8.A = -1;
                        bVar8.z = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            cVar.a(this);
        }
    }
}
