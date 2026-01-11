package f0;

import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4885a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f4886b;

    public e(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f4885a = new int[size];
        this.f4886b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f4885a[i] = list.get(i).intValue();
            this.f4886b[i] = list2.get(i).floatValue();
        }
    }

    public e(int i, int i10) {
        this.f4885a = new int[]{i, i10};
        this.f4886b = new float[]{0.0f, 1.0f};
    }

    public e(int i, int i10, int i11) {
        this.f4885a = new int[]{i, i10, i11};
        this.f4886b = new float[]{0.0f, 0.5f, 1.0f};
    }
}
