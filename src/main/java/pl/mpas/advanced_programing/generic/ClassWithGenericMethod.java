package pl.mpas.advanced_programing.generic;

import java.math.BigDecimal;

public class ClassWithGenericMethod {

    private String maybeName;
    private Double maybeIncome;
    private BigDecimal hugeNumber;

    public ClassWithGenericMethod(String maybeName, Double maybeIncome, BigDecimal hugeNumber) {
        this.maybeName = maybeName;
        this.maybeIncome = maybeIncome;
        this.hugeNumber = hugeNumber;
    }

    private String validateString(String toCheck) {
        if (toCheck == null) {

            throw new RuntimeException("Cannot be null!!!");
        }
        return toCheck;
    }

    private Double validateDouble(Double toCheck) {
        if (toCheck == null) {

            throw new RuntimeException("Cannot be null!!!");
        }
        return toCheck;
    }

    private  <T> T validateGeneric(T toCheck) {
        if (toCheck == null) {
            throw new RuntimeException("Brrr");
        }
        return toCheck;
    }


}
