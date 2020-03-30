package lesson5.hometask;

import java.math.BigInteger;
import java.util.Collections;

public class Wrapper {
    static <T> T getValue(T object) {
        return (T) object;
    }

    public static void main(String[] args) {
        AbstractValue<Value> txt = new AbstractValue<>(new TextValue("123"));
        System.out.println(txt.getValue().getValue());
    }
}
