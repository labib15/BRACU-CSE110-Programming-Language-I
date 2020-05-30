//Write a java program that reads 10 numbers from the user, 
//but does not allow the user to enter duplicates. This means that if a number has been entered already,
//the program will not accept it as input again and instead ask the user to enter a different number.



import java.util.Scanner;

public class Q11{
  public static void main(String[ ]  args){
    
    Scanner sc=new Scanner(System.in);
    int [ ] xyz=new int[10];
    int c;
    for(int i=0;i<xyz.length;i++) {
      System.out.println("please input your integer,n");
     int n=sc.nextInt();
      c=0;
      
      for(int j=0;j<i;j++){
        if(n==xyz[j])
        {c++;
       
        }
      }
      if (c==0) xyz[i]=n;
       else i--;
          
       
       
    }

    for(int j=0;j<xyz.length;j++) System.out.println(xyz[j]);
}
}