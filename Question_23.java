public class Question_23 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++)
                System.out.print(j>=n-i-1 && j<=n+i-1 ?"1\t":" \t");
            System.out.println();
        }
    } 
}
