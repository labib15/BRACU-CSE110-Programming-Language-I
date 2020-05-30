//Write a java program that reads 10 numbers from the user. 
//Then read another number from the user, and print “yes” if this number exists among the first 10. Print “no” otherwise.

import java.util.Scanner;

public class Q09{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
     int count=0;
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz[i]=sc.nextInt();
      
    }
     System.out.println("please input your integer,z");
     int z=sc.nextInt();
  for(int k=0;k<xyz.length;k++)  if (xyz[k]==z)  count++;
    
    
     if(count>0) System.out.println("yes");
     else System.out.println("no");
sc.close();
  
  }
}