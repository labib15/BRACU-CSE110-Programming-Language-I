/*input =4
      4 
    34 
  234 
1234   */

import java.util.Scanner;
public class Q011 {
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
          for(int k=1;k<=n-i;k++)  System.out.print("  ");
          for (int j=1;j<=i;j++)   System.out.print(n+j-i);
          
          System.out.println();
 
    }
    sc.close();
  }      
}