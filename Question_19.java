public class Question_19 {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++)
            System.out.print("*\t");
        System.out.println();
        for(int i=0;i<(n-1)/2-1;i++){
            for(int j=0;j<(n-1)/2-i;j++)
                System.out.print("*\t");
            for(int j=0;j<=2*i;j++)
                System.out.print(" \t");
            for(int j=0;j<(n-1)/2-i;j++)
                System.out.print("*\t");
            
            System.out.println();
        }

        for(int i=0;i<(n-1)/2;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*\t");
            for(int j=0;j<n-2*i-2;j++)
                System.out.print(" \t");
            for(int j=0;j<=i;j++)
                System.out.print("*\t");
            
            System.out.println();
        }
        

        for(int i=0;i<n;i++)
            System.out.print("*\t");

    }
}
