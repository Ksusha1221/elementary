package ru.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected1 = 3;
        int rsl1 = X2.calc(a, b, c, x);
        assertThat(rsl1).isEqualTo(expected1);
    }

    @Test
    void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected2 = 2;
        int rsl2 = X2.calc(a, b, c, x);
        assertThat(rsl2).isEqualTo(expected2);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected3 = 2;
        int rsl3 = X2.calc(a, b, c, x);
        assertThat(rsl3).isEqualTo(expected3);
    }

    @Test
    void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected4 = 1;
        int rsl4 = X2.calc(a, b, c, x);
        assertThat(rsl4).isEqualTo(expected4);
    }
}
