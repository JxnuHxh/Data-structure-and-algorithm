import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a =new int[n];
         for(int i = 0 ; i < n; i++){
             a[i]=sc.nextInt();
         }
         Main01.solution(a,n,m,k);
    }
    public static void solution(int[] a,int n,int m,int k){
        int count = 0;
        for(int i = 0;i < n;i++){
            for(int j=i;(j<m+i)&&(j<n);j++){
                if(a[j]<k){
                    i=j+1;
                }
            }
            if((m+i)>n)
            {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
