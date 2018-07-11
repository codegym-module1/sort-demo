public class BubbleSort {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{2, 3, 5, 6, 1, -2, 14, 12, 36, 10};
        System.out.println("Array " + array);
        printArray(array);
        bubbleSort(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +  "\t");
        }
    }

    private static void  bubbleSort(int[] array) {
        for (int u = array.length - 1; u > 0; u--) {
            for (int i = 0; i < u; i++) {
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
