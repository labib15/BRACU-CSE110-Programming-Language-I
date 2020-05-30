/* input = 4
     * 
    * * 
   *   * 
  *     * 
*********       */


public class Q020{
    public static void main(String[] args) { 
    int n=5;

    for(int i=1;i<=n;i++)
    { for (int k=1;k<=n-i;k++) System.out.print(" ");
      for(int j=1;j<=2*i-1;j++){
       if (i==1||i==n||j==1||j==2*i-1) System.out.print("*");
      else System.out.print(" ");
    
    }
System.out.println();
  }    
}
}