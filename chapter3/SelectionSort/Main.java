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
        SelectionSort(a, n);
    }

    private static void SelectionSort(int a[], int n){
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < a[minj]){
                    minj = j;
                }
            }
            if (minj != i) {
                int tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;
                cnt++;
            }
        }
        printArrayInt(a, n, cnt);
    }

    private static void printArrayInt(int[] a, int n, int cnt) {
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println(cnt);
    }
}
