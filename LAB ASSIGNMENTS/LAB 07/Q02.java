/*imput=6;
 ******(6)   */

import java.util.Scanner;
public class Q02 {

  public static void main(String[] args) { 
   Scanner sc=new Scanner(System.in);
   
   System.out.println("please input integer n");     
   int n=sc.nextInt();

   for(int i=1;i<=n;i++)
     {
       System.out.print("*");
     }
  
     sc.close();
  }
}