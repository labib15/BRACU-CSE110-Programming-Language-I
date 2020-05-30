//Write a java program that reads 10 numbers from the user. After reading each number, print all the numbers that have been entered so far.
//After user enters 11, print 11
//After user enters 22, print 11, 22


import java.util.Scanner;

public class Q10{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
    
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz[i]=sc.nextInt();
      
      
        
        for(int k=0;k<=i;k++) System.out.print(xyz[k]);
    
     
      System.out.println();
    }
 sc.close();   
    
  }
}