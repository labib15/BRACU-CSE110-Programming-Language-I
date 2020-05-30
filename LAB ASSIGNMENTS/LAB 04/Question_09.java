import java.util.Scanner;
public class Question_09
{
  
  
  public static void main(String[ ]   args)
  { 
     int i=1;
     int c=0;
     int sum=0;
     System.out.println("please input your number, n");
  
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    for(i=1;i<n;i++)
    { 
        if(n%i==0)
      {
        sum=sum+i;
        c++;
        
      }
      
    }
    if (sum==n)
    {
      System.out.println("it is a perfect number");
      
         }
    else
    {
      System.out.println("it is a not a perfect number");
    }
    sc.close();
  }

}
