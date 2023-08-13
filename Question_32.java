public class Question_32 {
    public static void main(String[] args) {
        int n=5;
        int x=0;
        for(int i=1;i<2*n;i++){
            x=i<=n?i:2*n-i;
            
            for(int j=1;j<2*x;j++){
                
                System.out.print(j%2!=0?x+"\t":"*\t");
            }
            
            
            System.out.println();
        }

    }
}
