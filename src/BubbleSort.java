public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 3, 6};
        printArray(array);
        bubbleSort(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static void bubbleSort(int[] array) {
        for (int u = array.length-1; u > 0; u--) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
            }
        }
        System.out.println();
        printArray(array);
    }
}
