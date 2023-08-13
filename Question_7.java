public class Question_7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(i==0||i==n-1||j==0||j==n-1?"*\t":" \t");
            System.out.println();
        }
    }
}
