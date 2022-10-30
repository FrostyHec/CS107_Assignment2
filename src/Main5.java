import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[5][2];
        for (int i = 0; i < 5; i++) {
            input(arr, i);
        }
        if (isStraight(arr) && isFlush(arr)) {
            System.out.printf("Straight Flush");
        } else if (isFlush(arr)) {
            System.out.printf("Flush");
        } else if (isStraight(arr)) {
            System.out.printf("Straight");
        } else if (isThreeOfAKind(arr)) {
            System.out.printf("Three of a Kind");
        } else if (isPair(arr)) {
            System.out.printf("Pair");
        } else {
            System.out.printf("High Card");
        }

    }

    static void input(int[][] arr, int i) {
        String x = sc.next();
        switch (x) {
            case "S":
                arr[i][0] = 0;
                break;
            case "H":
                arr[i][0] = 1;
                break;
            case "D":
                arr[i][0] = 2;
                break;
            case "C":
                arr[i][0] = 3;
                break;
        }
        arr[i][1] = sc.nextInt();
    }

    static boolean isStraight(int[][] arr) {
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr2[i] = arr[i][1];
        }
        Arrays.sort(arr2);
        for (int j = 0; j < 4; j++) {
            if (arr2[j] + 1 != arr2[j + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isFlush(int[][] arr) {
        for (int j = 0; j < 5; j++) {
            if (arr[0][0] != arr[j][0]) {
                return false;
            }
        }
        return true;
    }

    static boolean isThreeOfAKind(int[][] arr) {
        int[] value = new int[13];
        for (int i = 0; i < 5; i++) {
            value[arr[i][1] - 1]++;
        }

        for (int x : value) {
            if (x >= 3) {
                return true;
            }
        }
        return false;
    }

    static boolean isPair(int[][] arr) {
        int[] value = new int[13];
        for (int i = 0; i < 5; i++) {
            value[arr[i][1] - 1]++;
        }

        for (int x : value) {
            if (x >= 2) {
                return true;
            }
        }
        return false;
    }
}
