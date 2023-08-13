public class Question_26 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=1;j<2*n;j++)
                System.out.print(j>=n-i && j<=n+i ?++x+"\t":" \t");
            System.out.println();
        }
    }
}
