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

        // Bubble Sort
        bubbleSort(a, n);
    }

    private static void bubbleSort(int[] a, int n) {
        boolean flag = true;
        int i = 0;
        int cnt = 0;
        while (flag) { 
            flag = false;
            for (int j = n - 1; j > i; j--) {
                if (a[j] < a[j-1]) {
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    flag = true;
                    cnt++;
                }
            }
        }
        printArrayInt(a, n);
        System.out.println(cnt);
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