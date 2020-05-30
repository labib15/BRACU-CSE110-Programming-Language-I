/*Write a program which asks the user how many numbers to take. Then takes that many numbers and prints the median value. 
 * If the user gives 10, 50, 40, 20, 30. Then the median is 30 (because 30 falls in middle 10, 20, 30, 40, 50)
If the user gives 30, 10, 40, 20. Then the median is 25 because, (20+30)/2=25(average of two middle values from 10, 20, 30, 40)  */

import java.util.Scanner;

public class task06{
  public static void main(String[] args){
    
  Scanner sc=new Scanner(System.in);
 
  System.out.println("Please enter your input numbers,n.");
  int n=sc.nextInt();
  int [ ] xyz=new int [n];
  int z=n/2;
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
  
 
    if(n%2==1)  System.out.println("the median is "+xyz[z]);
   else System.out.println("the median is "+(xyz[z-1]+xyz[z])/2);
 
  sc.close(); 
  }
}
