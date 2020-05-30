/*Create a String array (size 10) consisting of the words “zero”, “one”, “two”……, “nine”
 * Then take a number (between 0 and 9) from the user and print that number in words from the array.
 * If the user enters 5, you should print a[5] and output should be “five”.  */

import java.util.Scanner;

public class task08{
  public static void main(String[] args){
    
  Scanner sc=new Scanner(System.in);
 
  String [] xyz={"zero","one","two","three","four","five","six","seven","eight","nine"};
  
  System.out.print("please input your integer");
  
  
    int n=sc.nextInt();
    
 
    System.out.print(xyz[n]);
    
  }
}