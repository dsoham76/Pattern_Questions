public class Question_33 {
    public static void main(String[] args){
        int n=10;
    
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=0;j<2*n;j++){
                if(j>=n){
                    x=(j==n)?0:2*n-j;
                }
                if(j>=n-i && j<=n+i){
                    System.out.print(x+" ");
                }
                else
                    System.out.print("  ");
                x++;
            }
            System.out.println();
        }
    }
}
