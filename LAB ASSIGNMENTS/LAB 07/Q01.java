/*input=6;
 1,2,3,4,5,6.*/

import java.util.Scanner;
public class Q01 {
    
  public static void main(String[] args) { 
   Scanner sc=new Scanner(System.in);
     
     System.out.println("please input integer n");      
     int n=sc.nextInt();
        
     for(int i=1;i<=n;i++)
     {
       System.out.print(i);
     }
 
  sc.close();
  }
}