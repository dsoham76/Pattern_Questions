public class Question_28 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            int x=i;
            for(int j=0;j<2*n-1;j++){
                if(j>=n-i-1 && j<=n+i-1){
                    x=j<n ?++x:--x;
                    System.out.print(x+"\t");
                }else{
                    System.out.print(" \t");
                }

            }
                
            System.out.println();
        }
    }
}
