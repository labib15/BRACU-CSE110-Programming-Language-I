//Write a java program that reads 10 numbers from the user and prints the last even number in the list.


import java.util.Scanner;

public class Q07{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
    
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer");
      xyz[i]=sc.nextInt();
      
    }
    for(int k=xyz.length-1;k>=0;k--) if(xyz[k]%2==0){
      System.out.println("the last even number from the list is "+xyz[k]);
      break;
    }
    sc.close();  
  }
}