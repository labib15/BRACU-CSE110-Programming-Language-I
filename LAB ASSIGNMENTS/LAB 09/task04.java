/*Write a program which reads 5 numbers into an array, sorts/arranges the numbers from low to high and prints all numbers in the array.
If the user enters 7, 13, 2, 10, 6 then your program should print 2, 6, 7, 10, and 13*/


import java.util.Scanner;

public class task04{
  public static void main(String[] args){
    
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  
  int [ ] xyz=new int [n];
   int min; 
  for (int i=0;i<xyz.length;i++){
    System.out.println("Please input your integer,z ");
    xyz[i]=sc.nextInt();
  }
  
  for (int i=0;i<xyz.length;i++){
     min=i;
    int temp=0;
    for(int j=i+1;j<xyz.length;j++){
      if (xyz[j]<xyz[min])  min=j;
     }
    
    temp=xyz[i];
    xyz[i]=xyz[min];
    xyz[min]=temp;
  }
  
   for (int i=0;i<xyz.length;i++)    System.out.println(xyz[i]);
   
  }
}
  
    