/* input = 4
 
   * 
  *** 
 ***** 
******* 
 ***** 
  *** 
   * 
                      */

public class Q012 {

    
    public static void main(String[] args) { 
    int n=4;
    for(int i=1;i<n;i++)
    {
      for(int k=1;k<=n-i;k++) System.out.print(" ");
      
      for(int j=1;j<=2*i-1;j++) System.out.print("*");
      System.out.println();
   
      
    }
 int k;
    for(int i=1;i<=n;i++){
      
      for(k=0;k<i-1;k++)  System.out.print(" ");
      
      for (int j=1;j<=(n-i)*2+1;j++)  System.out.print("*");
      
      System.out.println();
    }
  }    
}