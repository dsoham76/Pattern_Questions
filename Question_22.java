public class Question_22 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++)
                System.out.print(j<n-i || j>n+i-2 ?"*\t":" \t");
            System.out.println();
        } 
    }
}
