public class Question_13 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<2*n;i++){
            if(i<=n){
                for(int j=0;j<i;j++)
                    System.out.print("* ");
            }else{
                for(int j=0;j<2*n-i;j++)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
