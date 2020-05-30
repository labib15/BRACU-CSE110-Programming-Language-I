/*Write a java program that reads 10 numbers from the user, and then prints only the even numbers and their positions in reverse order.
Sample Input:
11  13  12  16  61  40
Sample Output:
40   5
16   3
12   2
*/

import java.util.Scanner;
public class Q12{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
  
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz [i]=sc.nextInt();
    }
    
    
    for(int j=xyz.length-1;j>=0;j--){
      if (xyz[j]%2==0){
        System.out.print(xyz[j]+" ");
      System.out.println(j);
      }
     }
      
  }
}