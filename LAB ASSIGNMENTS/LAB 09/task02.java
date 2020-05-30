/*Write a program which reads 5 numbers into an array and
 prints the largest number and its location in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print
“largest number 13 was found at location 1”.
*/

import java.util.Scanner;
public class task02{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[4];
  
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz [i]=sc.nextInt();
    }
    
    int max=xyz[0];
    int max_index=0;
    for(int i=0;i<xyz.length;i++)
      if (xyz[i]>max){
      max=xyz[i]; 
      max_index=i;
    }
    System.out.println("max value "+max);
    System.out.println("the location is "+max_index);
  }
}