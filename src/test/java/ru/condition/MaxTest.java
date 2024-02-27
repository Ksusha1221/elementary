package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void max() {
        int a = 1;
        int b = 2;
        int c = 3;
        int rsl = 3;
        double out = Max.max(a, b, c);
        assertThat(out).isEqualTo(rsl);
    }
}