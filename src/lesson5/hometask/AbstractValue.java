package lesson5.hometask;

public class AbstractValue<T> {

    T value;

    public AbstractValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
