public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 1, -2, 14, 12, 36, 10};
        printArray(array);
        selectionSort(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int u = i + 1; u < array.length; u++) {
                if (currentMin > array[u]) {
                    currentMin = array[u];
                    currentMinIndex = u;
                }
            }
            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        System.out.println();
        printArray(array);
    }
}
