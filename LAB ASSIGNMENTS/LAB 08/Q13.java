//Write a java program that reads 10 numbers from the user, 
//and then separately prints the sum of all the even numbers, odd numbers and numbers divisible by 5.

import java.util.Scanner;
public class Q13{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
  int sum_even=0;
  int sum_odd=0;
  int sum_divby5=0;
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz [i]=sc.nextInt();
   
     if(xyz[i]%2==0) sum_even+=xyz[i];
      else sum_odd+=xyz[i];
      
      if(xyz[i]%5==0)  sum_divby5+=xyz[i];    
    }
    
   System.out.println("even sum "+sum_even);
   System.out.println("odd sum "+sum_odd);
   System.out.println("divisible by 5 "+ sum_divby5);
    
  }
}