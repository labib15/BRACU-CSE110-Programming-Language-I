/*  input = 4,5
12345 
1      5 
1      5 
12345    */


public class Q015{
    public static void main(String[] args) { 
   
    int n=4;
    int m=5;
    for(int i=1;i<=n;i++)
    {
         for(int j=1;j<=m;j++){
           if(i==1||i==n||j==1||j==m)  System.out.print(j);
           else System.out.print("  ");
         }
   System.out.println();
  }    

    }
}