import java.util.Scanner;
public class Question_08 
{
  
  
  public static void main(String[ ]   args)
  { 
     int i=1;
     int c=0;
     
     System.out.println("please input your number, n");
  
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    for(i=1;i<=n;i++)
    { 
        if(n%i==0)
      {
        System.out.println("the factor is "+i);
        c++;
        
      }
      
    }
    System.out.println("the number of factors is "+c);
    
  }

  
}
