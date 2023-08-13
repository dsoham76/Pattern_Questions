public class Question_31 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=5;j>0;j--)
                System.out.print(i==j?"*\t":j+"\t");
            System.out.println();
        }
    }
}
