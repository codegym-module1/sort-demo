public class SelectionSort {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{2, 3, 5, 6, 1, -2, 14, 12, 36, 10};
        printArray(array);
        selectionSort(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  "\t");
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int k = array[i];
            int position = i;
            for (int u = i + 1; u < array.length; ) {
                if (k > array[u]) {
                    k = array[u];
                    position = u;
                }
            }
            array[position] = array[i];
            array[i] = k;
        }
        System.out.println();
        printArray(array);
    }
}
