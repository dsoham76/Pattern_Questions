public class Question_27 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            int x=0;
            for(int j=0;j<2*n-1;j++){
                if(j>=n-i-1 && j<=n+i-1){
                    if(j<n || j<=i)
                        ++x;
                    else
                        --x;
                    System.out.print(x+"\t");
                }
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }
    }
}
