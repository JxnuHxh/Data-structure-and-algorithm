import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int[][] A=new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
              A[i][j]=sc.nextInt();
            }
        }

      int count =  Main03.solution(A);
        for(int x = 0;x<=count;x++){
            for (int y =0;y<A[0].length;y++) {
                if (y == A[0].length-1) {
                    System.out.println(A[x][y]);
                } else {
                    System.out.print(A[x][y] + " ");
                }
            }
        }


    }
    public static int solution(int[][] A) {
        int count = 1;
        int i = 0, j = A.length - 1;
        while(true){
            while (i < j) {
                for (int x = 0; x < A[0].length; x++) {
                    if (A[i][x] != A[j][x]) {
                        count = j;
                        return count;
                    }
                }
                i++;
                j--;
            }
            i = 0;
        }
    }
}
