/* input = 4
> run Q013
      1 
    123 
  12345 
1234567 
  12345 
    123 
      1       */


public class Q013 {

    public static void main(String[] args) { 
    int n=4;
    for(int i=1;i<n;i++)
    {
      for(int k=1;k<=n-i;k++) System.out.print("  ");
      
      for(int j=1;j<=2*i-1;j++) System.out.print(j);
      System.out.println();
   
      
    }
 int k;
    for(int i=1;i<=n;i++){
      
      for(k=0;k<i-1;k++)  System.out.print("  ");
      
      for (int j=1;j<=(n-i)*2+1;j++)  System.out.print(j);
      
      System.out.println();
    }
  }    
}