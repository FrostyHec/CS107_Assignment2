import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int round = sc.nextInt();
        int[][] res = new int[round][];
        for (int i = 0; i < round; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            int[] re, arr1;
            int min = 0, max = 0;
            if (a >= b) {
                re = Generate(a);
                max = a;
                arr1 = Generate(b);
                min = b;
            } else {
                arr1 = Generate(a);
                max = b;
                re = Generate(b);
                min = a;
            }
            for (int j = min - 1, k = max - 1; j >= 0; j--, k--) {
                re[k] += arr1[j];
            }
            for (int k = max - 1; k > 0; k--) {
                re[k - 1] += re[k] / 10;
                re[k] %= 10;
            }
            for (int j = 0; j < re.length; j++) {
                System.out.printf("%d", re[j]);
            }
            System.out.printf("\n");
        }
    }

    static int[] Generate(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
