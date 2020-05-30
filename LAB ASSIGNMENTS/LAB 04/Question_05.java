import java.util.Scanner;

public class Question_05
{
  
  
  public static void main(String[ ]   args)
  {
    int c=1;
    
    for(int n;c<21;c++)
    {  System.out.println("please input your number");
      Scanner sc=new Scanner(System.in);
      
      n=sc.nextInt();
      
      if (n%2==0)
      { System.out.println("the number you entered is  even");
        
      }
      else
      {
        
         System.out.println("the numer you entered is odd");
      }
      sc.close();
    }
  }
  

  
}
