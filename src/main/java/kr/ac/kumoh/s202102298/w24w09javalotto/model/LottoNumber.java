package kr.ac.kumoh.s202102298.w24w09javalotto.model;

import java.util.Arrays;

public class LottoNumber {
    private final int[] numbers;

    public LottoNumber(int[] numbers) {
        this.numbers = Arrays.copyOf(numbers, numbers.length);
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }
}
