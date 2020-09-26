import java.util.Scanner;

public class Main04 {
    private static int count;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        int[][] a=new int[m][n];

        for(int i = 0; i< m;i++){
            for(int j = 0; j< n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i< m;i++){
            for(int j = 0; j< n;j++){
               if(a[i][j]==1){
                   count++;
                   solution( a,i,j);
               }
            }
        }
        System.out.println(count);
    }
    public static void solution(int[][] a,int i,int j){
        if(i<0||i>=a.length||j<0||j>=a[0].length||a[i][j]!=1) return;
        a[i][j] = 0;
        solution(a,i+1,j);
        solution(a,i-1,j);
        solution(a,i,j-1);
        solution(a,i,j+1);
    }
}
