/*Write a program which reads 5 numbers into an array, sorts/arranges the numbers from high to low and prints all numbers in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print 13, 10, 7, 6, 2.  */

import java.util.Scanner;

public class task05{
  public static void main(String[] args){
    
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  
  int [ ] xyz=new int [n];
   int max; 
  for (int i=0;i<xyz.length;i++){
    System.out.println("Please input your integer,z ");
    xyz[i]=sc.nextInt();
  }
  
  for (int i=0;i<xyz.length;i++){
     max=i;
    int temp=0;
    for(int j=i+1;j<xyz.length;j++){
      if (xyz[j]>xyz[max])  max=j;
     }
    
    temp=xyz[i];
    xyz[i]=xyz[max];
    xyz[max]=temp;
  }
  
   for (int i=0;i<xyz.length;i++)    System.out.println(xyz[i]);
   
  }
}
  
