/* input =5 
        5 
      45 
    3  5 
  2    5 
12345     */


public class Q019 {
    public static void main(String[] args) { 
    int n=5;

    for(int i=1;i<=n;i++)
    { for (int k=1;k<=n-i;k++) System.out.print("  ");
      for(int j=1;j<=i;j++){
      if(i==1||i==n||j==1||j==i) System.out.print(n+j-i);
      else System.out.print("  ");
  }
System.out.println();
  }    

    }
}