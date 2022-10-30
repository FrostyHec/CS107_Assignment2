import java.util.Scanner;

public class Main4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        final int subject = 4;
        for (int t = 0; t < T; t++) {
            int days[][] = new int[subject][2];
            int sum = 0;
            for (int i = 0; i < subject; i++) {
                days[i][0] = sc.nextInt();
                sum += days[i][0];
            }
            for (int i = 0; i < subject; i++) {
                days[i][1] = sc.nextInt();
            }
            for (int j = 0; j < subject; j++) {//冒泡交换
                for (int i = 0; i < subject - 1 - j; i++) {
                    if (days[i][1] > days[i + 1][1]) {
                        swap(days, i, i + 1);
                    }
                }
            }
            int day = 0;
            for (int i = 0; i < subject && sum < 100; i++) {//用天数最小的最先
                for (int score = 0; days[i][0] + score < 30 && sum < 100; score++) {
                    day += days[i][1];
                    sum++;
                }
            }
            System.out.println(day);
        }
    }

    static void swap(int[][] x, int a, int b) {
        int temp = x[a][1];
        x[a][1] = x[b][1];
        x[b][1] = temp;
        int temp2 = x[a][0];
        x[a][0] = x[b][0];
        x[b][0] = temp2;
    }
}
