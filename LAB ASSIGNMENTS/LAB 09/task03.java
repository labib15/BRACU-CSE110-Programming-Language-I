/*Write a program which reads 5 numbers into an array and prints the smallest and largest number and their location in the array.
If the user enters 7, 13, -5, 10, 6 then your program should print
“Smallest number -5 was found at location 2”.
“Largest number 13 was found at location 1”.
*/

import java.util.Scanner;
public class task03{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[5];
  
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz [i]=sc.nextInt();
    }
    
    int max=xyz[0];
    int max_index=0;
    int min=xyz[0];
     int min_index=0;
    for(int i=0;i<xyz.length;i++)
      if (xyz[i]>max){
      max=xyz[i]; 
      max_index=i;
    }
    
     for(int i=0;i<xyz.length;i++)
      if (xyz[i]<min){
      min=xyz[i]; 
      min_index=i;
    }
    System.out.println("max value "+max);
    System.out.println("the location is "+max_index);
  
    System.out.println("min value "+min);
    System.out.println("the location is "+min_index);
  
  }
}