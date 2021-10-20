package main.java.sevice;

import java.util.Arrays;
import java.util.Random;

class SortCollectionTest {

    @org.junit.jupiter.api.Test
    void sortHard() {
        int[] array = {4, 0, 8, 1, 6, 4, 5};
        SortCollection.sort(array);
        assert Arrays.compare(array, new int[]{0, 1, 4, 4, 5, 6, 8}) == 0;
    }

    @org.junit.jupiter.api.Test
    void sortRandomData() {
        int size = 10;
        Random random = new Random();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = random.nextInt(10);
        }
        int[] array2 = array1.clone();
        SortCollection.sort(array1);
        Arrays.sort(array2);

        assert Arrays.compare(array1, array2) == 0;
    }

}