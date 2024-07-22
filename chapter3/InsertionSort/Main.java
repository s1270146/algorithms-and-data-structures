import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Input
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();

        // Sort
        insertionSort(a, n);
    }

    private static void insertionSort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int v = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > v) { 
                a[j+1] = a[j];
                j--;
            }
            a[j+1]= v;
            printArrayInt(a, n);
        }
    }

    private static void printArrayInt(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }
}