//Write a java program that reads 10 numbers from the user, and then prints only the even numbers in reverse order.

import java.util.Scanner;

public class Q08{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
    
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz[i]=sc.nextInt();
      
    }
   System.out.println("the even numbers from the list in reverse order are ");
    for(int k=xyz.length-1;k>=0;k--) if(xyz[k]%2==0){
      System.out.println(xyz[k]);
      
    }
    sc.close();  
  }
}