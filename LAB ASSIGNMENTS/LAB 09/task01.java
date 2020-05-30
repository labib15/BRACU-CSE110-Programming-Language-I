/*Write a program which reads 5 numbers into an array and prints the largest number. 
If the user enters 7, 13, 2, 10, 6 then your program should print 13.*/


import java.util.Scanner;
public class task01{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
  
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz [i]=sc.nextInt();
    }
    
    int max=xyz[0];
    
    for(int i=0;i<xyz.length;i++){
      if (xyz[i]>max) max=xyz[i]; 
    }
    System.out.println("max "+max);

  }
}