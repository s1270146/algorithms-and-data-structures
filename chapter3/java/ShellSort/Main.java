import java.util.Scanner;

/**
 * Main
 */
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
        shellSort(a, n);
    }

    private static int insertionSort(int[] a, int n, int g) {
        int cnt = 0;
        for (int i = g; i < n; i++) {
            int v = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > v) { 
                a[j+g] = a[j];
                j = j - g;
                cnt++;
            }
            a[j+g]= v;
        }
        return cnt;
    }

    private static void shellSort(int[] a, int n) {
        int cnt = 0;
        int m = 0;
        int[] G = new int[15];

        for (int i = 1; i <= n; i = i*3 + 1) {
            G[m] = i;
            m++;
        }

        for (int i = m-1; i >= 0; i--) {
            cnt += insertionSort(a, n, G[i]);
        }

        System.out.println(m);
        for (int i = m-1; i >= 0; i--) {
            System.out.print((i==m-1 ? "" : " ") + G[i] + (i==0 ? "\n" : ""));
        }
        System.out.println(cnt);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}