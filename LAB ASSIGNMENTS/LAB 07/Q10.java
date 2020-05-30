/*  input =4
   1 
  123 
 12345 
1234567     */

import java.util.Scanner;
public class Q10 {
  
  public static void main(String[] args) { 
   Scanner sc=new Scanner(System.in);
   
   System.out.println("please input integer z");       
   int z=sc.nextInt();
   
    for(int i=1;i<=z;i++) 
    {   
      for(int k=1;k<=z-i;k++)   System.out.print(" ");
       
       for(int j=1;j<=2*i-1;j++)    System.out.print(j);
    
     System.out.println();
    }

  sc.close();
  }
}