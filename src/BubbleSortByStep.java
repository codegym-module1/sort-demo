import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + array.length + " values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static void  bubbleSortByStep(int[] array) {
        for (int u = array.length - 1; u > 0; u--) {
            for (int i = 0; i < u; i++) {
                if (array[i] > array[i + 1]) {
                    int k = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = k;
                }
            }
        }
    }
}
