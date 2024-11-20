public class noduplo<T> {
    public T dado;
    public noduplo<T> proximo;
    public noduplo<T> anterior;

    public noduplo() {
    }

    public noduplo(T dado) {
        this.dado = dado;
    }
}


