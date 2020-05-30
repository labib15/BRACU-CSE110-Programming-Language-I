/*Write a java program that reads 15 numbers from the user, all the numbers within the range 0-9. 
Then print the number of times each number has been entered by the user. You can try this problem in at least 3 ways:
Task 9a) Using nested loop to search within array for each number between 0-9
Task 9b) using ten variables as counter/tally: zerCount, oneCount …., nineCount to count during input
Task 9c) Modify task 9b and use a 2nd array as the counter instead of ten variables      */

import java.util.Scanner;

  public class task09{
  public static void main(String[] args){
    
  Scanner sc=new Scanner(System.in);
  int [ ] xyz=new int [15];
  int c=0;
  for (int i=0;i<xyz.length;i++){
    System.out.println("Please input your integer between 0 and 9,z ");
    xyz[i]=sc.nextInt();
    }

  for (int j=0;j<=9;j++){
   
    c=0;
   
    for (int i=0;i<xyz.length;i++)     if(xyz[i]==j) c++;
   
    System.out.println(j+"has been entered "+c+" times by the user.");    
  }
  
  sc.close();
  }
}
  