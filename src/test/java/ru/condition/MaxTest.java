package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenA1B2then2() {
        int a = 1;
        int b = 2;
        int rsl = 2;
        double out = Max.max2(a, b);
        assertThat(out).isEqualTo(rsl);
    }

    @Test
    void whenA1B2C3then3() {
        int a = 1;
        int b = 2;
        int c = 3;
        int rsl = 3;
        double out = Max.max3(a, b, c);
        assertThat(out).isEqualTo(rsl);
    }
}