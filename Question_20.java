public class Question_20 {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<(n-1)/2;i++){
            for(int j=0;j<(n-1)/2-i;j++)
                System.out.print(" \t");
            for(int j=0;j<2*i+1;j++)
                System.out.print(j==0||j==2*i?"*\t":" \t");
            System.out.println();
        }

        for(int i=0;i<=(n-1)/2;i++){
            for(int j=0;j<i;j++)
                System.out.print(" \t");
            for(int j=0;j<n-2*i;j++)
                System.out.print(j==0||j==(n-2*i-1)?"*\t":" \t");
            System.out.println();
        }



    }
}
