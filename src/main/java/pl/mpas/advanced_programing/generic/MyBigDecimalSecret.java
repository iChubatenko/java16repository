package pl.mpas.advanced_programing.generic;

import java.math.BigDecimal;

public class MyBigDecimalSecret {

    private BigDecimal mySecret;

    public MyBigDecimalSecret(BigDecimal mySecret) {
        this.mySecret = mySecret;
    }

    public BigDecimal getMySecret() {
        return mySecret;
    }

    @Override
    public String toString() {
        return "MyBigDecimalSecret{" +
                "mySecret=" + mySecret +
                '}';
    }
}
