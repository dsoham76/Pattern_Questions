public class Question_29 {
    public static void main(String[] args) {
        int n=5;
        int x;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(j>=n-i-1 && j<=n+i-1){
                    x=(j==n-i-1 || j==n+i-1)?i+1:0;
                    System.out.print(x+"\t");
                }
                else
                System.out.print(" \t");
            }
            System.out.println();
        }
    }
}
