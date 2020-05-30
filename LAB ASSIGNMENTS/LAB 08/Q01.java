//Write a java program that would input three numbers from the user and print sum, then the first number, then the 2nd number followed by 3rd number.
//If user enters 10, 20, 30. Then output should be 60, 10, 20, and 30.


import java.util.Scanner;

public class Q01{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[3];
    
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz[i]=sc.nextInt();
      
    }
    int sum=0;
    
    for(int j=0;j<xyz.length;j++) sum+=xyz[j];
    
    System.out.println("sum "+sum);
    
    for(int k=0;k<xyz.length;k++)  System.out.println(xyz[k]);
    
    
    sc.close();
    
    
  }
}
  