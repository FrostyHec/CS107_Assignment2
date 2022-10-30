import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {{
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
            for (int j = 0; j < min; j++) {
                re[j] += arr1[j];
            }
            for (int k = 0; k < max - 1; k++) {
                re[k + 1] += re[k] / 10;
                re[k] %= 10;
            }
            res[i] = re;
        }
        System.out.printf("\n");
        for (int i = 0; i < round; i++) {
            for (int j = res[i].length - 1; j >= 0; j--) {
                System.out.printf("%d", res[i][j]);
            }
            System.out.printf("\n");
        }
    }}

    static int[] Generate(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a / 2; i++) {
            swap(i, arr.length - 1 - i, arr);
        }
        return arr;
    }

    static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
