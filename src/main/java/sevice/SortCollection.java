package main.java.sevice;

public  class SortCollection {
    public static int[] sort(int[] collection) {
        int left = 0;
        int right = collection.length - 1;
        doSubSort(collection, left, right);
        return collection;
    }

    private static void doSubSort(int[] collection, int left, int right) {
        if (left<right) {
                int middle = getMiddle(collection, left, right);
                doSubSort(collection, left, middle-1);
                doSubSort(collection, middle, right);
        }
    }

    private static int getMiddle(int[] collection, int left, int right) {
        int from = left;
        int to = right;
        int pivot = getPivot(collection, left, right);
        while (from<=to) {
            while (collection[from]<pivot) from++;
            while (collection[to]>pivot) to--;
            if(from<=to) {
                swap(collection, from, to);
                from++;
                to--;
            }
        }
        return from;
    }

    private static int getPivot(int[] collection, int left, int right) {
        return collection[(left + right)/2];
    }


    private static void swap(int[] collection, int left, int right) {
        int tmp = collection[left];
        collection[left] = collection[right];
        collection[right] = tmp;
    }

}
