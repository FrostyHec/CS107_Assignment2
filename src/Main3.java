import java.util.Scanner;

public class Main3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[sc.nextInt()-1] =1;
        }
        boolean isInitial=true;
        for (int i=0;i<n;i++){
            if(arr[i]==0){
                if(isInitial){
                    System.out.print(i+1);
                    isInitial=false;
                }else {
                    System.out.print(" ");
                    System.out.print(i+1);
                }
            }
        }
        if(isInitial){
            System.out.printf("NULL");
        }
    }
}
