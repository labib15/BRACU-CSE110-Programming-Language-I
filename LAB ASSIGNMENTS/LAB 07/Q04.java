/* input=4,6
 123456
 123456
 123456
 123456   */

import java.util.Scanner;
public class Q04 {
  
  
  public static void main(String[] args) { 
   Scanner sc=new Scanner(System.in);
   
   System.out.println("please input integer z");    
    int z=sc.nextInt();
  
   System.out.println("please input integer n");     
   int n=sc.nextInt();
   
    for(int a=1;a<=z;a++) 
    {   
       
         for(int i=1;i<=n;i++)   System.out.print(i);
   
     System.out.println();
    }
 
 sc.close();
 }
}