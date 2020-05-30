//Write a java program that reads 10 numbers from the user.
//The program then reads a number between 0 to 9, and shows the number at the corresponding index number.
//For instance, if the array is a and the user enters 3, your program should print the value a[3].

import java.util.Scanner;

public class Q02{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
   
    for(int i=0;i<xyz.length;i++) {
     System.out.println("please input your integer");
      xyz[i]=sc.nextInt();
   
    }
   
     System.out.println("please input your index number, n");
    int n=sc.nextInt();
     System.out.println(xyz[n]);
  
  sc.close();
  
  
  }
}