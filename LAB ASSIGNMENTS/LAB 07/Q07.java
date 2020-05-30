/* input=4
   *
  **
 ***
****     */

import java.util.Scanner;
public class Q07 {
    
  public static void main(String[] args) { 
   Scanner sc=new Scanner(System.in);
   
   System.out.println("please input integer z");    
    int z=sc.nextInt();
   
    for(int i=1;i<=z;i++) 
    {   
      for(int k=1;k<=z-i;k++)    System.out.print(" ");
   
       for(int j=1;j<=i;j++)    System.out.print("*");
     
       System.out.println();
    }

  sc.close();
  }
}