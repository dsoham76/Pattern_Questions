public class Question_25 {
    public static void main(String[] args){
        int n=5;
        int x=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<2*n;j++)
                System.out.print(j>n-i-1 && j<n+i-1 ?++x+"\t": " \t");
            System.out.println();
        }
    }
}
