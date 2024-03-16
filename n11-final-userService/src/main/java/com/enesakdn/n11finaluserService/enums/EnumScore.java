package com.enesakdn.n11finaluserService.enums;

public enum EnumScore {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int value;

    EnumScore(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /*
    Bu enum, 1'den 5'e kadar olan değerleri (ONEden FIVEe kadar) temsil eder ve
    her bir değerin kendine ait bir tamsayı değeri vardır. Bu enum, yorumların derecelendirilmesi için kullanılabilir.
     Örneğin, EnumScore.FOUR ifadesi "dört" değerini, EnumScore.THREE.getValue() ifadesi ise 3 değerini döndürür.
     */

}
