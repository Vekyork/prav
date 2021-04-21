package ru.geekbrains.lesson14;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FourTest {
    @Test
    void getPartOfArray() {
      Four four = new Four();
        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] result = {1, 7};
        Assertions.assertEquals(result, four.getPartOfArray(arr));
    }
    @Test
    void checkArrayFor1And4() {
        Four four = new Four();
        int[] arr = {1, 1, 1, 4, 4, 1, 4, 4};
        boolean result = true;
        assertTrue(four.checkArrayFor1And4(arr));
    }
}