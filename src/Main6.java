import java.util.Scanner;

public class Main6 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            StringBuilder st=new StringBuilder();
            st.append(sc.next());
            st.reverse();
            for(int k=0;k<st.length();k+=2){
                char temp=st.charAt(k);
                st.setCharAt(k,st.charAt(k+1));
                st.setCharAt(k+1,temp);
            }
            if(j!=0){
                System.out.printf(" ");
            }
            System.out.printf(st.toString());
        }
    }
}
