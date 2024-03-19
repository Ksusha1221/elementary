package ru.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{32, 43,11};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{11, 32, 43};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{31, 40, -1, 2, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-1, 2, 15, 31, 40};
        assertThat(result).containsExactly(expected);
    }
}
