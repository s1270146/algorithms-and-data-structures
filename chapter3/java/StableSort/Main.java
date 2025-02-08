import java.util.HashMap;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        HashMap<String, Integer>  value = new HashMap<String, Integer>();
        final String[] a = new String[n];
        final String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            String card = scanner.next();
            value.put(card, Character.getNumericValue(card.charAt(1)));
            a[i] = card;
            b[i] = card;
        }
        scanner.close();

        // Bubble Sort
        String[] sortedA = bubbleSort(a, n, value);

        // Selection Sort
        String[] sortedB = selectionSort(b, n, value);

        // Print
        printList(sortedA, n);
        System.out.println("Stable");
        
        printList(sortedB, n);
        System.out.println(compareList(sortedA, sortedB, n));

    }

    private static String[] bubbleSort(String[] a, int n, HashMap<String, Integer> value) {
        boolean flag = true;
        int i = 0;
        while (flag) { 
            flag = false;
            for (int j = n - 1; j > i; j--) {
                if (value.get(a[j]) < value.get(a[j-1])) {
                    String tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    flag = true;
                }
            }
        }
        return a;
    }

    private static String[] selectionSort(String a[], int n, HashMap<String, Integer> value){
        for (int i = 0; i < n; i++) {
            int minj = i;
            for (int j = i; j < a.length; j++) {
                if(value.get(a[j]) < value.get(a[minj])){
                    minj = j;
                }
            }
            if (minj != i) {
                String tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;
            }
        }
        return a;
    }

    private static void printList(String[] a, int n){
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }

    private static String compareList(String[] a, String[] b, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                return "Not stable";
            }
        }
        return "Stable";
    }
}