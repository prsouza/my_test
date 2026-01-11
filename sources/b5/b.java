package b5;

public interface b {

    public interface a<T> {
        T a();
    }

    <T> T a(a<T> aVar);
}
