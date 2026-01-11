package com.github.mikephil.charting.data.filter;

import java.util.Arrays;

public class Approximator {

    public class Line {
        private float dx;
        private float dy;
        private float exsy;
        private float length;
        private float[] points;
        private float sxey;

        public Line(float f10, float f11, float f12, float f13) {
            float f14 = f10 - f12;
            this.dx = f14;
            float f15 = f11 - f13;
            this.dy = f15;
            this.sxey = f10 * f13;
            this.exsy = f12 * f11;
            this.length = (float) Math.sqrt((double) ((f15 * f15) + (f14 * f14)));
            this.points = new float[]{f10, f11, f12, f13};
        }

        public float distance(float f10, float f11) {
            return Math.abs((((this.dy * f10) - (this.dx * f11)) + this.sxey) - this.exsy) / this.length;
        }

        public float[] getPoints() {
            return this.points;
        }
    }

    public float[] concat(float[]... fArr) {
        int i = 0;
        for (float[] length : fArr) {
            i += length.length;
        }
        float[] fArr2 = new float[i];
        int i10 = 0;
        for (float[] fArr3 : fArr) {
            for (float f10 : fArr[r3]) {
                fArr2[i10] = f10;
                i10++;
            }
        }
        return fArr2;
    }

    public float[] reduceWithDouglasPeucker(float[] fArr, float f10) {
        Line line = new Line(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f11 = 0.0f;
        int i = 0;
        for (int i10 = 2; i10 < fArr.length - 2; i10 += 2) {
            float distance = line.distance(fArr[i10], fArr[i10 + 1]);
            if (distance > f11) {
                i = i10;
                f11 = distance;
            }
        }
        if (f11 <= f10) {
            return line.getPoints();
        }
        float[] reduceWithDouglasPeucker = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, 0, i + 2), f10);
        float[] reduceWithDouglasPeucker2 = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, i, fArr.length), f10);
        return concat(reduceWithDouglasPeucker, Arrays.copyOfRange(reduceWithDouglasPeucker2, 2, reduceWithDouglasPeucker2.length));
    }
}
