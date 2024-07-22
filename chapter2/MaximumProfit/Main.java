import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = scanner.nextInt();
        }
        int minv, maxv;
        minv = r[0];
        maxv = -2000000000;
        for (int i = 1; i < n; i++) {
            maxv = Math.max(maxv, r[i] - minv);
            minv = Math.min(minv, r[i]);
        }
        System.out.println(maxv);
    }
}