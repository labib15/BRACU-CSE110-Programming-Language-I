import java.util.Scanner;
public class Question_10
{
  
  
  public static void main(String[ ]   args)
  { 
     int i=1;
     int c=0;
     
     System.out.println("please input your number");
  
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
    for(i=1;i<=n;i++)
    { 
        if(n%i==0)
      {
       
        c++;
        
      }
      
    }
   if(c==2)
   {
     System.out.println("it is a prime number");
   }
    else
    {
      System.out.println("it is not a prime number");
    }
 sc.close();
  
  }

  
}
