package lesson5.hometask;

import java.math.BigInteger;
import java.util.List;

public class RefValue extends Value {

    List<BigInteger> value;

    public RefValue(List<BigInteger> value) {
        this.value = value;
    }

    @Override
    List<BigInteger> getValue() {
        return value;
    }
}
