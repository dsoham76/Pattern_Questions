public class Question_15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<2*i;j++)
                System.out.print(" \t");
            for(int j=0;j<n-i;j++)
                System.out.print("*\t");
            
            System.out.println();
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<2*(n-i);j++)
                System.out.print(" \t");
            for(int j=0;j<i;j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
