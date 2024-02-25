package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

        @Test
        void whenConvert140RblThen1Dot4Euro() {
            float in = 140;
            float expected = 1.4f;
            float out = Converter.rubleToEuro(in);
            float eps = 0.0001f;
            assertThat(out).isEqualTo(expected, withPrecision(eps));
        }

        @Test
        void whenConvert200RblThen2dot2222Dlr() { //доделать
            float in1 = 200;
            float expected1 = 2.2222f;
            float out1 = Converter.rubleToDollar(in1);
            float eps1 = 0.0001f;
            assertThat(out1).isEqualTo(expected1, withPrecision(eps1));
        }

}